package com.whatsapp.clone.widgets.textAndSwitch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;

import com.whatsapp.clone.R;

public class TextAndSwitch extends LinearLayoutCompat {
    Context mContext;
    AppCompatTextView tvTitle;
    SwitchCompat scSwitch;
    public TextAndSwitch(@NonNull Context mContext) {
        this(mContext,null);
    }

    public TextAndSwitch(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TextAndSwitch(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        initView();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.text_and_switch,this,true);
        tvTitle = mView.findViewById(R.id.tvTitle);
        scSwitch = mView.findViewById(R.id.scSwitch);
    }
    public void setTitle(String title){
        tvTitle.setText(title);
    }
}
