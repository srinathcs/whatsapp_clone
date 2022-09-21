package com.whatsapp.clone.widgets.settingDeleteMyacc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.whatsapp.clone.R;

public class DeleteMyAcc extends LinearLayoutCompat {
    Context mContext;
    AppCompatTextView tvTitle;
    AppCompatButton btDeleteMyAcc;
    AppCompatEditText etCountry, etPinCode, etPhoneNum;

    public DeleteMyAcc(@NonNull Context mContext) {
        this(mContext, null);
    }

    public DeleteMyAcc(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DeleteMyAcc(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
        initWidget();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.setting_delete_acc_confirm, this, true);
        tvTitle = mView.findViewById(R.id.tvTitle);
        btDeleteMyAcc = mView.findViewById(R.id.btDeleteAcc);
        etCountry = mView.findViewById(R.id.etCountry);
        etPinCode = mView.findViewById(R.id.etPin);
        etPhoneNum = mView.findViewById(R.id.etPhone);
    }

    private void initWidget() {
        setTitle(mContext.getString(R.string.tvDltTitle));
    }
    public void setTitle(String title){
        tvTitle.setText(title);
    }
}
