package com.whatsapp.clone.widgets.settingTwoStepVerification;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingTwoStepVerification.ui.utils.TwoStepItem;

public class SettingTwoStepItem extends LinearLayoutCompat {
    Context mContext;
    AppCompatImageView ivIcon;
    AppCompatTextView tvTitle;

    public SettingTwoStepItem(@NonNull Context mContext) {
        this(mContext, null);
    }

    public SettingTwoStepItem(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SettingTwoStepItem(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.two_step_verification_item, this, true);
        ivIcon = mView.findViewById(R.id.ivIcon);
        tvTitle = mView.findViewById(R.id.tvTitle);
    }

    public void setIcon(Drawable drawable) {
        ivIcon.setImageDrawable(drawable);
    }

    public void setTitle(String title) {
        tvTitle.setText(title);
    }

    public void setType(TwoStepItem type) {
        switch (type) {
            case DISABLE:
                onDisableSetup();
                break;
            case CHANGE_PIN:
                onChangePinSetup();
                break;
            case CHANGE_EMAIL_ADDRESS:
                onChangeEmailSetup();
                break;
        }
    }

    private void onDisableSetup() {
        setTitle(getContext().getString(R.string.titleDisable));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_disable, mContext.getTheme()));
    }

    private void onChangePinSetup() {
        setTitle(getContext().getString(R.string.titleChangePin));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_two_step, mContext.getTheme()));
    }

    private void onChangeEmailSetup() {
        setTitle(getContext().getString(R.string.titleChangeEmail));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_email, mContext.getTheme()));
    }
}