package com.whatsapp.clone.presentation.settingSecurity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingSecurity.SecurityFirstWeb;
import com.whatsapp.clone.widgets.settingSecurity.SecuritySecondWeb;

public class SecuritySettingActivity extends AppCompatActivity {
    SecurityFirstWeb mSecurityFirstWeb;
    SecuritySecondWeb mSecuritySecondWeb;
    ActionBar actionBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_security);
        initView();
        onActionbarSetup();
    }

    private void initView() {
        mSecurityFirstWeb = findViewById(R.id.securityFirstWeb);
        mSecuritySecondWeb = findViewById(R.id.securitySecondWeb);
    }

    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.titleSecurity);
        actionBar.setDisplayHomeAsUpEnabled(true);
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            Window window= this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.green));
        }
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
