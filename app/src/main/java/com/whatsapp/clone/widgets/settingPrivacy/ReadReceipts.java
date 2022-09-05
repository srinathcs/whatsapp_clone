package com.whatsapp.clone.widgets.settingPrivacy;

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

public class ReadReceipts extends LinearLayoutCompat {
    Context mContext;
    AppCompatTextView tvTitle, tvDescription;
    SwitchCompat scSwitch;

    public ReadReceipts(@NonNull Context mContext) {
        this(mContext, null);
    }

    public ReadReceipts(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ReadReceipts(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.privacy_read_receipts, this, true);
        tvTitle = mView.findViewById(R.id.tvTitle);
        tvDescription = mView.findViewById(R.id.tvDescription);
        scSwitch = mView.findViewById(R.id.sc_receipts);
    }

    public void SetTitle(String title) {
        tvTitle.setText(title);
    }

    public void SetDescription(String description) {
        tvDescription.setText(description);
    }
}
