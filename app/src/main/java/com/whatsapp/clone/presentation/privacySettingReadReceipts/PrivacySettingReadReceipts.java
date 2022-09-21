package com.whatsapp.clone.presentation.privacySettingReadReceipts;

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
import com.whatsapp.clone.widgets.settingPrivacy.ReadReceipts;

public class PrivacySettingReadReceipts extends AppCompatActivity {
    ReadReceipts mReadReceipts;
    ActionBar actionBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_readreceipts);
        initView();
        onActionBarConfig();
    }

    private void initView() {
        mReadReceipts = findViewById(R.id.readReceipt);
    }
    private void onActionBarConfig(){
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.fingerprintTitlebar);
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
