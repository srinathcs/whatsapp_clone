package com.whatsapp.clone.presentation.chatSettingCardTheme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;


import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.SettingPrivacyLastSeen;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.ui.utils.LastSeenItem;

public class ChatSettingThemeFragment extends AppCompatDialogFragment {
    AppCompatTextView tvTitle;
    SettingPrivacyLastSeen mSettingChatSystem, mSettingChatLight, mSettingChatDark;
    CardView cvChangeTheme;
    AppCompatButton btCancel, btOk;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.setting_card_chat, container, false);
        initView(mView);
        onConfigSetup();
        onRadioSetup();
        return mView;
    }

    private void initView(View mView) {
        tvTitle = mView.findViewById(R.id.tvCardChat);
        cvChangeTheme = mView.findViewById(R.id.cvChangTheme);
        btOk = mView.findViewById(R.id.btOk);
        btCancel = mView.findViewById(R.id.btCancel);
        mSettingChatSystem = mView.findViewById(R.id.chatSystem);
        mSettingChatLight = mView.findViewById(R.id.chatLight);
        mSettingChatDark = mView.findViewById(R.id.chatDark);
    }

    public void onConfigSetup() {
        mSettingChatSystem.setType(LastSeenItem.SYSTEM_DEFAULT);
        mSettingChatLight.setType(LastSeenItem.LIGHT);
        mSettingChatDark.setType(LastSeenItem.DARK);
        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().remove(ChatSettingThemeFragment.this).commit();
            }
        });
        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().remove(ChatSettingThemeFragment.this).commit();
            }
        });
    }
    private void onRadioSetup(){
        mSettingChatSystem.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mSettingChatLight.unSelectRadioButton();
                    mSettingChatDark.unSelectRadioButton();
                }
            }
        });
        mSettingChatLight.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mSettingChatSystem.unSelectRadioButton();
                    mSettingChatDark.unSelectRadioButton();
                }
            }
        });
        mSettingChatDark.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mSettingChatSystem.unSelectRadioButton();
                    mSettingChatLight.unSelectRadioButton();
                }
            }
        });
    }
}
