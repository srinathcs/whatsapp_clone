package com.whatsapp.clone.presentation.privacySettingReadReceipts;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacy.ReadReceipts;

public class PrivacySettingReadReceipts extends AppCompatActivity {
    ReadReceipts mReadReceipts;
    ActionBar actionBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_readreceipts);
        initView();
        onActionBarConfig();
    }

    private void initView() {
        mReadReceipts = findViewById(R.id.readReceipt);
    }
    private void onActionBarConfig(){
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.fingerprintTitlebar);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
