package com.whatsapp.clone.presentation.chatSettingCardTheme;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;


import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.SettingPrivacyLastSeen;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.ui.utils.LastSeenItem;

public class ChatSettingThemeActivity extends AppCompatActivity {
    AppCompatTextView tvTitle;
    SettingPrivacyLastSeen mSettingPrivacySystem, mSettingPrivacyLight, mSettingPrivacyDark;
    CardView cvChangeTheme;
    AppCompatButton btCancel, btOk;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_card_chat);
        initView();
        onConfig();
    }

    private void initView() {
        tvTitle = findViewById(R.id.tvCardChat);
        cvChangeTheme = findViewById(R.id.cvChangTheme);
        btOk = findViewById(R.id.btOk);
        btCancel = findViewById(R.id.btCancel);
        mSettingPrivacySystem = findViewById(R.id.chatSystem);
        mSettingPrivacyLight = findViewById(R.id.chatLight);
        mSettingPrivacyDark = findViewById(R.id.chatDark);

    }

    private void onConfig() {
        mSettingPrivacyDark.setType(LastSeenItem.DARK);
        mSettingPrivacyLight.setType(LastSeenItem.LIGHT);
        mSettingPrivacySystem.setType(LastSeenItem.SYSTEM_DEFAULT);
    }
}
