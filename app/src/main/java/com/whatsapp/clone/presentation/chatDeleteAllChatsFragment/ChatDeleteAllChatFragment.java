package com.whatsapp.clone.presentation.chatDeleteAllChatsFragment;

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
import com.whatsapp.clone.presentation.chatHistoryArchiveFragement.ChatHistoryArchiveFragment;

public class ChatDeleteAllChatFragment extends AppCompatDialogFragment {
    AppCompatTextView tvTitle;
    AppCompatButton btCancel, btDeleteAllChat;
    AppCompatCheckBox cbDeleteMedia;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.chat_history_delete_all, container, false);
        getDialog().setTitle("Delete all chats?");
        initView(mView);
        initWidget();
        onConfigSetup();
        return mView;
    }

    private void initView(View mView) {
        tvTitle = mView.findViewById(R.id.tvTitle);
        btCancel = mView.findViewById(R.id.btCancel);
        btDeleteAllChat = mView.findViewById(R.id.btDeleteChat);
        cbDeleteMedia = mView.findViewById(R.id.cbDeleteMedia);
    }

    private void initWidget() {
        setTitle("Message will only be removed form this devices and your devices on the newer versions of WhatsApp.");
        cbDeleteMedia.setText(R.string.chatDeteleAllTitle);
    }

    private void onConfigSetup() {
        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().remove(ChatDeleteAllChatFragment.this).commit();
            }
        });
        btDeleteAllChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().remove(ChatDeleteAllChatFragment.this).commit();
            }
        });
    }

    private void setTitle(String title) {
        tvTitle.setText(title);
    }
}
