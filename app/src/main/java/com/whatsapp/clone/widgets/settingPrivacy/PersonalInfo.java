package com.whatsapp.clone.widgets.settingPrivacy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.whatsapp.clone.R;

public class PersonalInfo extends LinearLayoutCompat {
    Context mContext;
    AppCompatTextView tvTitle, tvDescription;

    public PersonalInfo(@NonNull Context mContext) {
        this(mContext, null);
    }

    public PersonalInfo(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PersonalInfo(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initViews();
        intiWidgets();
    }

    private void initViews() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.privacy_personal_info, this, true);
        tvTitle = mView.findViewById(R.id.tvTitle);
        tvDescription = mView.findViewById(R.id.tvDescription);
    }

    private void intiWidgets(){
        setTitle(mContext.getString(R.string.tv_Title));
        setDescription(mContext.getString(R.string.personal_info_descrp));
    }

    public void setTitle(String title) {
        tvTitle.setText(title);
    }

    public void setDescription(String description) {
        tvDescription.setText(description);
    }
}
