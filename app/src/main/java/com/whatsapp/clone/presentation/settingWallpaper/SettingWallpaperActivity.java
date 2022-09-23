package com.whatsapp.clone.presentation.settingWallpaper;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;

public class SettingWallpaperActivity extends AppCompatActivity {
    ActionBar actionBar;
    AppCompatImageView ivTheme;
    AppCompatButton btChange;
    AppCompatTextView tvDescription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_chat_wallpaper);
        initView();
        initWidget();
        onActionbarConfig();
    }

    private void initView() {
        ivTheme = findViewById(R.id.ivLightTheme);
        btChange = findViewById(R.id.btChange);
        tvDescription = findViewById(R.id.tvDescription);
    }

    private void initWidget() {
        setImage(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_wallpaper_chat, getTheme()));
        setDescription(getString(R.string.chat_wallpaper));
    }
    private void onActionbarConfig() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.titleTheme);
        actionBar.setDisplayHomeAsUpEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.green));
        }
    }

    public void setImage(Drawable drawable) {
        ivTheme.setImageDrawable(drawable);
    }

    public void setDescription(String description) {
        tvDescription.setText(description);
    }
}