package com.whatsapp.clone.presentation.Setting;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.whatsapp.clone.R;
import com.whatsapp.clone.Widgets.shortUserInfo.ShortUserInfo;

public class SettingActivity extends AppCompatActivity {
    private ShortUserInfo mShortInfo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        onConfigActionBar();
        initViews();
    }

    private void initViews() {
    mShortInfo=findViewById(R.id.userInfo);
    mShortInfo.setTitle("SRINATH");
    mShortInfo.setDescription("Rest at the end not on the middle ");
    mShortInfo.setProfile();
    mShortInfo.setScan(R.id.ivScan);
    }

    private void onConfigActionBar() {
        ActionBar actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.tbSetting);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
