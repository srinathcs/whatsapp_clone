package com.whatsapp.clone.widgets.chatSettingDisplay;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.presentation.settingWallpaper.SettingWallpaperActivity;
import com.whatsapp.clone.widgets.accountItemView.AccountItemView;
import com.whatsapp.clone.widgets.settingItemView.listener.ItemClickListener;
import com.whatsapp.clone.widgets.settingItemView.ui.SettingItemView;

public class ChatSettingDisplay extends LinearLayoutCompat {
    LinearLayoutCompat llParent;
    Context mContext;
    SettingItemView mSettingItemView;
    AccountItemView mAccountItemView;
    AppCompatTextView tvTitle;

    public ChatSettingDisplay(@NonNull Context mContext) {
        this(mContext, null);
    }

    public ChatSettingDisplay(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ChatSettingDisplay(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
        initWidget();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.setting_chat_display, this, true);
        llParent = mView.findViewById(R.id.llParent);
        mSettingItemView = mView.findViewById(R.id.chatTheme);
        mAccountItemView = mView.findViewById(R.id.chatWallpaper);
        tvTitle = mView.findViewById(R.id.tvTitle);
    }

    public void initWidget() {
        setTitle("Display");
        mSettingItemView.setTitle("Theme");
        mSettingItemView.setDescription("System default");
        mSettingItemView.setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_brightness, mContext.getTheme()));
        mAccountItemView.setTitle("Wallpaper");
        mAccountItemView.setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_wallpaper, mContext.getTheme()));
    }

    public void setTitle(String title) {
        tvTitle.setText(title);
    }
}
