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

public class AccountItemView extends LinearLayoutCompat {
    private Context mContext;
    private AppCompatImageView ivASIcon;
    private AppCompatTextView tvASTitle;
    private ActionBar actionBar;

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
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.account_item, this, true);
        ivASIcon = mView.findViewById(R.id.ivIcon);
        tvASTitle = mView.findViewById(R.id.tvTitle);
    }

    public void setIcon(Drawable drawable) {
        ivASIcon.setImageDrawable(drawable);
    }

    public void setTitle(String title){
        tvASTitle.setText(title);
    }

    public void setItemInfo(AccountItem type){
        switch(type){
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
        }
    }

    public void onPrivacySetup(){
        setTitle(mContext.getString(R.string.title_privacy));
        setIcon(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_lock,mContext.getTheme()));
    }
    private void onSecuritySetup() {
        setTitle(getContext().getString(R.string.title_security));
        setIcon(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_sheild,mContext.getTheme()));
    }
    private  void onTwoStepVerification(){
        setTitle(getContext().getString(R.string.title_verification));
        setIcon(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_two_step,mContext.getTheme()));
    }
    private void onChangeNumber(){
        setTitle(getContext().getString(R.string.title_change_num));
        setIcon(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_change_num,mContext.getTheme()));
    }
    private  void onRequestAccountInfo(){
        setTitle(getContext().getString(R.string.title_reqAccInfo));
        setIcon(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_doucment,mContext.getTheme()));
    }
    private void onDeleteMyAccount(){
        setTitle(getContext().getString(R.string.title_delete));
        setIcon(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_dlt,mContext.getTheme()));
    }
}
