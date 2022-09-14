package com.whatsapp.clone.presentation.settingTwoStepVerification;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingTwoStepVerification.SettingTwoStepItem;
import com.whatsapp.clone.widgets.settingTwoStepVerification.SettingTwoStepTop;
import com.whatsapp.clone.widgets.settingTwoStepVerification.ui.utils.TwoStepItem;

public class SettingTwoStepActivity extends AppCompatActivity {
    ActionBar actionBar;
    SettingTwoStepTop mSettingTwoStepTop;
    SettingTwoStepItem mSettingTwoStepDisable, mSettingTwoStepChangePin, mSettingTwoStepChangeEmail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_two_step_verification);
        initView();
        initWidget();
        onActionBarSetup();
    }

    private void initView() {
        mSettingTwoStepTop = findViewById(R.id.twoStepDescription);
        mSettingTwoStepDisable = findViewById(R.id.twoStepDisable);
        mSettingTwoStepChangePin = findViewById(R.id.twoStepChangePin);
        mSettingTwoStepChangeEmail = findViewById(R.id.twoStepChangeEmail);
    }

    private void initWidget() {
        mSettingTwoStepDisable.setType(TwoStepItem.DISABLE);
        mSettingTwoStepChangePin.setType(TwoStepItem.CHANGE_PIN);
        mSettingTwoStepChangeEmail.setType(TwoStepItem.CHANGE_EMAIL_ADDRESS);
    }

    private void onActionBarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.titleSecurity);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
