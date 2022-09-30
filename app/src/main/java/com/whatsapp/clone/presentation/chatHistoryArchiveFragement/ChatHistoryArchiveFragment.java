package com.whatsapp.clone.presentation.chatHistoryArchiveFragement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.DialogFragment;

import com.whatsapp.clone.R;

public class ChatHistoryArchiveFragment extends AppCompatDialogFragment {
    AppCompatTextView tvTitle;
    AppCompatButton btCancel, btOk;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.setting_chat_history_card, container, false);
        initView(mView);
        initWidget();
        onConfigSetup();
        return mView;
    }

    private void initView(View mView) {
        tvTitle = mView.findViewById(R.id.cvTitle);
        btCancel = mView.findViewById(R.id.btCancel);
        btOk = mView.findViewById(R.id.btOk);
    }

    private void initWidget() {
        setTitle("Are you sure you want to archive ALL chats?");
    }

    private void onConfigSetup() {
        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().remove(ChatHistoryArchiveFragment.this).commit();
            }
        });
        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().remove(ChatHistoryArchiveFragment.this).commit();
            }
        });
    }

    private void setTitle(String title) {
        tvTitle.setText(title);
    }

}
