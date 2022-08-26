package com.whatsapp.clone.widgets.accountItemView;

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

public class AccountItemView extends LinearLayoutCompat {
    private Context mContext;
    private AppCompatImageView ivASIcon;
    private AppCompatTextView tvASTitle;

    public AccountItemView(@NonNull Context mContext) {
        this(mContext, null);
    }

    public AccountItemView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AccountItemView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.account_item, this, true);
        ivASIcon = mView.findViewById(R.id.ivIcon);
        tvASTitle = mView.findViewById(R.id.tvTitle);
    }

    public void setIcon(Drawable drawable) {
        ivASIcon.setImageDrawable(drawable);
    }

    public void setTitle(String title){
        tvASTitle.setText(title);
    }
}
