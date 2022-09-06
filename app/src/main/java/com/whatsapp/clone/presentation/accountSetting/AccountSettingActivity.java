package com.whatsapp.clone.presentation.accountSetting;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.accountItemView.AccountItemView;
import com.whatsapp.clone.widgets.accountItemView.ui.utils.AccountItem;


public class AccountSettingActivity extends AppCompatActivity {
    ActionBar actionBar;
    private AccountItemView mItemViewPrivacy, mItemViewSecurity, mItemViewTwoStep, mItemViewChangeNum, mItemViewReqAccInfo, mItemViewDeleteAcc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_item);
        intiView();
        onActionbarConfig();
        onSettingPrivacySetup();
        onSettingSecuritySetup();
        onSettingTwoStepVerificationSetup();
        onSettingChangeNumberSetup();
        onSettingRequestAccInfoSetup();
        onDeleteMyAccountSetup();
    }


    private void intiView() {

        mItemViewPrivacy = findViewById(R.id.aivPrivacy);
        mItemViewSecurity = findViewById(R.id.aivSecurity);
        mItemViewTwoStep = findViewById(R.id.aivVerification);
        mItemViewChangeNum = findViewById(R.id.aivChangeNum);
        mItemViewReqAccInfo = findViewById(R.id.aivRequestInfo);
        mItemViewDeleteAcc = findViewById(R.id.aivDeleteAcc);

    }

    private void onActionbarConfig() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.acc_setting);
        actionBar.setDisplayHomeAsUpEnabled(true);

    }

    public void onSettingPrivacySetup() {
        mItemViewPrivacy.setItemInfo(AccountItem.PRIVACY);
    }

    public void onSettingSecuritySetup() {
        mItemViewSecurity.setItemInfo(AccountItem.SECURITY);
    }

    public void onSettingTwoStepVerificationSetup() {
        mItemViewTwoStep.setItemInfo(AccountItem.TWO_STEP_VERIFICATION);
    }

    public void onSettingChangeNumberSetup() {
        mItemViewChangeNum.setItemInfo(AccountItem.CHANGE_NUMBER);
    }

    public void onSettingRequestAccInfoSetup() {
        mItemViewReqAccInfo.setItemInfo(AccountItem.REQUEST_ACCOUNT_INFO);

    }

    private void onDeleteMyAccountSetup() {
        mItemViewDeleteAcc.setItemInfo(AccountItem.DELETE_MY_ACCOUNT);
    }

}

