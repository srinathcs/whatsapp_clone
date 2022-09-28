package com.whatsapp.clone.presentation.chatLanguageFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

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
        onRadioSetup();
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

    private void onRadioSetup() {
        mPhoneLang.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mLangOne.unSelectRadioButton();
                    mLangTwo.unSelectRadioButton();
                    mLangThree.unSelectRadioButton();
                    mLangFour.unSelectRadioButton();
                    mLangFive.unSelectRadioButton();
                    mLangSix.unSelectRadioButton();
                    mLangSeven.unSelectRadioButton();
                    mLangEight.unSelectRadioButton();
                    mLangNine.unSelectRadioButton();
                    mLangTen.unSelectRadioButton();
                }
            }
        });
        mLangOne.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mPhoneLang.unSelectRadioButton();
                    mLangTwo.unSelectRadioButton();
                    mLangThree.unSelectRadioButton();
                    mLangFour.unSelectRadioButton();
                    mLangFive.unSelectRadioButton();
                    mLangSix.unSelectRadioButton();
                    mLangSeven.unSelectRadioButton();
                    mLangEight.unSelectRadioButton();
                    mLangNine.unSelectRadioButton();
                    mLangTen.unSelectRadioButton();
                }
            }
        });
        mLangTwo.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mPhoneLang.unSelectRadioButton();
                    mLangOne.unSelectRadioButton();
                    mLangThree.unSelectRadioButton();
                    mLangFour.unSelectRadioButton();
                    mLangFive.unSelectRadioButton();
                    mLangSix.unSelectRadioButton();
                    mLangSeven.unSelectRadioButton();
                    mLangEight.unSelectRadioButton();
                    mLangNine.unSelectRadioButton();
                    mLangTen.unSelectRadioButton();
                }
            }
        });
        mLangThree.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mPhoneLang.unSelectRadioButton();
                    mLangOne.unSelectRadioButton();
                    mLangTwo.unSelectRadioButton();
                    mLangFour.unSelectRadioButton();
                    mLangFive.unSelectRadioButton();
                    mLangSix.unSelectRadioButton();
                    mLangSeven.unSelectRadioButton();
                    mLangEight.unSelectRadioButton();
                    mLangNine.unSelectRadioButton();
                    mLangTen.unSelectRadioButton();
                }
            }
        });
        mLangFour.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mPhoneLang.unSelectRadioButton();
                    mLangOne.unSelectRadioButton();
                    mLangThree.unSelectRadioButton();
                    mLangTwo.unSelectRadioButton();
                    mLangFive.unSelectRadioButton();
                    mLangSix.unSelectRadioButton();
                    mLangSeven.unSelectRadioButton();
                    mLangEight.unSelectRadioButton();
                    mLangNine.unSelectRadioButton();
                    mLangTen.unSelectRadioButton();
                }
            }
        });
        mLangFive.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mPhoneLang.unSelectRadioButton();
                    mLangOne.unSelectRadioButton();
                    mLangThree.unSelectRadioButton();
                    mLangFour.unSelectRadioButton();
                    mLangTwo.unSelectRadioButton();
                    mLangSix.unSelectRadioButton();
                    mLangSeven.unSelectRadioButton();
                    mLangEight.unSelectRadioButton();
                    mLangNine.unSelectRadioButton();
                    mLangTen.unSelectRadioButton();
                }
            }
        });
        mLangSix.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mPhoneLang.unSelectRadioButton();
                    mLangOne.unSelectRadioButton();
                    mLangThree.unSelectRadioButton();
                    mLangFour.unSelectRadioButton();
                    mLangFive.unSelectRadioButton();
                    mLangTwo.unSelectRadioButton();
                    mLangSeven.unSelectRadioButton();
                    mLangEight.unSelectRadioButton();
                    mLangNine.unSelectRadioButton();
                    mLangTen.unSelectRadioButton();
                }
            }
        });
        mLangSeven.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mPhoneLang.unSelectRadioButton();
                    mLangOne.unSelectRadioButton();
                    mLangThree.unSelectRadioButton();
                    mLangFour.unSelectRadioButton();
                    mLangFive.unSelectRadioButton();
                    mLangSix.unSelectRadioButton();
                    mLangTwo.unSelectRadioButton();
                    mLangEight.unSelectRadioButton();
                    mLangNine.unSelectRadioButton();
                    mLangTen.unSelectRadioButton();
                }
            }
        });
        mLangEight.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mPhoneLang.unSelectRadioButton();
                    mLangOne.unSelectRadioButton();
                    mLangThree.unSelectRadioButton();
                    mLangFour.unSelectRadioButton();
                    mLangFive.unSelectRadioButton();
                    mLangSix.unSelectRadioButton();
                    mLangSeven.unSelectRadioButton();
                    mLangTwo.unSelectRadioButton();
                    mLangNine.unSelectRadioButton();
                    mLangTen.unSelectRadioButton();
                }
            }
        });
        mLangNine.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mPhoneLang.unSelectRadioButton();
                    mLangOne.unSelectRadioButton();
                    mLangThree.unSelectRadioButton();
                    mLangFour.unSelectRadioButton();
                    mLangFive.unSelectRadioButton();
                    mLangSix.unSelectRadioButton();
                    mLangSeven.unSelectRadioButton();
                    mLangEight.unSelectRadioButton();
                    mLangTwo.unSelectRadioButton();
                    mLangTen.unSelectRadioButton();
                }
            }
        });
        mLangTen.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mPhoneLang.unSelectRadioButton();
                    mLangOne.unSelectRadioButton();
                    mLangThree.unSelectRadioButton();
                    mLangFour.unSelectRadioButton();
                    mLangFive.unSelectRadioButton();
                    mLangSix.unSelectRadioButton();
                    mLangSeven.unSelectRadioButton();
                    mLangEight.unSelectRadioButton();
                    mLangNine.unSelectRadioButton();
                    mLangTwo.unSelectRadioButton();
                }
            }
        });
    }
}
