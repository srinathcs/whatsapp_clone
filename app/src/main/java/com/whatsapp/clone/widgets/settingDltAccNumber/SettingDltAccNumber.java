package com.whatsapp.clone.widgets.settingDltAccNumber;

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

public class SettingDltAccNumber extends LinearLayoutCompat {
    Context mContext;
    AppCompatImageView ivIcon;
    AppCompatTextView tvTitle;
    public SettingDltAccNumber(@NonNull Context mContext) {
        this(mContext,null);
    }

    public SettingDltAccNumber(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SettingDltAccNumber(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        initView();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView=inflater.inflate(R.layout.setting_delete_acc,this,true);
        ivIcon = mView.findViewById(R.id.ivIcon);
        tvTitle= mView.findViewById(R.id.tvTitle);
    }
}
