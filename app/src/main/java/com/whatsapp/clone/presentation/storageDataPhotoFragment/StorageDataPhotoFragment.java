package com.whatsapp.clone.presentation.storageDataPhotoFragment;

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
import androidx.fragment.app.DialogFragment;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.SettingPrivacyLastSeen;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.ui.utils.LastSeenItem;

public class StorageDataPhotoFragment extends AppCompatDialogFragment {
    SettingPrivacyLastSeen plAuto, plBest, plData;
    AppCompatButton btCancel, btOk;
    AppCompatTextView tvTitle;
    String myStr;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.storage_data_upload_quality, container, false);
        initView(mView);
        initWidget();
        onRadioSetup();
        return mView;
    }

    private void initView(View mView) {
        tvTitle = mView.findViewById(R.id.tvTitle);
        plAuto = mView.findViewById(R.id.photoStorageAuto);
        plBest = mView.findViewById(R.id.photoStorageBest);
        plData = mView.findViewById(R.id.photoStorageData);
        btOk = mView.findViewById(R.id.btOk);
        btCancel = mView.findViewById(R.id.btCancel);

    }

    private void initWidget() {
        plAuto.setType(LastSeenItem.AUTO);
        plBest.setType(LastSeenItem.BEST_QUALITY);
        plData.setType(LastSeenItem.DATA_SAVER);
        tvTitle.setText(R.string.photoUploadPopup);
        Bundle photo = getArguments();
        if (photo != null) {
            myStr = photo.getString("Photo");
        }
        getDialog().setTitle(myStr);
        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }

    private void onRadioSetup() {
        plAuto.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    plBest.unSelectRadioButton();
                    plData.unSelectRadioButton();
                }
            }
        });
        plData.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    plAuto.unSelectRadioButton();
                    plBest.unSelectRadioButton();
                }
            }
        });
        plBest.setRadioButtonListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    plAuto.unSelectRadioButton();
                    plData.unSelectRadioButton();
                }
            }
        });
    }

}