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
}
