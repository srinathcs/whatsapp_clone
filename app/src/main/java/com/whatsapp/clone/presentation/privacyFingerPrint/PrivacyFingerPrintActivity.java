package com.whatsapp.clone.presentation.privacyFingerPrint;



import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacy.ReadReceipts;

public class PrivacyFingerPrintActivity extends AppCompatActivity {
    ActionBar actionBar;
    ReadReceipts mReadReceipts;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_fingerprint);
        initView();
        onActionBarConfig();
        initWidget();
    }

    private void initView() {
        mReadReceipts=findViewById(R.id.fingerPrint);
    }
    private void initWidget() {
        mReadReceipts.setTitle(getString(R.string.fingerprintTitle));
        mReadReceipts.setDescription(getString(R.string.fingerprintDescription));
    }
    private void onActionBarConfig(){
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.fingerprintTitlebar);
        actionBar.setDisplayHomeAsUpEnabled(true);
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