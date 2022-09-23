package com.whatsapp.clone.presentation.settingChat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.whatsapp.clone.R;
import com.whatsapp.clone.presentation.settingWallpaper.SettingWallpaperActivity;
import com.whatsapp.clone.widgets.accountItemView.AccountItemView;
import com.whatsapp.clone.widgets.chatSettingArchived.ChatSettingArchived;
import com.whatsapp.clone.widgets.chatSettingDisplay.ChatSettingDisplay;
import com.whatsapp.clone.widgets.chatSettingItem.ChatSetting;
import com.whatsapp.clone.widgets.settingItemView.listener.ItemClickListener;
import com.whatsapp.clone.widgets.settingItemView.ui.SettingItemView;
import com.whatsapp.clone.widgets.settingchatcarddialog.CardDialog;

public class SettingChatActivity extends AppCompatActivity {
    ActionBar actionBar;
    ChatSettingDisplay mChatSettingDisplay;
    SettingItemView chatTheme;
    AccountItemView chatWallpaper;
    ChatSetting mChatSetting;
    ChatSettingArchived mChatSettingArchived;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_chat);
        initView();
        onActionbarConfig();
        initWidget();
        onWallpaperSetup();
    }

    private void initView() {
        chatTheme = findViewById(R.id.chatTheme);
        chatWallpaper = findViewById(R.id.chatWallpaper);
        mChatSettingDisplay = findViewById(R.id.chatDisplay);
        mChatSetting = findViewById(R.id.chatSetting);
        mChatSettingArchived = findViewById(R.id.chatArchived);
    }

    private void onActionbarConfig() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.chatTitle);
        actionBar.setDisplayHomeAsUpEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.green));
        }
    }

    private void initWidget() {
        chatTheme.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                onPopup();
            }
        });
    }

    private void onPopup() {
        CardDialog dialogFragment = new CardDialog();
        dialogFragment.show(getSupportFragmentManager(), "example");
    }

    private void onWallpaperSetup() {
        chatWallpaper.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                Intent intent = new Intent(SettingChatActivity.this,SettingWallpaperActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}