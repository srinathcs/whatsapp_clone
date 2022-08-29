package com.whatsapp.clone.presentation.setting;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingInviteView.SettingInviteView;
import com.whatsapp.clone.widgets.settingItemMeta.SettingItemMeta;
import com.whatsapp.clone.widgets.settingItemView.listener.ItemClickListener;
import com.whatsapp.clone.widgets.settingItemView.ui.SettingItemView;
//import com.whatsapp.clone.widgets.settingItemView.ui.utils.SettingItemType;
import com.whatsapp.clone.widgets.userInfo.UserInfoView;

public class SettingActivity extends AppCompatActivity {
    private UserInfoView mUserInfo;
    private SettingItemView mItemView, mSettingItemViewChat, mItemViewNotification, mItemViewData, mItemViewHelp;
    private SettingInviteView mSettingInvite;
    private SettingItemMeta mSettingMeta;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        intiView();
        onActionBarConfig();
        onUserInfoSetup();
        /*onSettingItemViewSetup();
        onSettingChatSetup();
        onSettingNotificationSetup();
        onSettingDataSetup();
        onSettingHelpSetup();*/
        onSettingInviteSetup();
        onSettingMetaSetup();

    }


    private void intiView() {
        mUserInfo = findViewById(R.id.uiProfile);
        mSettingInvite=findViewById(R.id.sInvite);
        mSettingMeta=findViewById(R.id.siMeta);
        mItemView = findViewById(R.id.sivAccount);
        mSettingItemViewChat = findViewById(R.id.sivChat);
        mItemViewNotification = findViewById(R.id.sivNotification);
        mItemViewData = findViewById(R.id.sivData);
        mItemViewHelp = findViewById(R.id.sivHelp);
    }

    private void onActionBarConfig() {
        actionBar = getSupportActionBar();
        if (actionBar != null) {
            ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
            actionBar.setBackgroundDrawable(colorDrawable);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    private void onUserInfoSetup() {
        mUserInfo.setTitle(getString(R.string.name));
        mUserInfo.setDescription(getString(R.string.user_description));
        mUserInfo.setImageProfile(ResourcesCompat.getDrawable(getResources(), R.drawable.ktm, getTheme()));
    }

    /*private void onSettingItemViewSetup() {
        mItemView.setType(SettingItemType.ACCOUNT);
        mItemView.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                Toast.makeText(SettingActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void onSettingChatSetup() {
        mSettingItemViewChat.setType(SettingItemType.CHAT);
    }

    private void onSettingNotificationSetup() {
        mItemViewNotification.setType(SettingItemType.NOTIFICATIONS);
    }

    private void onSettingDataSetup() {
        mItemViewData.setType(SettingItemType.STORAGE_DATA);
    }

    private void onSettingHelpSetup() {
        mItemViewHelp.setType(SettingItemType.HELP);
    }*/
    private void onSettingInviteSetup() {
        mSettingInvite.setIcon(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_friend,getTheme()));
        mSettingInvite.setTitle(getString(R.string.setting_invite));
    }
    private void onSettingMetaSetup(){
        mSettingMeta.setTvTitle(getString(R.string.meta_title) );
        mSettingMeta.setTvDescription(getString(R.string.meta_descrpiton));
    }

}
