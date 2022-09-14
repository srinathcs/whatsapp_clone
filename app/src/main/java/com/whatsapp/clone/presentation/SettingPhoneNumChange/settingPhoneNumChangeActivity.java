package com.whatsapp.clone.presentation.SettingPhoneNumChange;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingChangeNumberItem.SettingChangeNumItem;

public class settingPhoneNumChangeActivity extends AppCompatActivity {
    SettingChangeNumItem mSettingChangeNumOld,mSettingChangeNumNew;
    ActionBar actionBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_number_change);
        initView();
        initWidget();
        onActionbarSetup();
    }

    private void initView() {
        mSettingChangeNumOld=findViewById(R.id.oldPhone);
        mSettingChangeNumNew=findViewById(R.id.newPhone);
    }
    private void initWidget(){
        mSettingChangeNumOld.setTitle(getString(R.string.oldTitle));
        mSettingChangeNumNew.setTitle(getString(R.string.newPhoneTitle));
    }
    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.titleChangeNum);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
