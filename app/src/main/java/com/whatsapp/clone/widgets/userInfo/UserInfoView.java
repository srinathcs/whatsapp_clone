package com.whatsapp.clone.widgets.userInfo;

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

public class UserInfoView extends LinearLayoutCompat {
    private Context mContext;
    private AppCompatTextView tvTitle, tvDescription;
    private CircleImageView ivProfile;
    private AppCompatImageView ivQr;

    public UserInfoView(@NonNull Context mContext) {
        this(mContext, null);
    }

    public UserInfoView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public UserInfoView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        intiView();
    }


    private void intiView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.view_user_info, this, true);
        tvTitle = mView.findViewById(R.id.tvTitle);
        tvDescription = mView.findViewById(R.id.tvDescription);
        ivProfile = mView.findViewById(R.id.ivProfile);
        ivQr = mView.findViewById(R.id.ivQr);

    }

    public void setTitle(String title) {
        tvTitle.setText(title);
    }

    public void setDescription(String Description) {
        tvDescription.setText(Description);
    }

    public void setImageProfile(Drawable drawable) {
        ivProfile.setImageDrawable(drawable);
    }

}
