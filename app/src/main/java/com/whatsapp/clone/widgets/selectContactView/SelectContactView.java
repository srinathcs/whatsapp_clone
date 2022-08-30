package com.whatsapp.clone.widgets.selectContactView;

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
import com.whatsapp.clone.widgets.selectContactView.ui.utils.SelectContact;

import java.util.ResourceBundle;

import de.hdodenhof.circleimageview.CircleImageView;

public class SelectContactView extends LinearLayoutCompat {
   private Context mContext;
   private CircleImageView civIcon;
   private AppCompatTextView tvTitle;
   private AppCompatImageView ivQr;
    public SelectContactView(@NonNull Context mContext) {
        this(mContext,null);
    }

    public SelectContactView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SelectContactView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        initViews();
    }

    private void initViews() {
        LayoutInflater inflater=LayoutInflater.from(mContext);
        View mView=inflater.inflate(R.layout.contact_item,this,true);
        civIcon=mView.findViewById(R.id.civIcon);
        tvTitle=mView.findViewById(R.id.tvTitle);
        ivQr=mView.findViewById(R.id.ivQr);

    }
    public void setTitle(String title){
        tvTitle.setText(title);
    }
    public void setCivIcon(Drawable drawable){
        civIcon.setImageDrawable(drawable);
    }
    public void setIvQr(Drawable drawable){
        ivQr.setImageDrawable(drawable);
    }
    public void setContact(SelectContact type){
        switch (type){
            case NEW_GROUP:
                onNewGroupSetup();
                break;
            case NEW_CONTACT:
                onNewContactSetup();
                break;
        }
    }

    private void onNewGroupSetup() {
        setTitle(mContext.getString(R.string.new_grp));
        setCivIcon(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_new_grp,mContext.getTheme()));
    }

    private void onNewContactSetup() {
        setTitle(mContext.getString(R.string.new_contact));
        setCivIcon(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_new_contact, mContext.getTheme()));
        setIvQr(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_qr_code, mContext.getTheme()));
    }
}
