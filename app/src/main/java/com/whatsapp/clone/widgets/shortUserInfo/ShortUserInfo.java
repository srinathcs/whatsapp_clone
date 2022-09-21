package com.whatsapp.clone.widgets.shortUserInfo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.whatsapp.clone.R;

import de.hdodenhof.circleimageview.CircleImageView;


public class ShortUserInfo extends LinearLayoutCompat {
    Context mContext;
    AppCompatTextView tvTitle, tvDescription;
    CircleImageView ivProfile;
    AppCompatImageView ivScan;

    public ShortUserInfo(@NonNull Context mContext) {
        this(mContext, null);
    }

    public ShortUserInfo(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ShortUserInfo(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        intiView();
    }

    private void intiView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.activity_setting, this, true);
        tvTitle = mView.findViewById(R.id.tvTitle);
        tvDescription = mView.findViewById(R.id.tvDescription);
        ivProfile = mView.findViewById(R.id.ivProfile);
        ivScan = mView.findViewById(R.id.ivQr);
    }
}