package com.whatsapp.clone.presentation.privacyStatus;

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

public class PrivacyStatusActivity extends AppCompatActivity {
    ActionBar actionBar;
    SettingPrivacyLastSeen rbMyContact, rbContactExcept, rbOnlyShare;
    AppCompatTextView tvTitle, tvDescription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_privacy);
        initView();
        initViewWidgets();
        onActionbarSetup();
        onConfigSetup();
        onRadioButtonSetup();
    }

    private void initView() {
        tvTitle = findViewById(R.id.tvTitle);
        tvDescription = findViewById(R.id.tvDescription);
        rbMyContact = findViewById(R.id.statusMyContact);
        rbOnlyShare=findViewById(R.id.statusOnlyShare);
        rbContactExcept = findViewById(R.id.statusContactExcept);

    }

    private void initViewWidgets() {
        setTitle(getString(R.string.statusPrivacyTitle));
        setDescription(getString(R.string.statusPrivacyDescription));
    }

    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.statusPrivacy);
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
        rbMyContact.setType(LastSeenItem.MY_CONTACT);
        rbContactExcept.setType(LastSeenItem.MY_CONTACT_EXCEPT);
        rbOnlyShare.setType(LastSeenItem.ONLY_SHARE_WITH);

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
                    rbOnlyShare.unSelectRadioButton();
                }
            }
        });
        rbContactExcept.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    rbMyContact.unSelectRadioButton();
                    rbOnlyShare.unSelectRadioButton();
                }
            }
        });
        rbOnlyShare.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
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
