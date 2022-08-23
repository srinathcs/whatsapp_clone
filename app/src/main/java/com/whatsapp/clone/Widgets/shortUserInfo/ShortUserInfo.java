package com.whatsapp.clone.Widgets.shortUserInfo;

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

import com.whatsapp.clone.R;

import de.hdodenhof.circleimageview.CircleImageView;


public class ShortUserInfo extends LinearLayoutCompat {
    Context mContext;
    AppCompatTextView tvTitle,tvDescription;
    CircleImageView ivProfile;
    AppCompatImageView ivScan;

    public ShortUserInfo(@NonNull Context mContext) {
        this(mContext,null);
    }

    public ShortUserInfo(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ShortUserInfo(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        intiView();
    }

    private void intiView() {
        LayoutInflater inflater=LayoutInflater.from(mContext);
        View mView= inflater.inflate(R.layout.short_user_info,this,true);
        tvTitle =mView.findViewById(R.id.tvTitle);
        tvDescription=mView.findViewById(R.id.tvDescription);
        ivProfile=mView.findViewById(R.id.civProfilePic);
        ivScan=mView.findViewById(R.id.ivScan);
    }
    public void setTitle(String title){
        tvTitle.setText(title);
        tvTitle.setTextColor(getResources().getColor(R.color.black));
        tvTitle.setTextSize(18);

    }
    public void setDescription(String description){
        tvDescription.setText(description);
        tvDescription.setTextSize(14);
    }
    public void setProfile( ){
        ivProfile.setImageDrawable(getResources().getDrawable(R.drawable.ktm));
    }
    public void setScan(Drawable drawable){
    ivScan.setImageResource(R.drawable.qrcode);
    }
}
