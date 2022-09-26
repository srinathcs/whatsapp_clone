package com.whatsapp.clone.widgets.settingTwoStepCard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;

import com.whatsapp.clone.R;

public class TwoStepCard extends LinearLayoutCompat {
    Context mContext;
    CardView cvDisableCard;
    AppCompatButton btCancel,btDisable;
    public TwoStepCard(@NonNull Context mContext) {
        this(mContext,null);
    }

    public TwoStepCard(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TwoStepCard(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        initView();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView=inflater.inflate(R.layout.change_num_card,this,true);
        cvDisableCard =mView.findViewById(R.id.cvTwoStepCard);
        btCancel = mView.findViewById(R.id.btCancelCard);
        btDisable= mView.findViewById(R.id.btDisableCard);
    }
}
