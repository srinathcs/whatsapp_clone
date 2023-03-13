package com.whatsapp.clone.presentation.settingHelp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.whatsapp.clone.R;
import com.whatsapp.clone.presentation.helpAppInfo.HelpAppInfoActivity;
import com.whatsapp.clone.presentation.settingContactUs.SettingHelpContactUs;
import com.whatsapp.clone.widgets.accountItemView.AccountItemView;
import com.whatsapp.clone.widgets.accountItemView.ui.utils.AccountItem;
import com.whatsapp.clone.widgets.settingItemView.listener.ItemClickListener;
import com.whatsapp.clone.widgets.settingItemView.ui.SettingItemView;
import com.whatsapp.clone.widgets.settingItemView.ui.utils.SettingItemType;

public class SettingHelpActivity extends AppCompatActivity {
    ActionBar actionBar;
    AccountItemView mHelpCentre,mPolicy,mInfo;
    SettingItemView mContact;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        initView();
        initWidget();
        onActionbarConfig();
        onSetup();
    }

    private void initView() {
        mHelpCentre = findViewById(R.id.helpCentre);
        mContact = findViewById(R.id.helpContact);
        mPolicy = findViewById(R.id.helpPolicy);
        mInfo = findViewById(R.id.helpAppInfo);
    }

    private void initWidget() {
        mHelpCentre.setItemInfo(AccountItem.HELP_CENTRE);
        mContact.setType(SettingItemType.CONTACT);
        mPolicy.setItemInfo(AccountItem.POLICY);
        mInfo.setItemInfo(AccountItem.APP_INFO);
    }
    private void onSetup() {
        mHelpCentre.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                String url = "https://faq.whatsapp.com/?cms_platform=android&expand_folders[0]=android&locale=en_US";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        mContact.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                Intent intent = new Intent(SettingHelpActivity.this, SettingHelpContactUs.class);
                startActivity(intent);
            }
        });
        mPolicy.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                String url = "https://www.whatsapp.com/legal/?lang=en";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        mInfo.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                Intent intent = new Intent(SettingHelpActivity.this, HelpAppInfoActivity.class);
                startActivity(intent);
            }
        });
    }

    private void onActionbarConfig() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle("Help");
        actionBar.setDisplayHomeAsUpEnabled(true);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green));
    }
    public boolean onOptionsItemSelected (MenuItem item){
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
