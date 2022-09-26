package com.whatsapp.clone.presentation.chatSettingBackup;

import android.os.Bundle;

import androidx.annotation.Nullable;
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
    SettingItemView mSettingLastBackup,mSettingEndToEnd,mSettingGoogleDrive;
    PrivacyItemView mBackup,mGoogleAccount;
    AppCompatTextView tvTitleTime,tvTitleGoogle;
    AppCompatButton btBackup;
    TextAndSwitch mBackupData,mIncludeVideos ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_chat_backup);
        initView();
        initWidget();
    }

    private void initView() {
        mSettingLastBackup = findViewById(R.id.chatLastBackup);
        mSettingEndToEnd= findViewById(R.id.chatEndToEnd);
        mSettingGoogleDrive= findViewById(R.id.chatGoogleDrive);
        mBackup= findViewById(R.id.chatBackupGoogle);
        mGoogleAccount= findViewById(R.id.chatGoogleAccount);
        tvTitleTime= findViewById(R.id.tvTitle);
        tvTitleGoogle = findViewById(R.id.tvDescription);
        btBackup = findViewById(R.id.btBackup);
        mBackupData = findViewById(R.id.chatBackupData);
        mIncludeVideos = findViewById(R.id.chatIncludeVideos);
    }
    private void initWidget(){
        mSettingLastBackup.setType(SettingItemType.LAST_BACKUP);
        mSettingEndToEnd.setType(SettingItemType.END_TO_END_ENCRYPTED_BACKUP);
        mSettingGoogleDrive.setType(SettingItemType.GOOGLE_DRIVE);
        mBackup.setType(PrivacyItem.GOOGLE_ACCOUNT);
        mGoogleAccount.setType(PrivacyItem.GOOGLE_ACCOUNT);
        mBackupData.setTitle(getString(R.string.chatBackupDataCell));
        mIncludeVideos.setTitle(getString(R.string.chatBackupVideos));
        setTitle("Local: 8:09 am");
        setTitleVideos("Google Drive: Never");
    }
    private void setTitle(String title) {
        tvTitleTime.setText(title);
    }
    private void setTitleVideos(String titleVideos){
        tvTitleGoogle.setText(titleVideos);
    }
}
