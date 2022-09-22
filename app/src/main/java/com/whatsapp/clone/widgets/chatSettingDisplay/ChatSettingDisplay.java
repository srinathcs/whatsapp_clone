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
import com.whatsapp.clone.widgets.accountItemView.AccountItemView;
import com.whatsapp.clone.presentation.chatSettingCardTheme.ChatSettingThemeActivity;
import com.whatsapp.clone.widgets.settingItemView.ui.SettingItemView;

public class ChatSettingDisplay extends LinearLayoutCompat {
    Context mContext;
    SettingItemView mSettingItemView;
    AccountItemView mAccountItemView;
    AppCompatTextView tvTitle;
    public ChatSettingDisplay(@NonNull Context mContext) {
        this(mContext,null);
    }

    public ChatSettingDisplay(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ChatSettingDisplay(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        initView();
        initWidget();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView=inflater.inflate(R.layout.setting_chat_display,this,true);
        mSettingItemView=mView.findViewById(R.id.chatTheme);
        mAccountItemView=mView.findViewById(R.id.chatWallpaper);
        tvTitle=mView.findViewById(R.id.tvTitle);
    }

    private void initWidget(){
        setTitle("Display");
        mSettingItemView.setTitle("Theme");
        mSettingItemView.setDescription("System default");
        mSettingItemView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatSettingDisplay.this, ChatSettingThemeActivity.class);
                startActivity(intent);
            }
        });
        mSettingItemView.setIcon(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_brightness, mContext.getTheme()));
        mAccountItemView.setTitle("Wallpaper");
        mAccountItemView.setIcon(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_wallpaper, mContext.getTheme()));
    }

    public void setTitle(String title){
        tvTitle.setText(title);
    }
}
