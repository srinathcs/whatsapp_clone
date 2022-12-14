package com.whatsapp.clone.presentation.privacyGroup;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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

public class PrivacyGroupActivity extends AppCompatActivity {
    ActionBar actionBar;
    SettingPrivacyLastSeen rbMyContact, rbContactExcept, rbEveryone;
    AppCompatTextView tvTitle, tvDescription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_groups);
        initView();
        initViewWidgets();
        onActionbarSetup();
        onConfigSetup();
        onRadioButtonSetup();
    }

    private void initView() {
        tvTitle = findViewById(R.id.tvTitle);
        tvDescription = findViewById(R.id.tvDescription);
        rbEveryone = findViewById(R.id.groupEveryone);
        rbMyContact = findViewById(R.id.groupMyContact);
        rbContactExcept = findViewById(R.id.groupContactExcept);
    }

    private void initViewWidgets() {
        setTitle(getString(R.string.groupTitle));
        setDescription(getString(R.string.groupDescription));
    }

    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.titleGroup);
        actionBar.setDisplayHomeAsUpEnabled(true);
        Window window= this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green));
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onConfigSetup() {
        rbMyContact.setType(LastSeenItem.MY_CONTACT);
        rbContactExcept.setType(LastSeenItem.MY_CONTACT_EXCEPT);
        rbEveryone.setType(LastSeenItem.EVERYONE);

    }

    private void setTitle(String title) {
        tvTitle.setText(title);
    }

    private void setDescription(String Description) {
        tvDescription.setText(Description);
    }

    private void onRadioButtonSetup() {
        rbMyContact.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    rbContactExcept.unSelectRadioButton();
                    rbEveryone.unSelectRadioButton();
                }
            }
        });
        rbContactExcept.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    rbMyContact.unSelectRadioButton();
                    rbEveryone.unSelectRadioButton();
                }
            }
        });
        rbEveryone.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    rbMyContact.unSelectRadioButton();
                    rbContactExcept.unSelectRadioButton();
                }
            }
        });
    }
}