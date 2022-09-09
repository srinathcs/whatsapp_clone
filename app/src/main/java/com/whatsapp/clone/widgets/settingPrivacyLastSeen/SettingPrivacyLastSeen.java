package com.whatsapp.clone.widgets.settingPrivacyLastSeen;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.ui.utils.LastSeenItem;

public class SettingPrivacyLastSeen extends LinearLayoutCompat {
    Context mContext;
    private AppCompatRadioButton mRbLastSeen;

    public SettingPrivacyLastSeen(@NonNull Context mContext) {
        this(mContext, null);
    }

    public SettingPrivacyLastSeen(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SettingPrivacyLastSeen(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();


    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.privacy_lastseen, this, true);
        mRbLastSeen = mView.findViewById(R.id.rbLastSeen);
    }
    public void unSelectRadioButton(){
        mRbLastSeen.setChecked(false);
    }
    public void setRadioButtonListener(CompoundButton.OnCheckedChangeListener mListener){
        mRbLastSeen.setOnCheckedChangeListener(mListener);
    }

    public void setTitle(String title) {
        mRbLastSeen.setText(title);

    }

    public void setType(LastSeenItem type) {
        switch (type) {
            case EVERYONE:
                onEveryOneSetup();
                break;
            case MY_CONTACT:
                onMyContactSetup();
                break;
            case MY_CONTACT_EXCEPT:
                onMyContactExceptSetup();
                break;
            case NOBODY:
                onNobodySetup();
                break;
        }
    }

    public void onEveryOneSetup() {
        setTitle(getContext().getString(R.string.rb_everyone));
    }

    public void onMyContactSetup() {
        setTitle(getContext().getString(R.string.rb_myContacts));
    }

    public void onMyContactExceptSetup() {
        setTitle(getContext().getString(R.string.rb_myContacts_excepts));
    }

    public void onNobodySetup() {
        setTitle(getContext().getString(R.string.rb_nobody));
    }
}