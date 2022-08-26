package com.whatsapp.clone.presentation.accountSetting;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.accountItemView.AccountItemView;

public class AccountSettingActivity extends LinearLayoutCompat {
    Context mContext;
    private AccountItemView mItemViewPrivacy,mItemViewSecurity,mItemViewTwoStep,mItemViewChangeNum,mItemViewReqAccInfo,mItemViewDeleteAcc;

    public AccountSettingActivity(@NonNull Context mContext) {
        this(mContext,null);
    }

    public AccountSettingActivity(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public AccountSettingActivity(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;

        intiView();
        onSettingPrivacySetup();
        onSettingSecuritySetup();
        onSettingTwoStepVerificationSetup();
        onSettingChangeNumberSetup();
        onSettingRequestAccInfo();
        onDeleteMyAccount();
    }

    private void intiView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView=inflater.inflate(R.layout.activity_account_item,this,true);
        mItemViewPrivacy =mView.findViewById(R.id.aivPrivacy);
        mItemViewSecurity=findViewById(R.id.aivSecurity);
        mItemViewTwoStep=findViewById(R.id.aivVerification);
        mItemViewChangeNum=findViewById(R.id.aivChangeNum);
        mItemViewReqAccInfo=findViewById(R.id.aivRequestInfo);
        mItemViewDeleteAcc=findViewById(R.id.aivDeleteAcc);

    }

    public void onSettingPrivacySetup() {
        mItemViewPrivacy.setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_lock, getContext().getTheme()));
        mItemViewPrivacy.setTitle(getContext().getString(R.string.title_privacy));
    }

    public void onSettingSecuritySetup() {
        mItemViewSecurity.setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_sheild, getContext().getTheme()));
        mItemViewSecurity.setTitle(getContext().getString(R.string.title_securty));
    }

    public void onSettingTwoStepVerificationSetup() {
        mItemViewTwoStep.setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_two_step, getContext().getTheme()));
        mItemViewTwoStep.setTitle(getContext().getString(R.string.title_verification));
    }

    public void onSettingChangeNumberSetup() {
        mItemViewChangeNum.setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_change_num,getContext(). getTheme()));
        mItemViewChangeNum.setTitle(getContext().getString(R.string.title_change_num));
    }

    public void onSettingRequestAccInfo() {
        mItemViewReqAccInfo.setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_doucment,getContext().getTheme()));
        mItemViewReqAccInfo.setTitle(getContext().getString(R.string.title_reqAccInfo));
    }

    public void onDeleteMyAccount() {
        mItemViewDeleteAcc.setTitle(getContext().getString(R.string.title_delete));
        mItemViewDeleteAcc.setIcon(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_dlt, getContext().getTheme()));
    }
}

