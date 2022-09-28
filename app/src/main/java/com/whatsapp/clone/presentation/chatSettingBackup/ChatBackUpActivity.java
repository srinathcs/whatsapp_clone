package com.whatsapp.clone.presentation.chatSettingBackup;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingItemView.ui.SettingItemView;
import com.whatsapp.clone.widgets.settingItemView.ui.utils.SettingItemType;
import com.whatsapp.clone.widgets.settingPrivacy.PrivacyItemView;
import com.whatsapp.clone.widgets.settingPrivacy.ui.utils.PrivacyItem;
import com.whatsapp.clone.widgets.textAndSwitch.TextAndSwitch;

public class ChatBackUpActivity extends AppCompatActivity {
    ActionBar actionBar;
    SettingItemView mSettingLastBackup, mSettingEndToEnd, mSettingGoogleDrive;
    PrivacyItemView mGoogleBackup, mGoogleAccount;
    AppCompatTextView tvTitleTime, tvTitleGoogle;
    AppCompatButton btBackup;
    TextAndSwitch mBackupData, mIncludeVideos;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_chat_backup);
        initView();
        initWidget();
        onActionbarConfig();
    }

    private void initView() {
        mSettingLastBackup = findViewById(R.id.chatLastBackup);
        mSettingEndToEnd = findViewById(R.id.chatEndToEnd);
        mSettingGoogleDrive = findViewById(R.id.chatGoogleDrive);
        mGoogleBackup = findViewById(R.id.chatBackupGoogle);
        mGoogleAccount = findViewById(R.id.chatGoogleAccount);
        tvTitleTime = findViewById(R.id.tvTitleBackup);
        tvTitleGoogle = findViewById(R.id.tvDescriptionBackup);
        btBackup = findViewById(R.id.btBackup);
        mBackupData = findViewById(R.id.chatBackupData);
        mIncludeVideos = findViewById(R.id.chatIncludeVideos);
    }

    private void initWidget() {
        mSettingLastBackup.setTitle(getString(R.string.chatBackupTitle));
        mSettingLastBackup.setDescription(getString(R.string.chatBackupDecription));
        mSettingLastBackup.setType(SettingItemType.LAST_BACKUP);
        mSettingEndToEnd.setType(SettingItemType.END_TO_END_ENCRYPTED_BACKUP);
        mSettingGoogleDrive.setType(SettingItemType.GOOGLE_DRIVE);
        mGoogleBackup.setType(PrivacyItem.BACKUP_GOOGLE);
        mGoogleAccount.setType(PrivacyItem.GOOGLE_ACCOUNT);
        mBackupData.setTitle(getString(R.string.chatBackupDataCell));
        mIncludeVideos.setTitle(getString(R.string.chatBackupVideos));
        setTitle(getString(R.string.chatBackupTime));
        setTitleVideos(getString(R.string.chatBackupTiming));
    }

    private void onActionbarConfig() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.chatTitle);
        actionBar.setDisplayHomeAsUpEnabled(true);
        Window window = this.getWindow();
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

    private void setTitle(String title) {
        tvTitleTime.setText(title);
    }

    private void setTitleVideos(String titleVideos) {
        tvTitleGoogle.setText(titleVideos);
    }
}
