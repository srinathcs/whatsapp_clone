package com.whatsapp.clone.widgets.settingItemView.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingItemView.listener.ItemClickListener;
import com.whatsapp.clone.widgets.settingItemView.ui.utils.SettingItemType;

public class SettingItemView extends LinearLayoutCompat {
    private Context mContext;
    private LinearLayoutCompat llParent;
    private AppCompatTextView tvTitle, tvDescription;
    private AppCompatImageView ivIcon;
    private ItemClickListener mItemClickListener;

    public SettingItemView(@NonNull Context mContext) {
        this(mContext, null);
    }

    public SettingItemView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SettingItemView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        intiView();
        setupEvent();
    }

    private void intiView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.view_setting_item, this, true);
        llParent = mView.findViewById(R.id.llParent);
        tvTitle = mView.findViewById(R.id.tvTitle);
        tvDescription = mView.findViewById(R.id.tvDescription);
        ivIcon = mView.findViewById(R.id.ivIcon);

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

    public void setIcon(Drawable drawable) {
        ivIcon.setImageDrawable(drawable);
    }

    public void setItemClickListener(ItemClickListener listener) {
        this.mItemClickListener = listener;
    }

    public void setType(SettingItemType type) {
        switch (type) {
            case ACCOUNT:
                onAccountSetup();
                break;
            case CHAT:
                onChatSetup();
                break;
            case NOTIFICATIONS:
                onNotificationSetup();
                break;
            case STORAGE_DATA:
                onStorageDataSetup();
                break;
            case HELP:
                onHelp();
                break;
            case LAST_BACKUP:
                onLastBackupSetup();
                break;
            case END_TO_END_ENCRYPTED_BACKUP:
                onEndToEndEncryptedSetup();
                break;
            case GOOGLE_DRIVE:
                onGoogleDriveSetup();
                break;
            case MANAGE_STORAGE:
                onManageStorageSetup();
                break;
            case NETWORK_USAGE:
                onNetworkSetup();
                break;
        }

    }

    private void onAccountSetup() {
        setTitle(mContext.getString(R.string.setting_account));
        setDescription(mContext.getString(R.string.setting_account_description));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_key, mContext.getTheme()));
    }

    private void onChatSetup() {
        setTitle(mContext.getString(R.string.setting_chat));
        setDescription(mContext.getString(R.string.setting_chat_description));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_chat, mContext.getTheme()));
    }

    private void onNotificationSetup() {
        setTitle(mContext.getString(R.string.setting_notification));
        setDescription(mContext.getString(R.string.setting_notification_description));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_bell, mContext.getTheme()));
    }

    private void onStorageDataSetup() {
        setTitle(mContext.getString(R.string.setting_data));
        setDescription(mContext.getString(R.string.setting_data_description));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_storage, mContext.getTheme()));
    }

    private void onHelp() {
        setTitle(mContext.getString(R.string.setting_help));
        setDescription(mContext.getString(R.string.setting_help_description));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_help, mContext.getTheme()));
    }

    private void onLastBackupSetup() {
        setTitle(getContext().getString(R.string.chatBackupTitle));
        setDescription(getContext().getString(R.string.chatBackupDecription));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_cloud_backup, mContext.getTheme()));
    }

    private void onEndToEndEncryptedSetup() {
        setTitle(getContext().getString(R.string.chatEndToEndTitle));
        setDescription(getContext().getString(R.string.chatEndToEndDescription));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_lock, mContext.getTheme()));
    }

    private void onGoogleDriveSetup() {
        setTitle(getContext().getString(R.string.chatGoogleDriveTitle));
        setDescription(getContext().getString(R.string.chatGoogleDriveDescription));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_drive, mContext.getTheme()));
    }

    private void onManageStorageSetup() {
        setTitle("Manage storage");
        setDescription("477.5MB");
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_folder, mContext.getTheme()));
    }

    private void onNetworkSetup() {
        setTitle("Network usage");
        setDescription("1.4 GB sent .8.8 GB received");
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_storage, mContext.getTheme()));
    }
}
