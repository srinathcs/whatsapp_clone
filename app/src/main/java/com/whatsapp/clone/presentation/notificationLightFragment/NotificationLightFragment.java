package com.whatsapp.clone.presentation.notificationLightFragment;

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

public class NotificationLightFragment extends AppCompatDialogFragment {
    SettingPrivacyLastSeen lNone, lWhite, lRed, lYellow, lGreen, lCyan, lBlue, lPurple;
    String myStr;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.notification_light_fragment, container, false);
        getDialog().setTitle("Light");
        initView(mView);
        initWidget();
        onRadioSetup();
        return mView;
    }

    private void initView(View mView) {
        lNone = mView.findViewById(R.id.lNone);
        lWhite = mView.findViewById(R.id.lWhite);
        lRed = mView.findViewById(R.id.lRed);
        lYellow = mView.findViewById(R.id.lYellow);
        lGreen = mView.findViewById(R.id.lGreen);
        lCyan = mView.findViewById(R.id.lCyan);
        lBlue = mView.findViewById(R.id.lBlue);
        lPurple = mView.findViewById(R.id.lPurple);
    }

    private void initWidget() {
        lNone.setType(LastSeenItem.NONE);
        lWhite.setType(LastSeenItem.WHITE);
        lRed.setType(LastSeenItem.RED);
        lYellow.setType(LastSeenItem.YELLOW);
        lGreen.setType(LastSeenItem.GREEN);
        lCyan.setType(LastSeenItem.CYAN);
        lBlue.setType(LastSeenItem.BLUE);
        lPurple.setType(LastSeenItem.PURPLE);
    }

    private void onRadioSetup() {
        lNone.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    lWhite.unSelectRadioButton();
                    lRed.unSelectRadioButton();
                    lYellow.unSelectRadioButton();
                    lGreen.unSelectRadioButton();
                    lCyan.unSelectRadioButton();
                    lBlue.unSelectRadioButton();
                    lPurple.unSelectRadioButton();
                }
            }
        });
        lWhite.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    lNone.unSelectRadioButton();
                    lRed.unSelectRadioButton();
                    lYellow.unSelectRadioButton();
                    lGreen.unSelectRadioButton();
                    lCyan.unSelectRadioButton();
                    lBlue.unSelectRadioButton();
                    lPurple.unSelectRadioButton();
                }
            }
        });
        lRed.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    lWhite.unSelectRadioButton();
                    lNone.unSelectRadioButton();
                    lYellow.unSelectRadioButton();
                    lGreen.unSelectRadioButton();
                    lCyan.unSelectRadioButton();
                    lBlue.unSelectRadioButton();
                    lPurple.unSelectRadioButton();
                }
            }
        });
        lYellow.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    lWhite.unSelectRadioButton();
                    lRed.unSelectRadioButton();
                    lNone.unSelectRadioButton();
                    lGreen.unSelectRadioButton();
                    lCyan.unSelectRadioButton();
                    lBlue.unSelectRadioButton();
                    lPurple.unSelectRadioButton();
                }
            }
        });
        lGreen.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    lWhite.unSelectRadioButton();
                    lRed.unSelectRadioButton();
                    lYellow.unSelectRadioButton();
                    lNone.unSelectRadioButton();
                    lCyan.unSelectRadioButton();
                    lBlue.unSelectRadioButton();
                    lPurple.unSelectRadioButton();
                }
            }
        });
        lCyan.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    lWhite.unSelectRadioButton();
                    lRed.unSelectRadioButton();
                    lYellow.unSelectRadioButton();
                    lGreen.unSelectRadioButton();
                    lNone.unSelectRadioButton();
                    lBlue.unSelectRadioButton();
                    lPurple.unSelectRadioButton();
                }
            }
        });
        lBlue.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    lWhite.unSelectRadioButton();
                    lRed.unSelectRadioButton();
                    lYellow.unSelectRadioButton();
                    lGreen.unSelectRadioButton();
                    lCyan.unSelectRadioButton();
                    lNone.unSelectRadioButton();
                    lPurple.unSelectRadioButton();
                }
            }
        });
        lPurple.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    lWhite.unSelectRadioButton();
                    lRed.unSelectRadioButton();
                    lYellow.unSelectRadioButton();
                    lGreen.unSelectRadioButton();
                    lCyan.unSelectRadioButton();
                    lBlue.unSelectRadioButton();
                    lNone.unSelectRadioButton();
                }
            }
        });
    }
}
