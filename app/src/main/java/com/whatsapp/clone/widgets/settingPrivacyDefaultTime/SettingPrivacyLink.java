package com.whatsapp.clone.widgets.settingPrivacyDefaultTime;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

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
        String str = " ";
        str += "<font color='gray'>" +"When enabled all new individual chats will start with disappearing messages set it the selected duration.This setting will not affect your existing chats.</font>";
        str += "<a href=\"https://faq.whatsapp.com/2739621239657218/?locale=en_US\"> <font color='027eb5'> Learn more</a></font>";
        wvDefaultMessage.setWebChromeClient(new WebChromeClient());
        wvDefaultMessage.getSettings().setJavaScriptEnabled(true);
        wvDefaultMessage.loadData(str, "text/html", "UTF-8");
        wvDefaultMessage.setVerticalScrollBarEnabled(false);

        wvDefaultMessage.getSettings().setTextZoom(85);

    }
}