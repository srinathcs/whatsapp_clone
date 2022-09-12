package com.whatsapp.clone.widgets.settingPrivacyDefaultTime;

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
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;

public class SettingPrivacyMessage extends LinearLayoutCompat {
    Context mContext;
    AppCompatImageView ivDefaultIcon;
    AppCompatTextView tvTitle;

    public SettingPrivacyMessage(@NonNull Context mContext) {
        this(mContext, null);
    }

    public SettingPrivacyMessage(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SettingPrivacyMessage(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
        initWidget();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.privacy_default_message, this, true);
        ivDefaultIcon = mView.findViewById(R.id.ivMessage);
        tvTitle = mView.findViewById(R.id.tvTitle);
    }
    private void initWidget() {
        setTitle(getContext().getString(R.string.tvDefaultTitle));
        setMessageIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_default_messsage, getContext().getTheme()));
    }

    public void setTitle(String title) {
        tvTitle.setText(title);
    }

    public void setMessageIcon(Drawable drawable) {
        ivDefaultIcon.setImageDrawable(drawable);
    }
}