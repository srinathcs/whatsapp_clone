package com.whatsapp.clone.presentation.privacyLastSeen;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.SettingPrivacyLastSeen;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.ui.utils.LastSeenItem;


public class PrivacyLastSeenActivity extends AppCompatActivity {
    ActionBar actionBar;
    SettingPrivacyLastSeen rb_mEveryone, rb_mMyContact, rb_mMyContactExcept, rb_mNobody;
    AppCompatTextView tvTitle, tvDescription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_lastseen);
        initView();
        initViewWidgets();
        onActionbarSetup();
        onConfigSetup();
        onRadioButtonClicked();
    }

    private void initView() {
        tvTitle = findViewById(R.id.tvTitle);
        tvDescription = findViewById(R.id.tvDescription);
        rb_mEveryone = findViewById(R.id.rbEveryone);
        rb_mMyContact = findViewById(R.id.rbMyContact);
        rb_mMyContactExcept = findViewById(R.id.rbMyContactExcept);
        rb_mNobody = findViewById(R.id.rbNobody);
    }

    private void initViewWidgets() {
        setTvTitle(getString(R.string.tvTitle));
        setTvDescription(getString(R.string.tvDescription));
    }

    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.title_last_seen);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public void onConfigSetup() {
        rb_mEveryone.setType(LastSeenItem.EVERYONE);
        rb_mMyContact.setType(LastSeenItem.MY_CONTACT);
        rb_mMyContactExcept.setType(LastSeenItem.MY_CONTACT_EXCEPT);
        rb_mNobody.setType(LastSeenItem.NOBODY);

    }

    public void setTvTitle(String title) {
        tvTitle.setText(title);
    }

    public void setTvDescription(String Description) {
        tvDescription.setText(Description);
    }

    public void onRadioButtonClicked() {
        rb_mEveryone.setOnClickListener(this::onClick);
        rb_mMyContact.setOnClickListener(this::onClick);
        rb_mMyContactExcept.setOnClickListener(this::onClick);
        rb_mNobody.setOnClickListener(this::onClick);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rbEveryone:
                rb_mEveryone.setSelected(true);
                rb_mMyContact.setSelected(false);
                rb_mMyContactExcept.setSelected(false);
                rb_mNobody.setSelected(false);
                break;
            case R.id.rbMyContact:
                rb_mEveryone.setSelected(false);
                rb_mMyContact.setSelected(true);
                rb_mMyContactExcept.setSelected(false);
                rb_mNobody.setSelected(true);
                break;
            case R.id.rbMyContactExcept:
                rb_mEveryone.setSelected(false);
                rb_mMyContact.setSelected(false);
                rb_mMyContactExcept.setSelected(true);
                rb_mNobody.setSelected(false);
                break;
            case R.id.rbNobody:
                rb_mEveryone.setSelected(false);
                rb_mMyContact.setSelected(false);
                rb_mMyContactExcept.setSelected(false);
                rb_mNobody.setSelected(true);
                break;
        }
    }
}