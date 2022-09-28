package com.whatsapp.clone.presentation.chatClearAllFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;

import com.whatsapp.clone.R;

public class ChatClearAllFragment extends AppCompatDialogFragment {
    AppCompatTextView tvTitle;
    AppCompatButton btCancel, btClearChat;
    AppCompatCheckBox cbMedia, cbDeleteMessage;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.setting_chat_clear_all, container, false);
        getDialog().setTitle("Clear all chats?");
        initView(mView);
        initWidget();
        onConfigSetup();
        return mView;
    }

    private void initView(View mView) {
        tvTitle = mView.findViewById(R.id.tvTitle);
        btCancel = mView.findViewById(R.id.btCancel);
        btClearChat = mView.findViewById(R.id.btClearChats);
        cbMedia = mView.findViewById(R.id.cbClearAll);
        cbDeleteMessage = mView.findViewById(R.id.cbDeleteMessage);

    }

    private void initWidget() {
        setTitle("Message will only be removed form this device and your device on the never version of WhatsApp.");
        setCheckBoxTitle("Also delete media received in chats form the phone gallery");
        setCheckBoxTitleDelete("Delete starred message");
    }

    private void onConfigSetup() {
        btClearChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().remove(ChatClearAllFragment.this).commit();
            }
        });
        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().remove(ChatClearAllFragment.this).commit();
            }
        });
    }

    private void setTitle(String title) {
        tvTitle.setText(title);
    }

    private void setCheckBoxTitle(String cbTitle) {
        cbMedia.setText(cbTitle);
    }

    private void setCheckBoxTitleDelete(String cbDeleteTitle) {
        cbDeleteMessage.setText(cbDeleteTitle);
    }
}
