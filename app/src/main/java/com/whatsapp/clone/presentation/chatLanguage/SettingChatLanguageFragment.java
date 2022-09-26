package com.whatsapp.clone.presentation.chatLanguage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.SettingPrivacyLastSeen;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.ui.utils.LastSeenItem;

public class SettingChatLanguageFragment extends AppCompatDialogFragment {
    SettingPrivacyLastSeen mPhoneLang, mLangOne, mLangTwo, mLangThree, mLangFour, mLangFive, mLangSix, mLangSeven, mLangEight, mLangNine, mLangTen;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.setting_chat_language, container, false);
        getDialog().setTitle("App Language");
        initView(mView);
        onConfigSetup();
        return mView;
    }

    private void initView(View mView) {
        mPhoneLang = mView.findViewById(R.id.phoneLanguage);
        mLangOne = mView.findViewById(R.id.langOne);
        mLangTwo = mView.findViewById(R.id.langTwo);
        mLangThree = mView.findViewById(R.id.langThree);
        mLangFour = mView.findViewById(R.id.langFour);
        mLangFive = mView.findViewById(R.id.langFive);
        mLangSix = mView.findViewById(R.id.langSix);
        mLangSeven = mView.findViewById(R.id.langSeven);
        mLangEight = mView.findViewById(R.id.langEight);
        mLangNine = mView.findViewById(R.id.langNine);
        mLangTen = mView.findViewById(R.id.langTen);
    }

    private void onConfigSetup() {
        mPhoneLang.setType(LastSeenItem.PHONES_LANGUAGE);
        mLangOne.setType(LastSeenItem.LANGUAGE_ONE);
        mLangTwo.setType(LastSeenItem.LANGUAGE_TWO);
        mLangThree.setType(LastSeenItem.LANGUAGE_THREE);
        mLangFour.setType(LastSeenItem.LANGUAGE_FOUR);
        mLangFive.setType(LastSeenItem.LANGUAGE_FIVE);
        mLangSix.setType(LastSeenItem.LANGUAGE_SIX);
        mLangSeven.setType(LastSeenItem.LANGUAGE_SEVEN);
        mLangEight.setType(LastSeenItem.LANGUAGE_EIGHT);
        mLangNine.setType(LastSeenItem.LANGUAGE_NINE);
        mLangTen.setType(LastSeenItem.LANGUAGE_TEN);
    }
}
