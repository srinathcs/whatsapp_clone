package com.whatsapp.clone.presentation.notificationVibrateFragment;

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

public class NotificationVibrateFragment extends AppCompatDialogFragment {
    SettingPrivacyLastSeen plOff, plDefault, plShort, plLong;
    String myStr;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.notification_vibrate_popup, container, false);
        getDialog().setTitle("Vibrate");
        initView(mView);
        initWidget();
        onRadioSetup();
        return mView;
    }

    private void initView(View mView) {
        plOff = mView.findViewById(R.id.vOff);
        plDefault = mView.findViewById(R.id.vDefault);
        plShort = mView.findViewById(R.id.vShort);
        plLong = mView.findViewById(R.id.vLong);
    }

    private void initWidget() {
        plOff.setType(LastSeenItem.OFF);
        plDefault.setType(LastSeenItem.DEFAULT);
        plShort.setType(LastSeenItem.SHORT);
        plLong.setType(LastSeenItem.LONG);
    }

    private void onRadioSetup() {
        plOff.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    plDefault.unSelectRadioButton();
                    plShort.unSelectRadioButton();
                    plLong.unSelectRadioButton();
                }
            }
        });
        plLong.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    plDefault.unSelectRadioButton();
                    plShort.unSelectRadioButton();
                    plOff.unSelectRadioButton();
                }
            }
        });
        plShort.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    plOff.unSelectRadioButton();
                    plDefault.unSelectRadioButton();
                    plLong.unSelectRadioButton();
                }
            }
        });
        plDefault.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    plOff.unSelectRadioButton();
                    plLong.unSelectRadioButton();
                    plShort.unSelectRadioButton();
                }
            }
        });
    }
}
