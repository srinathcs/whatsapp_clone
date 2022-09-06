package com.whatsapp.clone.presentation.privacyLastSeen;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.SettingPrivacyLastSeen;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.ui.utils.LastSeenItem;


public class PrivacyLastSeenActivity extends AppCompatActivity {
    private SettingPrivacyLastSeen mLastSeenEveryone, mLastSeenMyContact, mLastSeenMyContactExcept, mLastSeenNobody;
    AppCompatRadioButton rbEveryone, rbMyContact, rbMyContactExcept, rbNobody;
    ActionBar actionBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_lastseen);
        initView();
        onActionbarSetup();
        onConfigSetup();
    }

    private void initView() {
        rbEveryone = findViewById(R.id.rbEveryone);
        rbMyContact = findViewById(R.id.rbMyContact);
        rbMyContactExcept = findViewById(R.id.rbMyContactExcept);
        rbNobody = findViewById(R.id.rbNobody);
    }

    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.title_last_seen);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public void onConfigSetup() {
        rbEveryone.setText(R.string.rb_everyone);
        rbMyContact.setText(R.string.rb_myContacts);
        rbMyContactExcept.setText(R.string.rb_myContacts_excepts);
        rbNobody.setText(R.string.rb_nobody);
    }
}