package com.whatsapp.clone.widgets.setingDeleteAccItem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.whatsapp.clone.R;

public class SettingDeleteAccItem extends LinearLayoutCompat {
    Context mContext;
    AppCompatTextView tvDeleteAccInfo;
    public SettingDeleteAccItem(@NonNull Context mContext) {
        this(mContext,null);
    }

    public SettingDeleteAccItem(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SettingDeleteAccItem(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        initView();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView=inflater.inflate(R.layout.setting_dlt_acc_info,this,true);
        tvDeleteAccInfo =mView.findViewById(R.id.tvInfo);
    }
    public void setTitle(String title){
        tvDeleteAccInfo.setText(title);
    }
}
