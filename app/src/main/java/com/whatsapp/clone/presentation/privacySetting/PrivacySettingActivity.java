package com.whatsapp.clone.presentation.privacySetting;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.whatsapp.clone.R;
import com.whatsapp.clone.presentation.privacyAbout.PrivacyAboutActivity;
import com.whatsapp.clone.presentation.privacyFingerPrint.PrivacyFingerPrintActivity;
import com.whatsapp.clone.presentation.privacyGroup.PrivacyGroupActivity;
import com.whatsapp.clone.presentation.privacyLastSeen.PrivacyLastSeenActivity;
import com.whatsapp.clone.presentation.privacyLiveLocation.PrivacyLiveLocationActivity;
import com.whatsapp.clone.presentation.privacyProfilePhoto.PrivacyProfilePhotoActivity;
import com.whatsapp.clone.presentation.privacySettingDefaultMessage.PrivacySettingDefaultMessageActivity;
import com.whatsapp.clone.presentation.privacySettingReadReceipts.PrivacySettingReadReceipts;
import com.whatsapp.clone.presentation.privacyStatus.PrivacyStatusActivity;
import com.whatsapp.clone.widgets.settingPrivacy.DisappearingMessage;
import com.whatsapp.clone.widgets.settingPrivacy.PrivacyItemView;
import com.whatsapp.clone.widgets.settingPrivacy.ReadReceipts;
import com.whatsapp.clone.widgets.settingPrivacy.ui.utils.PrivacyItem;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.ui.utils.LastSeenItem;

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
        LastSeenRedirection();
        ProfilePhotoRedirection();
        StatusRedirection();
        AboutRedirection();
        DefaultMessageRedirection();
        GroupRedirection();
        LiveLocationRedirection();
        FingerPrintRedirection();
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

    private void LastSeenRedirection() {
        mPrivacyItemLastSeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrivacySettingActivity.this, PrivacyLastSeenActivity.class);
                startActivity(intent);
            }
        });
    }

    private void ProfilePhotoRedirection() {
        mPrivacyItemProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrivacySettingActivity.this, PrivacyProfilePhotoActivity.class);
                startActivity(intent);
            }
        });
    }

    private void AboutRedirection() {
        mPrivacyItemAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrivacySettingActivity.this, PrivacyAboutActivity.class);
                startActivity(intent);
            }
        });
    }

    private void StatusRedirection() {
        mPrivateItemStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrivacySettingActivity.this, PrivacyStatusActivity.class);
                startActivity(intent);
            }
        });
    }

    private void DefaultMessageRedirection() {
        mDisappearingMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrivacySettingActivity.this, PrivacySettingDefaultMessageActivity.class);
                startActivity(intent);
            }
        });
    }

    private void GroupRedirection() {
        mPrivacyItemGroups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrivacySettingActivity.this, PrivacyGroupActivity.class);
                startActivity(intent);
            }
        });
    }

    private void LiveLocationRedirection() {
        mPrivacyItemLiveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrivacySettingActivity.this, PrivacyLiveLocationActivity.class);
                startActivity(intent);
            }
        });
    }
    private void FingerPrintRedirection(){
        mPrivacyFingerPrint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrivacySettingActivity.this, PrivacyFingerPrintActivity.class);
                startActivity(intent);

            }
        });
    }

    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
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