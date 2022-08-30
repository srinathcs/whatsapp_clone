package com.whatsapp.clone.presentation.selectContact;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;

public class SelectContactActivity extends LinearLayoutCompat {
    Context mContext;
    public SelectContactActivity(@NonNull Context mContext) {
        this(mContext,null);
    }

    public SelectContactActivity(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SelectContactActivity(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
