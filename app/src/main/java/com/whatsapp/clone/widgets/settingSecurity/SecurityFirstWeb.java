package com.whatsapp.clone.widgets.settingSecurity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class SecurityFirstWeb extends LinearLayoutCompat {
    Context mContext;
    CircleImageView civIcon;
    WebView mWebView;

    public SecurityFirstWeb(@NonNull Context mContext) {
        this(mContext, null);
    }

    public SecurityFirstWeb(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SecurityFirstWeb(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
        initWidget();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.setting_security, this, true);
        civIcon = mView.findViewById(R.id.civSecurity);
        mWebView = mView.findViewById(R.id.securityFirstLink);

    }

    private void initWidget() {
        SetIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_shield_lock, mContext.getTheme()));
        String str = " ";
        str += "<font color='black'>" + "Message and calls in en-to-end encrypted chats stay between you and the people you choose.Not even WhatsApp can read or listen to them.</font>";
        str += "<a href=\"https://www.whatsapp.com/security?lg=en&lc=IN&eea=0\"> <font color='027eb5'>Learn more</a></font>";
        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadData(str, "text/html", "UTF-8");
        mWebView.setVerticalScrollBarEnabled(false);
        mWebView.getSettings().setTextZoom(98);

    }

    public void SetIcon(Drawable drawable) {
        civIcon.setImageDrawable(drawable);
    }
}