package com.whatsapp.clone.presentation.privacyLastSeen;

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


public class PrivacyLastSeenActivity extends AppCompatActivity {
    ActionBar actionBar;
    SettingPrivacyLastSeen rbEveryone, rbMyContact, rbContactExcept, rbNobody;
    AppCompatTextView tvTitle, tvDescription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_lastseen);
        initView();
        initViewWidgets();
        onActionbarSetup();
        onConfigSetup();
        onRadioButtonSetup();
    }

    private void initView() {
        tvTitle = findViewById(R.id.tvTitle);
        tvDescription = findViewById(R.id.tvDescription);
        rbEveryone = findViewById(R.id.rbEveryone);
        rbMyContact = findViewById(R.id.rbMyContact);
        rbContactExcept = findViewById(R.id.rbMyContactExcept);
        rbNobody = findViewById(R.id.rbNobody);
    }

    private void initViewWidgets() {
        setTitle(getString(R.string.tvTitle));
        setDescription(getString(R.string.tvDescription));
    }

    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.title_last_seen);
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

    private void setDescription(String Description) {
        tvDescription.setText(Description);
    }

    private void onRadioButtonSetup(){
        rbEveryone.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    rbMyContact.unSelectRadioButton();
                    rbContactExcept.unSelectRadioButton();
                    rbNobody.unSelectRadioButton();
                }
            }
        });
        rbMyContact.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    rbEveryone.unSelectRadioButton();
                    rbContactExcept.unSelectRadioButton();
                    rbNobody.unSelectRadioButton();
                }
            }
        });
        rbContactExcept.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    rbEveryone.unSelectRadioButton();
                    rbMyContact.unSelectRadioButton();
                    rbNobody.unSelectRadioButton();
                }
            }
        });
        rbNobody.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    rbEveryone.unSelectRadioButton();
                    rbMyContact.unSelectRadioButton();
                    rbContactExcept.unSelectRadioButton();
                }
            }
        });
    }

}