package com.whatsapp.clone.presentation.privacyProfilePhoto;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.CompoundButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.SettingPrivacyLastSeen;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.ui.utils.LastSeenItem;

public class PrivacyProfilePhotoActivity extends AppCompatActivity {
    ActionBar actionBar;
    SettingPrivacyLastSeen rbEveryone, rbMyContact, rbContactExcept, rbNobody;
    AppCompatTextView tvTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_profile);
        initView();
        initViewWidgets();
        onActionbarSetup();
        onConfigSetup();
        onRadioButtonSetup();
    }

    private void initView() {
        tvTitle = findViewById(R.id.tvTitle);
        rbEveryone = findViewById(R.id.profileEveryone);
        rbMyContact = findViewById(R.id.profileMyContact);
        rbContactExcept = findViewById(R.id.profileContactExcept);
        rbNobody = findViewById(R.id.profileNobody);
    }

    private void initViewWidgets() {
        setTitle(getString(R.string.profiletitle));
    }

    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.profilephoto);
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
