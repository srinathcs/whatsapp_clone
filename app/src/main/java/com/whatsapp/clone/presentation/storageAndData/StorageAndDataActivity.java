package com.whatsapp.clone.presentation.storageAndData;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentTransaction;

import com.whatsapp.clone.R;
import com.whatsapp.clone.presentation.storageAndDataFragment.StorageAndDataFragment;
import com.whatsapp.clone.widgets.settingItemView.listener.ItemClickListener;
import com.whatsapp.clone.widgets.settingItemView.ui.SettingItemView;
import com.whatsapp.clone.widgets.settingItemView.ui.utils.SettingItemType;
import com.whatsapp.clone.widgets.settingPrivacy.PrivacyItemView;
import com.whatsapp.clone.widgets.settingPrivacy.ui.utils.PrivacyItem;
import com.whatsapp.clone.widgets.textAndSwitch.TextAndSwitch;

public class StorageAndDataActivity extends AppCompatActivity {
    ActionBar actionBar;
    SettingItemView mStorageManage, mStorageNetwork;
    TextAndSwitch mUseLessData;
    AppCompatTextView tvStorageAutoTitle, tvStorageAutoDescription, tvStorageUploadTitle, tvStorageUploadDescription;
    PrivacyItemView mStorageMobile, mStorageWIFI, mStorageRoaming, mStoragePhoto;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_and_data);
        initView();
        initWidget();
        onActionbarSetup();
        onConfigSetup();
    }

    private void initView() {
        mStorageManage = findViewById(R.id.storageManage);
        mStorageNetwork = findViewById(R.id.storageNetWork);
        mStorageMobile = findViewById(R.id.storageMobile);
        mStorageWIFI = findViewById(R.id.storageWIFI);
        mStorageRoaming = findViewById(R.id.storageRoaming);
        mStoragePhoto = findViewById(R.id.storagePhoto);
        mUseLessData = findViewById(R.id.storageUseDate);
        tvStorageAutoTitle = findViewById(R.id.tvStorageAutoTitle);
        tvStorageAutoDescription = findViewById(R.id.tvStorageAutoDescription);
        tvStorageUploadTitle = findViewById(R.id.tvStorageUploadTitle);
        tvStorageUploadDescription = findViewById(R.id.tvStorageUploadDescription);
    }

    private void initWidget() {
        mStorageManage.setType(SettingItemType.MANAGE_STORAGE);
        mStorageNetwork.setType(SettingItemType.NETWORK_USAGE);
        mStorageMobile.setType(PrivacyItem.USING_MOBILE_DATA);
        mStorageWIFI.setType(PrivacyItem.CONNECTED_ON_WIFI);
        mStorageRoaming.setType(PrivacyItem.ROAMING);
        mStoragePhoto.setType(PrivacyItem.UPLOAD_QUALITY);
        mUseLessData.setTitle("Use less data for calls");
        setAutoTitle("Media auto-download");
        setAutoDescription("Voice message are always automatically downloaded");
        setUploadTitle("Media upload quality");
        setUploadDescription("Choose the quality of media files tto be sent");
    }
    private void onConfigSetup(){
        mStorageMobile.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                StorageAndDataFragment storageAndDataFragment = new StorageAndDataFragment();
                storageAndDataFragment.show(getSupportFragmentManager(),"example");
            }
        });
        mStorageWIFI.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                StorageAndDataFragment storageAndDataFragment = new StorageAndDataFragment();
                storageAndDataFragment.show(getSupportFragmentManager(),"example");

            }
        });
    }

    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle("Storage and data");
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

    private void setAutoTitle(String autoTitle) {
        tvStorageAutoTitle.setText(autoTitle);
    }

    private void setAutoDescription(String autoDescription) {
        tvStorageAutoDescription.setText(autoDescription);
    }

    private void setUploadTitle(String uploadTitle) {
        tvStorageUploadTitle.setText(uploadTitle);
    }

    private void setUploadDescription(String uploadDescription) {
        tvStorageUploadDescription.setText(uploadDescription);
    }
}