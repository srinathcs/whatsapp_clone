package com.whatsapp.clone.presentation.settingChatFontFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.SettingPrivacyLastSeen;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.ui.utils.LastSeenItem;

public class SettingChatFontFragment extends AppCompatDialogFragment {
    SettingPrivacyLastSeen mSettingFontSmall, mSettingFontMedium, mSettingFontLarge;
    CardView cvFontSize;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.setting_font_size, container, false);
        getDialog().setTitle("Font size");
        initView(mView);
        onConfigSetup();
        onRadioSetup();
        return mView;
    }

    private void initView(View mView) {
        mSettingFontSmall = mView.findViewById(R.id.fontSmall);
        mSettingFontMedium = mView.findViewById(R.id.fontMedium);
        mSettingFontLarge = mView.findViewById(R.id.fontLarge);
        cvFontSize = mView.findViewById(R.id.cvFontSize);
    }
    private  void onConfigSetup(){
        mSettingFontSmall.setType(LastSeenItem.SMALL);
        mSettingFontMedium.setType(LastSeenItem.MEDIUM);
        mSettingFontLarge.setType(LastSeenItem.LARGE);
    }

    private void onRadioSetup(){
        mSettingFontSmall.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mSettingFontMedium.unSelectRadioButton();
                    mSettingFontLarge.unSelectRadioButton();
                }
            }
        });
        mSettingFontMedium.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    mSettingFontSmall.unSelectRadioButton();
                    mSettingFontLarge.unSelectRadioButton();
                }
            }
        });
        mSettingFontLarge.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mSettingFontSmall.unSelectRadioButton();
                    mSettingFontMedium.unSelectRadioButton();
                }
            }
        });
    }
}