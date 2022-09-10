package com.whatsapp.clone.widgets.settingPrivacyDefaultTime;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.whatsapp.clone.R;

public class SettingPrivacyLink extends LinearLayoutCompat {
    Context mContext;
    WebView wvDefaultMessage;


    public SettingPrivacyLink(@NonNull Context mContext) {
        this(mContext, null);
    }

    public SettingPrivacyLink(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SettingPrivacyLink(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
        initWidget();

    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.private_default_message_textlink, this, true);
        wvDefaultMessage = mView.findViewById(R.id.wvDefaultMessage);
    }

    private void initWidget() {
        wvDefaultMessage.getSettings().setJavaScriptEnabled(true);
        wvDefaultMessage.setWebViewClient(new WebViewClient());
        wvDefaultMessage.loadUrl("https://stackoverflow.com/questions/6206245/how-to-programmatically-set-edit-content-of-webview");
    }
}
