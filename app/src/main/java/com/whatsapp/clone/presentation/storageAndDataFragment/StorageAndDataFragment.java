package com.whatsapp.clone.presentation.storageAndDataFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;

import com.whatsapp.clone.R;

public class StorageAndDataFragment extends AppCompatDialogFragment {
    AppCompatCheckBox cbPhoto, cbVideo, cbAudio, cbDocument;
    AppCompatButton btCancel, btOk;
    String myStr;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.stroage_and_data_popup, container, false);
        initView(mView);
        initWidget();
        onConfigSetup();
        return mView;
    }

    private void initView(View mView) {
        cbPhoto = mView.findViewById(R.id.cbPhoto);
        cbAudio = mView.findViewById(R.id.cbAudio);
        cbVideo = mView.findViewById(R.id.cbVideo);
        cbDocument = mView.findViewById(R.id.cbDocument);
        btCancel = mView.findViewById(R.id.btCancel);
        btOk = mView.findViewById(R.id.btOk);
    }

    private void initWidget() {
        cbPhoto.setText(R.string.storagePhoto);
        cbAudio.setText(R.string.storageAudio);
        cbVideo.setText(R.string.storageVideo);
        cbDocument.setText(R.string.storageDocument);
        Bundle data = getArguments();
        if (data != null) {
            myStr = data.getString("MyData");
        }
        getDialog().setTitle(myStr);
    }

    private void onConfigSetup() {
        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }
}
