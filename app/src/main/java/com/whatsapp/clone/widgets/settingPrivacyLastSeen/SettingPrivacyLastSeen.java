package com.whatsapp.clone.widgets.settingPrivacyLastSeen;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;


import androidx.annotation.ColorInt;
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

    public void unSelectRadioButton() {
        mRbLastSeen.setChecked(false);

    }

    public void setRadioButtonListener(CompoundButton.OnCheckedChangeListener mListener) {
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
            case ONLY_SHARE_WITH:
                onOnlyShareSetup();
                break;
            case HOURS:
                onHourSetup();
                break;
            case DAYS:
                onDays();
                break;
            case DAY:
                onDay();
                break;
            case OFF:
                onOff();
                break;
            case SYSTEM_DEFAULT:
                onSystemDefaultSetup();
                break;
            case LIGHT:
                onLightSetup();
                break;
            case DARK:
                onDarkSetup();
                break;
            case SMALL:
                onSmallSetup();
                break;
            case MEDIUM:
                onMediumSetup();
                break;
            case LARGE:
                onLargeSetup();
                break;
        }
    }

    public void onEveryOneSetup() {
        setTitle(getContext().getString(R.string.rbEveryone));
    }

    public void onMyContactSetup() {
        setTitle(getContext().getString(R.string.rbMyContacts));
    }

    public void onMyContactExceptSetup() {
        setTitle(getContext().getString(R.string.rbContactsExcepts));
    }

    public void onNobodySetup() {
        setTitle(getContext().getString(R.string.rbNobody));
    }

    public void onOnlyShareSetup() {
        setTitle(getContext().getString(R.string.rbOnlyShare));
    }

    public void onHourSetup() {
        setTitle(getContext().getString(R.string.rbhours24));
    }

    public void onDays() {
        setTitle((getContext().getString(R.string.rb7days)));
    }

    public void onDay() {
        setTitle(getContext().getString(R.string.rbdays90));
    }

    public void onOff() {
        setTitle(getContext().getString(R.string.rboff));
    }
    public void onSystemDefaultSetup(){
        setTitle(getContext().getString(R.string.chatSystemTheme));
    }
    public void onLightSetup(){
        setTitle(getContext().getString(R.string.chatLightTheme));
    }
    public void onDarkSetup(){
        setTitle(getContext().getString(R.string.chatDarkTheme));
    }
    public void onSmallSetup(){
        setTitle(getContext().getString(R.string.fontSmall));
    }
    public void onMediumSetup(){
        setTitle(getContext().getString(R.string.fontMedium));
    }
    public void onLargeSetup(){
        setTitle(getContext().getString(R.string.fontLarge));
    }
}