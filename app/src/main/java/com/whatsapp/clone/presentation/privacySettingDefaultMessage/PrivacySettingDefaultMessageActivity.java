package com.whatsapp.clone.presentation.privacySettingDefaultMessage;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacyDefaultTime.SettingPrivacyLink;
import com.whatsapp.clone.widgets.settingPrivacyDefaultTime.SettingPrivacyMessage;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.SettingPrivacyLastSeen;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.ui.utils.LastSeenItem;

public class PrivacySettingDefaultMessageActivity extends AppCompatActivity {
    ActionBar actionBar;
    SettingPrivacyLink mSettingPrivacyLink;
    SettingPrivacyMessage mSettingPrivacyMessage;
    SettingPrivacyLastSeen rbHours, rbDays, rbDay, rbOff;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_default_message);
        intiView();
        onActionbarSetup();
        onConfigSetup();

    }

    private void intiView() {
        mSettingPrivacyMessage = findViewById(R.id.message);
        rbHours = findViewById(R.id.rbHours);
        rbDay = findViewById(R.id.rbDay);
        rbDays = findViewById(R.id.rbDays);
        rbOff = findViewById(R.id.rbOff);
        mSettingPrivacyLink = findViewById(R.id.wvDefault);
    }

    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.titleMessageDefault);
        actionBar.setDisplayHomeAsUpEnabled(true);
        Window window= this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green));
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void onConfigSetup() {
        rbHours.setType(LastSeenItem.HOURS);
        rbDays.setType(LastSeenItem.DAYS);
        rbDay.setType(LastSeenItem.DAY);
        rbOff.setType(LastSeenItem.OFF);
    }
}