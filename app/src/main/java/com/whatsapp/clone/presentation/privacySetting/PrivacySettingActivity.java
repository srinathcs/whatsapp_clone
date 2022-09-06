package com.whatsapp.clone.presentation.privacySetting;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacy.DisappearingMessage;
import com.whatsapp.clone.widgets.settingPrivacy.PrivacyItemView;
import com.whatsapp.clone.widgets.settingPrivacy.ReadReceipts;
import com.whatsapp.clone.widgets.settingPrivacy.ui.utils.PrivacyItem;

public class PrivacySettingActivity extends AppCompatActivity {

    private PrivacyItemView mPrivacyItemLastSeen, mPrivacyItemProfile, mPrivacyItemAbout, mPrivateItemStatus, mPrivacyItemGroups, mPrivacyItemLiveLocation, mPrivacyItemBlockContact, mPrivacyFingerPrint;
    private ReadReceipts mReadReceipts;
    private DisappearingMessage mDisappearingMessage;
    ActionBar actionBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_privacy);
        initView();
        onActionbarSetup();
        onConfigSetup();
    }

    private void initView() {

        mPrivacyItemLastSeen = findViewById(R.id.last_seen);
        mPrivacyItemProfile = findViewById(R.id.profile_photo);
        mPrivacyItemAbout = findViewById(R.id.about);
        mPrivateItemStatus = findViewById(R.id.status);
        mReadReceipts = findViewById(R.id.read_receipt);
        mDisappearingMessage = findViewById(R.id.disappearing);
        mPrivacyItemGroups = findViewById(R.id.groups);
        mPrivacyItemLiveLocation = findViewById(R.id.live_location);
        mPrivacyItemBlockContact = findViewById(R.id.block_contact);
        mPrivacyFingerPrint = findViewById(R.id.finger_print);
    }
    private void onActionbarSetup(){
        actionBar=getSupportActionBar();
        ColorDrawable colorDrawable=new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    private void onConfigSetup() {
        mPrivacyItemLastSeen.setType(PrivacyItem.LAST_SEEN);
        mPrivacyItemProfile.setType(PrivacyItem.PROFILE_PHOTO);
        mPrivacyItemAbout.setType(PrivacyItem.ABOUT);
        mPrivateItemStatus.setType(PrivacyItem.STATUS);
        mPrivacyItemGroups.setType(PrivacyItem.GROUPS);
        mPrivacyItemLiveLocation.setType(PrivacyItem.LIVE_LOCATION);
        mPrivacyItemBlockContact.setType(PrivacyItem.BLOCKED_CONTACTS);
        mPrivacyFingerPrint.setType(PrivacyItem.FINGERPRINT_LOCK);
    }
}