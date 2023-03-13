package com.whatsapp.clone.widgets.chatItem;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatItem extends LinearLayoutCompat {
    Context mContext;
    private CircleImageView civDp;
    private AppCompatTextView tvTitle, tvDescription, tvTime;

    public ChatItem(@NonNull Context mContext) {
        this(mContext, null);
    }

    public ChatItem(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ChatItem(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
        initWidget();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.chat_item, this, true);

        civDp = mView.findViewById(R.id.civDp);
        tvTitle = mView.findViewById(R.id.tvTitle);
        tvDescription = mView.findViewById(R.id.tvDescription);
        tvTime = mView.findViewById(R.id.tvTime);
    }

    private void initWidget() {
        setTitle("Srinath");
        setDescription("hai");
        setTime("just now");
        setDp(ResourcesCompat.getDrawable(getResources(), R.drawable.ktm, mContext.getTheme()));
    }

    public void setTitle(String title) {
        tvTitle.setText(title);
    }

    public void setDescription(String description) {
        tvDescription.setText(description);
    }

    public void setTime(String time) {
        tvTime.setText(time);
    }

    public void setDp(Drawable drawable) {
        civDp.setImageDrawable(drawable);
    }
}