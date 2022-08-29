package com.whatsapp.clone.widgets.settingItemMeta;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.whatsapp.clone.R;

public class SettingItemMeta extends LinearLayoutCompat {
    Context mContext;
    AppCompatTextView tvTitle,tvDescription;
    public SettingItemMeta(@NonNull Context mContext) {
        this(mContext,null);
    }

    public SettingItemMeta(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SettingItemMeta(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        intiView();
    }

    private void intiView() {
        LayoutInflater inflater =LayoutInflater.from(mContext);
        View mView=inflater.inflate(R.layout.view_setting_meta,this,true);
        tvTitle=mView.findViewById(R.id.tvTitle);
        tvDescription=mView.findViewById(R.id.tvDescription);
    }
    public void setTvTitle(String title){
        tvTitle.setText(title);
    }
    public void setTvDescription(String Description){
        tvDescription.setText(Description);
    }
}
