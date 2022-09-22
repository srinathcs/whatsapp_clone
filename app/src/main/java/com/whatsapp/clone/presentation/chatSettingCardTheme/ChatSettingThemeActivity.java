package com.whatsapp.clone.presentation.chatSettingCardTheme;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;


import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.SettingPrivacyLastSeen;

public class ChatSettingThemeActivity extends AppCompatActivity {
    AppCompatTextView tvTitle;
    SettingPrivacyLastSeen mSettingPrivacySystem,mSettingPrivacyLight,mSettingPrivacyDark;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_card_chat);
        initView();
        initWidget();
    }

    private void initView() {
        tvTitle=findViewById(R.id.tvcardChat);
        mSettingPrivacySystem=findViewById(R.id.chatSystem);
        mSettingPrivacyLight=findViewById(R.id.chatLight);
        mSettingPrivacyDark=findViewById(R.id.chatDark);
    }
    private void initWidget(){
        setTitle("Choose default");
    }
    public void setTitle(String title){
        tvTitle.setText(title);
    }
}
