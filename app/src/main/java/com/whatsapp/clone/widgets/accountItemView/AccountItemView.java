package com.whatsapp.clone.widgets.accountItemView;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import androidx.appcompat.app.ActionBar;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.accountItemView.ui.utils.AccountItem;
import com.whatsapp.clone.widgets.settingItemView.listener.ItemClickListener;

public class AccountItemView extends LinearLayoutCompat {
    private Context mContext;
    private AppCompatImageView ivASIcon;
    private AppCompatTextView tvASTitle;
    private ItemClickListener mItemClickListener;
    private LinearLayoutCompat llParent;

    public AccountItemView(@NonNull Context mContext) {
        this(mContext, null);
    }

    public AccountItemView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AccountItemView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
        setupEvent();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.account_item, this, true);
        ivASIcon = mView.findViewById(R.id.ivIcon);
        tvASTitle = mView.findViewById(R.id.tvTitle);
        llParent = mView.findViewById(R.id.llParent);
    }

    private void setupEvent() {
        llParent.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mItemClickListener != null) {
                    mItemClickListener.onClicked();
                }
            }
        });
    }

    public void setIcon(Drawable drawable) {
        ivASIcon.setImageDrawable(drawable);
    }

    public void setTitle(String title) {
        tvASTitle.setText(title);
    }

    public void setItemClickListener(ItemClickListener listener) {
        this.mItemClickListener = listener;
    }

    public void setItemInfo(AccountItem type) {
        switch (type) {
            case PRIVACY:
                onPrivacySetup();
                break;
            case SECURITY:
                onSecuritySetup();
                break;
            case TWO_STEP_VERIFICATION:
                onTwoStepVerification();
                break;
            case CHANGE_NUMBER:
                onChangeNumber();
                break;
            case REQUEST_ACCOUNT_INFO:
                onRequestAccountInfo();
                break;
            case DELETE_MY_ACCOUNT:
                onDeleteMyAccount();
                break;
            case REQUEST_REPORT:
                onRequestSentSetup();
                break;
            case EXPORT_CHAT:
                onExportChatSetup();
                break;
            case ARCHIVED_ALL_CHAT:
                onArchiveSetup();
                break;
            case CLEAR_ALL_CHATS:
                onClearAllChatSetup();
                break;
            case DELETE_ALL_CHATS:
                onDeleteAllChats();
                break;
            case HELP_CENTRE:
                onHelpCentreSetup();
                break;
            case POLICY:
                onPolicySetup();
                break;
            case APP_INFO:
                onAppInfoSetup();
                break;
            case SEND_PAYMENT:
                onSendPaymentSetup();
                break;
            case SCAN_PAYMENT:
                onScanPaymentSetup();
                break;
            case ADD_PAYMENT:
                onAddPaymentSetup();
                break;
            case HELP:
                onHelpSetup();
                break;
        }
    }

    public void onPrivacySetup() {
        setTitle(getContext().getString(R.string.title_privacy));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_lock, mContext.getTheme()));
    }

    private void onSecuritySetup() {
        setTitle(getContext().getString(R.string.title_security));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_sheild, mContext.getTheme()));
    }

    private void onTwoStepVerification() {
        setTitle(getContext().getString(R.string.title_verification));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_two_step, mContext.getTheme()));
    }

    private void onChangeNumber() {
        setTitle(getContext().getString(R.string.title_change_num));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_change_num, mContext.getTheme()));
    }

    private void onRequestAccountInfo() {
        setTitle(getContext().getString(R.string.title_reqAccInfo));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_doucment, mContext.getTheme()));
    }

    private void onDeleteMyAccount() {
        setTitle(getContext().getString(R.string.title_delete));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_dlt, mContext.getTheme()));
    }

    public void onRequestSentSetup() {
        setTitle(getContext().getString(R.string.reqAccItem));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_doucment, mContext.getTheme()));
    }

    public void onExportChatSetup() {
        setTitle("Export chats");
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_export, mContext.getTheme()));
    }

    public void onArchiveSetup() {
        setTitle("Archive all chats");
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_archive, mContext.getTheme()));
    }

    public void onClearAllChatSetup() {
        setTitle("Clear all chats");
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_circle, mContext.getTheme()));
    }

    public void onDeleteAllChats() {
        setTitle("Delete all chats");
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_dlt, mContext.getTheme()));
    }

    public void onHelpCentreSetup() {
        setTitle("Help Centre");
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_help, mContext.getTheme()));
    }

    public void onPolicySetup() {
        setTitle("Terms and Privacy Policy");
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_friend, mContext.getTheme()));
    }

    public void onAppInfoSetup() {
        setTitle("App info");
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_info, mContext.getTheme()));
    }

    public void onSendPaymentSetup() {
        setTitle("Send payment");
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_rupee, mContext.getTheme()));
    }

    public void onScanPaymentSetup() {
        setTitle("Scan payment QR code");
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_qr_code, mContext.getTheme()));
    }

    public void onAddPaymentSetup() {
        setTitle("Add payment method");
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_plus, mContext.getTheme()));
    }

    public void onHelpSetup() {
        setTitle("Help");
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_help, mContext.getTheme()));
    }
}