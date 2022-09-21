package com.whatsapp.clone.widgets.settingDeleteChangeNum;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.service.dreams.DreamService;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;

public class SettingChangeNumDeleteAcc extends LinearLayoutCompat {
    Context mContext;
    AppCompatTextView tvTitle;
    AppCompatImageView ivIcon;
    AppCompatButton btChangeNum;
    public SettingChangeNumDeleteAcc(@NonNull Context mContext) {
        this(mContext,null);
    }

    public SettingChangeNumDeleteAcc(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SettingChangeNumDeleteAcc(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        initView();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView=inflater.inflate(R.layout.setting_delete_acc_change_num,this,true);
        tvTitle = mView.findViewById(R.id.tvTitle);
        ivIcon = mView.findViewById(R.id.ivIcon);
        btChangeNum = mView.findViewById(R.id.btChangeNum);
    }
    public void initWidget(){
        setTitle(mContext.getString(R.string.deleteAccChangeNum));
        setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_change_num, mContext.getTheme()));

    }
    public void setTitle(String title){
        tvTitle.setText(title);
    }
    public void setIcon(Drawable drawable){
        ivIcon.setImageDrawable(drawable);
    }
}
