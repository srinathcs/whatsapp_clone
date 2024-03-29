package com.whatsapp.clone.widgets.settingPrivacyLastSeen;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.ui.utils.LastSeenItem;

import java.net.PortUnreachableException;

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
            case PHONES_LANGUAGE:
                onPhoneSetup();
                break;
            case LANGUAGE_ONE:
                onLanguageOneSetup();
                break;
            case LANGUAGE_TWO:
                onLanguageTwoSetup();
                break;
            case LANGUAGE_THREE:
                onLanguageThreeSetup();
                break;
            case LANGUAGE_FOUR:
                onLanguageFourSetup();
                break;
            case LANGUAGE_FIVE:
                onLanguageFiveSetup();
                break;
            case LANGUAGE_SIX:
                onLanguageSixSetup();
                break;
            case LANGUAGE_SEVEN:
                onLanguageSevenSetup();
                break;
            case LANGUAGE_EIGHT:
                onLanguageEightSetup();
                break;
            case LANGUAGE_NINE:
                onLanguageNineSetup();
                break;
            case LANGUAGE_TEN:
                onLanguageTenSetup();
                break;
            case AUTO:
                onAutoSetup();
                break;
            case BEST_QUALITY:
                onBestQualitySetup();
                break;
            case DATA_SAVER:
                onDataSaverSetup();
                break;
            case DEFAULT:
                onDefaultSetup();
                break;
            case SHORT:
                onShortSetup();
                break;
            case LONG:
                onLongSetup();
                break;
            case NONE:
                onNoneSetup();
                break;
            case WHITE:
                onWhiteSetup();
                break;
            case RED:
                onRedSetup();
                break;
            case YELLOW:
                onYellowSetup();
                break;
            case GREEN:
                onGreenSetup();
                break;
            case CYAN:
                onCyanSetup();
                break;
            case BLUE:
                onBlueSetup();
                break;
            case PURPLE:
                onPurple();
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
    public void onPhoneSetup(){
        setTitle(getContext().getString(R.string.langPhone));
    }
    public void onLanguageOneSetup(){
        setTitle(getContext().getString(R.string.langOne));
    }
    public void onLanguageTwoSetup(){
        setTitle(getContext().getString(R.string.langTwo));
    }
    public void onLanguageThreeSetup(){
        setTitle(getContext().getString(R.string.langThree));
    }
    public void onLanguageFourSetup(){
        setTitle(getContext().getString(R.string.langFour));
    }
    public void onLanguageFiveSetup(){
        setTitle(getContext().getString(R.string.langFive));
    }
    public void onLanguageSixSetup(){
        setTitle(getContext().getString(R.string.langSix));
    }
    public void onLanguageSevenSetup(){
        setTitle(getContext().getString(R.string.langSeven));
    }
    public void onLanguageEightSetup(){
        setTitle(getContext().getString(R.string.langEight));
    }
    public void onLanguageNineSetup(){
        setTitle(getContext().getString(R.string.langNine));
    }
    public void onLanguageTenSetup(){
        setTitle(getContext().getString(R.string.langTen));
    }
    public void onAutoSetup(){
        setTitle("Auto (recommended)");
    }
    public void onBestQualitySetup(){
        setTitle("Best quality");
    }
    public void onDataSaverSetup(){
        setTitle("Data saver");
    }
    public void onDefaultSetup(){
        setTitle("Default");
    }
    public void onShortSetup(){
        setTitle("Short");
    }
    public void onLongSetup(){
        setTitle("Long");
    }
    public void onNoneSetup(){
        setTitle("None");
    }
    public void onWhiteSetup(){
        setTitle("White");
    }
    public void onRedSetup(){
        setTitle("Red");
    }
    public void onYellowSetup(){
        setTitle("Yellow");
    }
    public void onGreenSetup(){
        setTitle("Green");
    }
    public void onCyanSetup(){
        setTitle("Cyan");
    }
    public void onBlueSetup(){
        setTitle("Blue");
    }
    public void onPurple(){
        setTitle("Purple");
    }
}