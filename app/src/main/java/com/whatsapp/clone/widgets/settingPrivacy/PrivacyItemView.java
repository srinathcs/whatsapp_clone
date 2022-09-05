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
import com.whatsapp.clone.widgets.settingPrivacy.ui.utils.PrivacyItem;

public class PrivacyItemView extends LinearLayoutCompat {
    Context mContext;
    AppCompatTextView tvTitle, tvDescription;

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
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.privacy_item, this, true);
        tvTitle = mView.findViewById(R.id.tvTitle);
        tvDescription = mView.findViewById(R.id.tvDescription);
    }

    public void setTvTitle(String title) {
        tvTitle.setText(title);
    }

    public void setTvDescription(String description) {
        tvDescription.setText(description);
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
        }
    }

    private void onLastSeenSetup() {
        setTvTitle(getContext().getString(R.string.last_seen));
        setTvDescription(getContext().getString(R.string.my_contact));
    }

    private void onProfilePhotoSetup() {
        setTvTitle(getContext().getString(R.string.profile_photo));
        setTvDescription(getContext().getString(R.string.my_contact));
    }

    private void onAboutSetup() {
        setTvTitle(getContext().getString(R.string.about));
        setTvDescription(getContext().getString(R.string.my_contact));
    }

    private void onStatusSetup() {
        setTvTitle(getContext().getString(R.string.status));
        setTvDescription(getContext().getString(R.string.status_contacts));
    }

    private void onGroupSetup() {
        setTvTitle(getContext().getString(R.string.groups));
        setTvDescription(getContext().getString(R.string.grp_description));
    }

    private void onLiveLocationSetup() {
        setTvTitle(getContext().getString(R.string.live_location));
        setTvDescription(getContext().getString(R.string.location_description));
    }

    private void onBlockedContactSetup() {
        setTvTitle(getContext().getString(R.string.blocked_contacts));
        setTvDescription(getContext().getString(R.string.block_description));
    }

    private void onFingerPrintLockSetup() {
        setTvTitle(getContext().getString(R.string.finger_print));
        setTvDescription(getContext().getString(R.string.finger_description));
    }
}