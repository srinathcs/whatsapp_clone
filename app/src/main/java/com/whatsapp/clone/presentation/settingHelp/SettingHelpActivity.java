package com.whatsapp.clone.presentation.settingHelp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Window;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.accountItemView.AccountItemView;
import com.whatsapp.clone.widgets.accountItemView.ui.utils.AccountItem;
import com.whatsapp.clone.widgets.settingItemView.listener.ItemClickListener;
import com.whatsapp.clone.widgets.settingItemView.ui.SettingItemView;
import com.whatsapp.clone.widgets.settingItemView.ui.utils.SettingItemType;

public class SettingHelpActivity extends AppCompatActivity {
    ActionBar actionBar;
    AccountItemView mHelpCentre,mPolicy,mInfo;
    SettingItemView mContact;
    WebView mWebView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        initView();
        initWidget();
        onActionbarConfig();
    }

    private void initView() {
        mHelpCentre = findViewById(R.id.helpCentre);
        mContact = findViewById(R.id.helpContact);
        mPolicy = findViewById(R.id.helpPolicy);
        mInfo = findViewById(R.id.helpAppInfo);
    }

    private void initWidget(){
        mHelpCentre.setItemInfo(AccountItem.HELP_CENTRE);
        mContact.setType(SettingItemType.CONTACT);
        mPolicy.setItemInfo(AccountItem.POLICY);
        mInfo.setItemInfo(AccountItem.APP_INFO);
        mHelpCentre.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {

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
}
