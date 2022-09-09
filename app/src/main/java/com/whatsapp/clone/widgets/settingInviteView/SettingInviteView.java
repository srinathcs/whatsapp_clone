package com.whatsapp.clone.widgets.settingInviteView;

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

import com.whatsapp.clone.R;

public class SettingInviteView extends LinearLayoutCompat {
    private Context mContext;
    private AppCompatImageView ivSettingIcon;
    private AppCompatTextView tvSettingTitle;
    public SettingInviteView(@NonNull Context mContext) {
        this(mContext ,null);
    }

    public SettingInviteView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs ,0);
    }

    public SettingInviteView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        intiViews();
    }

    private void intiViews() {
        LayoutInflater inflater =LayoutInflater.from(mContext);
        View mView=inflater.inflate(R.layout.view_setting_invite,this,true);
        ivSettingIcon =mView.findViewById(R.id.ivIcon);
        tvSettingTitle=mView.findViewById(R.id.tvTitle);
    }
    public void setTitle(String title){
        tvSettingTitle.setText(title);
    }
    public void setIcon(Drawable drawable){
        ivSettingIcon.setImageDrawable(drawable);
    }
}
