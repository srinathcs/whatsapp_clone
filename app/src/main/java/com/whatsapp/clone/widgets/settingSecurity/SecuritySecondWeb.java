package com.whatsapp.clone.widgets.settingSecurity;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;

import com.whatsapp.clone.R;

public class SecuritySecondWeb extends LinearLayoutCompat {
    Context mContext;
    AppCompatTextView tvTitle;
    SwitchCompat swSwitch;
    WebView mWebView;

    public SecuritySecondWeb(@NonNull Context mContext) {
        this(mContext, null);
    }

    public SecuritySecondWeb(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SecuritySecondWeb(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
        initWidget();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.setting_security_switch, this, true);
        tvTitle = mView.findViewById(R.id.securityTitle);
        swSwitch = mView.findViewById(R.id.scSecurity);
        mWebView = mView.findViewById(R.id.securitySecondLink);

    }

    public void initWidget() {
        setTitle(getContext().getString(R.string.securityTitle));
        String str = "";
        str += "<font color='gray'>" + "Get notified when your security code changes for a contact's phone in an end-to-end encrypted chat.If you have multiple devices, this setting must be enabled on each device where you want to get notifications.";
        str += "<a href=\"https://faq.whatsapp.com/2974126929583030/?locale=en_US\"> <font color='027eb5'> Learn more</a></font>";
        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadData(str, "text/html", "UTF-8");
        mWebView.setVerticalScrollBarEnabled(false);
        mWebView.getSettings().setTextZoom(90);
    }

    public void setTitle(String title) {
        tvTitle.setText(title);
    }
}
