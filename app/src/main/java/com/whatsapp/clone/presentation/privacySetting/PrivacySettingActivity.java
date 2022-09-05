package com.whatsapp.clone.presentation.privacySetting;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacy.DisappearingMessage;
import com.whatsapp.clone.widgets.settingPrivacy.PersonalInfo;
import com.whatsapp.clone.widgets.settingPrivacy.PrivacyItemView;
import com.whatsapp.clone.widgets.settingPrivacy.ReadReceipts;
import com.whatsapp.clone.widgets.settingPrivacy.ui.utils.PrivacyItem;

public class PrivacySettingActivity extends AppCompatActivity {
    private PersonalInfo mPersonalInfo;
    private PrivacyItemView mPrivacyItemLastSeen, mPrivacyItemProfile, mPrivacyItemAbout, mPrivateItemStatus, mPrivacyItemGroups, mPrivacyItemLiveLocation, mPrivacyItemBlockContact, mPrivacyFingerPrint;
    private ReadReceipts mReadReceipts;
    private DisappearingMessage mDisappearingMessage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_privacy);
        initView();
        onMyPersonInfo();
        onReadReceipts();
        onDisappearingSetup();
        onConfigSetup();
    }

    private void initView() {
        mPersonalInfo = findViewById(R.id.privacy_personal);
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

    private void onMyPersonInfo() {
        mPersonalInfo.setTitle(getString(R.string.disappearing_title));
        mPersonalInfo.setDescription(getString(R.string.personal_info_descrp));
    }

    private void onReadReceipts() {
        mReadReceipts.SetTitle(getString(R.string.read_receipts));
        mReadReceipts.SetDescription(getString(R.string.read_receipts_description));
    }

    private void onDisappearingSetup() {
        mDisappearingMessage.setDisappearing(getString(R.string.disappearing));
        mDisappearingMessage.setTitle(getString(R.string.disappearing_title));
        mDisappearingMessage.setDescription(getString(R.string.disappearing_description));
        mDisappearingMessage.setEvent(getString(R.string.disappearing_event));
    }

}