package com.whatsapp.clone.presentation.accountSetting;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.presentation.privacyLastSeen.PrivacyLastSeenActivity;
import com.whatsapp.clone.presentation.privacySetting.PrivacySettingActivity;
import com.whatsapp.clone.presentation.setting.SettingActivity;
import com.whatsapp.clone.presentation.settingChangeNumCard.SettingChangeNumCardActivity;
import com.whatsapp.clone.presentation.settingChangeNumber.ChangeNumberSettingActivity;
import com.whatsapp.clone.presentation.settingRequestAcc.RequestAccountActivity;
import com.whatsapp.clone.presentation.settingSecurity.SecuritySettingActivity;
import com.whatsapp.clone.presentation.settingTwoStepVerification.SettingTwoStepActivity;
import com.whatsapp.clone.widgets.accountItemView.AccountItemView;
import com.whatsapp.clone.widgets.accountItemView.ui.utils.AccountItem;
import com.whatsapp.clone.widgets.settingItemView.listener.ItemClickListener;


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
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onSettingPrivacySetup() {
        mItemViewPrivacy.setItemInfo(AccountItem.PRIVACY);
        mItemViewPrivacy.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                Intent intent = new Intent(AccountSettingActivity.this,PrivacySettingActivity.class);
                startActivity(intent);
            }
        });

    }

    public void onSettingSecuritySetup() {
        mItemViewSecurity.setItemInfo(AccountItem.SECURITY);
        mItemViewSecurity.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                Intent intent = new Intent(AccountSettingActivity.this,SecuritySettingActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onSettingTwoStepVerificationSetup() {
        mItemViewTwoStep.setItemInfo(AccountItem.TWO_STEP_VERIFICATION);
        mItemViewTwoStep.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                Intent intent = new Intent(AccountSettingActivity.this, SettingTwoStepActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onSettingChangeNumberSetup() {
        mItemViewChangeNum.setItemInfo(AccountItem.CHANGE_NUMBER);
        mItemViewChangeNum.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                Intent intent = new Intent(AccountSettingActivity.this, ChangeNumberSettingActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onSettingRequestAccInfoSetup() {
        mItemViewReqAccInfo.setItemInfo(AccountItem.REQUEST_ACCOUNT_INFO);
        mItemViewReqAccInfo.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                Intent intent = new Intent(AccountSettingActivity.this, RequestAccountActivity.class);
                startActivity(intent);
            }
        });
    }

    private void onDeleteMyAccountSetup() {
        mItemViewDeleteAcc.setItemInfo(AccountItem.DELETE_MY_ACCOUNT);
    }
}