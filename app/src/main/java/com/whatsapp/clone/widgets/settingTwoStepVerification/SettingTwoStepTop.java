package com.whatsapp.clone.widgets.settingTwoStepVerification;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class SettingTwoStepTop extends LinearLayoutCompat {
    Context mContext;
    private CircleImageView civIcon;
    private AppCompatTextView tvDescription;
    public SettingTwoStepTop(@NonNull Context mContext) {
        this(mContext,null);
    }

    public SettingTwoStepTop(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SettingTwoStepTop(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        initView();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.setting_two_step, this, true);
        civIcon =mView.findViewById(R.id.civTwoStepIcon);
        tvDescription=mView.findViewById(R.id.tvDescription);
    }
    private void initWidget(){
        SetIcon(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_two_factor, getContext().getTheme()));
        SetDescription("Two-step verification is enabled. You'll need to enter your PIN when registering yor phone number with WhatsApp again");
    }
    public void SetIcon(Drawable drawable){
        civIcon.setImageDrawable(drawable);
    }
    public void SetDescription(String description){
        tvDescription.setText(description);
    }
}
