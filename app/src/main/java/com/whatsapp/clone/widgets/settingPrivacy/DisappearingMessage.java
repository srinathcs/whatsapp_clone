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

public class DisappearingMessage extends LinearLayoutCompat {
    Context mContext;
    AppCompatTextView tvTitle, tvDescription, tvDisappearing, tvEvent;

    public DisappearingMessage(@NonNull Context mContext) {
        this(mContext, null);
    }

    public DisappearingMessage(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DisappearingMessage(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.privacy_disappearing_messages, this, true);
        tvTitle = mView.findViewById(R.id.tv_Title);
        tvDescription = mView.findViewById(R.id.tv_Description);
        tvDisappearing = mView.findViewById(R.id.tv_Disappearing);
        tvEvent=mView.findViewById(R.id.tv_Event);
    }

    public void setTitle(String title) {
        tvTitle.setText(title);
    }

    public void setDescription(String description) {
        tvDescription.setText(description);
    }

    public void setDisappearing(String disappearing) {
        tvDisappearing.setText(disappearing);
    }

    public void setEvent(String event) {
        tvEvent.setText(event);
    }
}
