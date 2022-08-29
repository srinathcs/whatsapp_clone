package com.whatsapp.clone.presentation.accountSetting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.accountItemView.AccountItemView;
import com.whatsapp.clone.widgets.accountItemView.ui.utils.AccountItem;


public class AccountSettingActivity extends LinearLayoutCompat {
    Context mContext;
    private AccountItemView mItemViewPrivacy, mItemViewSecurity, mItemViewTwoStep, mItemViewChangeNum, mItemViewReqAccInfo, mItemViewDeleteAcc;

    public AccountSettingActivity(@NonNull Context mContext) {
        this(mContext, null);
    }

    public AccountSettingActivity(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AccountSettingActivity(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;

        intiView();
        onSettingPrivacySetup();
        onSettingSecuritySetup();
        onSettingTwoStepVerificationSetup();
        onSettingChangeNumberSetup();
        onSettingRequestAccInfoSetup();
        onDeleteMyAccountSetup();
    }

    private void intiView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.activity_account_item, this, true);
        mItemViewPrivacy = mView.findViewById(R.id.aivPrivacy);
        mItemViewSecurity = findViewById(R.id.aivSecurity);
        mItemViewTwoStep = findViewById(R.id.aivVerification);
        mItemViewChangeNum = findViewById(R.id.aivChangeNum);
        mItemViewReqAccInfo = findViewById(R.id.aivRequestInfo);
        mItemViewDeleteAcc = findViewById(R.id.aivDeleteAcc);

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

