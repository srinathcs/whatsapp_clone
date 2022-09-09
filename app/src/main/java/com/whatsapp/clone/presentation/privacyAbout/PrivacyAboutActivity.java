package com.whatsapp.clone.presentation.privacyAbout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.CompoundButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.SettingPrivacyLastSeen;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.ui.utils.LastSeenItem;

public class PrivacyAboutActivity extends AppCompatActivity {
    ActionBar actionBar;
    SettingPrivacyLastSeen rbEveryone, rbMyContact, rbContactExcept, rbNobody;
    AppCompatTextView tvTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_about);
        initView();
        initViewWidgets();
        onActionbarSetup();
        onConfigSetup();
        onRadioButtonSetup();
    }

    private void initView() {
        tvTitle = findViewById(R.id.tvTitle);
        rbEveryone = findViewById(R.id.aboutEveryone);
        rbMyContact = findViewById(R.id.aboutMyContact);
        rbContactExcept = findViewById(R.id.aboutContactExcept);
        rbNobody = findViewById(R.id.aboutNobody);
    }

    private void initViewWidgets() {
        setTitle(getString(R.string.titleAbout));
    }

    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.aboutTitle);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public void onConfigSetup() {
        rbEveryone.setType(LastSeenItem.EVERYONE);
        rbMyContact.setType(LastSeenItem.MY_CONTACT);
        rbContactExcept.setType(LastSeenItem.MY_CONTACT_EXCEPT);
        rbNobody.setType(LastSeenItem.NOBODY);
    }

    private void setTitle(String title) {
        tvTitle.setText(title);
    }

    private void onRadioButtonSetup() {
        rbEveryone.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    rbMyContact.unSelectRadioButton();
                    rbContactExcept.unSelectRadioButton();
                    rbNobody.unSelectRadioButton();
                }
            }
        });
        rbMyContact.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    rbEveryone.unSelectRadioButton();
                    rbContactExcept.unSelectRadioButton();
                    rbNobody.unSelectRadioButton();
                }
            }
        });
        rbContactExcept.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    rbEveryone.unSelectRadioButton();
                    rbMyContact.unSelectRadioButton();
                    rbNobody.unSelectRadioButton();
                }
            }
        });
        rbNobody.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    rbEveryone.unSelectRadioButton();
                    rbMyContact.unSelectRadioButton();
                    rbContactExcept.unSelectRadioButton();
                }
            }
        });
    }
}
