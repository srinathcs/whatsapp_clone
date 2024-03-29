package com.whatsapp.clone.widgets.settingPrivacy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingItemView.listener.ItemClickListener;
import com.whatsapp.clone.widgets.settingPrivacy.ui.utils.PrivacyItem;

public class PrivacyItemView extends LinearLayoutCompat {

    Context mContext;
    AppCompatTextView tvTitle, tvDescription;
    LinearLayoutCompat llParent;
    ItemClickListener mItemClickListener;

    public PrivacyItemView(@NonNull Context mContext) {
        this(mContext, null);
    }

    public PrivacyItemView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PrivacyItemView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
        setupEvent();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.privacy_item, this, true);
        tvTitle = mView.findViewById(R.id.tvTitle);
        llParent = mView.findViewById(R.id.llParent);
        tvDescription = mView.findViewById(R.id.tvDescription);
    }

    private void setupEvent() {
        llParent.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mItemClickListener != null) {
                    mItemClickListener.onClicked();
                }
            }
        });
    }


    public void setTitle(String title) {
        tvTitle.setText(title);
    }

    public void setDescription(String description) {
        tvDescription.setText(description);
    }

    public void setItemClickListener(ItemClickListener listener) {
        this.mItemClickListener = listener;
    }

    public void setType(PrivacyItem type) {
        switch (type) {
            case LAST_SEEN:
                onLastSeenSetup();
                break;
            case PROFILE_PHOTO:
                onProfilePhotoSetup();
                break;
            case ABOUT:
                onAboutSetup();
                break;
            case STATUS:
                onStatusSetup();
                break;
            case GROUPS:
                onGroupSetup();
                break;
            case LIVE_LOCATION:
                onLiveLocationSetup();
                break;
            case BLOCKED_CONTACTS:
                onBlockedContactSetup();
                break;
            case FINGERPRINT_LOCK:
                onFingerPrintLockSetup();
                break;
            case FONT_SIZE:
                onFontSizeSetup();
                break;
            case BACKUP_GOOGLE:
                onBackupGoogleSetup();
                break;
            case GOOGLE_ACCOUNT:
                onGoogleAccountSetup();
                break;
            case NOTIFICATION_TONE_MESSAGE:
                onMessageNotificationSetup();
                break;
            case VIBRATE_MESSAGE:
                onMessageVibrateSetup();
                break;
            case LIGHT_MESSAGE:
                onMessageLightSetup();
                break;
            case NOTIFICATION_TONE_GROUP:
                onGroupNotificationSetup();
                break;
            case VIBRATE_GROUP:
                onGroupVibrateSetup();
                break;
            case LIGHT_GROUP:
                onGroupLightSetup();
                break;
            case RINGTONE_CALL:
                onCallRingtoneSetup();
                break;
            case VIBRATE_CALL:
                onCallVibrateSetUp();
                break;
            case USING_MOBILE_DATA:
                onUsingMobileDataSetup();
                break;
            case CONNECTED_ON_WIFI:
                onConnectedSetup();
                break;
            case ROAMING:
                onRoamingSetup();
                break;
            case UPLOAD_QUALITY:
                onUploadQualitySetup();
                break;
        }
    }

    private void onLastSeenSetup() {
        setTitle(getContext().getString(R.string.last_seen));
        setDescription(getContext().getString(R.string.my_contact));
    }

    private void onProfilePhotoSetup() {
        setTitle(getContext().getString(R.string.profile_photo));
        setDescription(getContext().getString(R.string.my_contact));
    }

    private void onAboutSetup() {
        setTitle(getContext().getString(R.string.about));
        setDescription(getContext().getString(R.string.my_contact));
    }

    private void onStatusSetup() {
        setTitle(getContext().getString(R.string.status));
        setDescription(getContext().getString(R.string.status_contacts));
    }

    private void onGroupSetup() {
        setTitle(getContext().getString(R.string.groups));
        setDescription(getContext().getString(R.string.grp_description));
    }

    private void onLiveLocationSetup() {
        setTitle(getContext().getString(R.string.live_location));
        setDescription(getContext().getString(R.string.location_description));
    }

    private void onBlockedContactSetup() {
        setTitle(getContext().getString(R.string.blocked_contacts));
        setDescription(getContext().getString(R.string.block_description));
    }

    private void onFingerPrintLockSetup() {
        setTitle(getContext().getString(R.string.finger_print));
        setDescription(getContext().getString(R.string.finger_description));
    }

    private void onFontSizeSetup() {
        setTitle(getContext().getString(R.string.fontSize));
        setDescription(getContext().getString(R.string.fontDescription));
    }

    private void onBackupGoogleSetup() {
        setTitle(getContext().getString(R.string.chatBackupData));
        setDescription(getContext().getString(R.string.chatBackupDescription));
    }

    private void onGoogleAccountSetup() {
        setTitle(getContext().getString(R.string.chatGoogleTitle));
        setDescription(getContext().getString(R.string.chatGoogleDescription));
    }

    private void onMessageNotificationSetup() {
        setTitle("Notification tone");
        setDescription("Default(WaterDrop_preview.ogg)");
    }

    private void onMessageVibrateSetup() {
        setTitle("Vibrate");
        setDescription("Default");
    }

    private void onMessageLightSetup() {
        setTitle("Light");
        setDescription("White");
    }

    private void onGroupNotificationSetup() {
        setTitle("Notification tone");
        setDescription("Default(WaterDrop_preview.ogg)");
    }

    private void onGroupVibrateSetup() {
        setTitle("Vibrate");
        setDescription("Default");
    }

    private void onGroupLightSetup() {
        setTitle("Light");
        setDescription("White");
    }

    private void onCallRingtoneSetup() {
        setDescription("Default (Once upon A Time - Vikram ! Anirudh Ravichander ! English song.mp3");
        setTitle("Ringtone");
    }

    private void onCallVibrateSetUp() {
        setTitle("Vibrate");
        setDescription("Default");
    }

    private void onUsingMobileDataSetup() {
        setTitle("When using mobile data");
        setDescription("No media");
    }

    private void onConnectedSetup() {
        setTitle("When connected on Wi-Fi");
        setDescription("No media");
    }

    private void onRoamingSetup() {
        setTitle("When roaming");
        setDescription("No roaming");
    }

    private void onUploadQualitySetup() {
        setTitle("Photo upload quality");
        setDescription("Auto (recommended");
    }
}