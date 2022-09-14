package com.whatsapp.clone.widgets.settingChangeNumberItem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.whatsapp.clone.R;

public class SettingChangeNumItem extends LinearLayoutCompat {
    Context mContext;
    private AppCompatTextView tvTitle;
    private AppCompatEditText etPinCode,etPhone;
    public SettingChangeNumItem(@NonNull Context mContext) {
        this(mContext,null);
    }

    public SettingChangeNumItem(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SettingChangeNumItem(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        initView();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView=inflater.inflate(R.layout.setting_change_num_item,this,true);
        tvTitle =mView.findViewById(R.id.tvTitle);
        etPinCode=mView.findViewById(R.id.etCode);
        etPhone=mView.findViewById(R.id.etPhone);
    }
    public void setTitle(String title){
        tvTitle.setText(title);
    }
}