package com.whatsapp.clone.presentation.chatSettingHistory;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.whatsapp.clone.R;
import com.whatsapp.clone.presentation.chatClearAllFragment.ChatClearAllFragment;
import com.whatsapp.clone.presentation.chatDeleteAllChatsFragment.ChatDeleteAllChatFragment;
import com.whatsapp.clone.presentation.chatHistoryArchiveFragement.ChatHistoryArchiveFragment;
import com.whatsapp.clone.widgets.accountItemView.AccountItemView;
import com.whatsapp.clone.widgets.accountItemView.ui.utils.AccountItem;
import com.whatsapp.clone.widgets.settingItemView.listener.ItemClickListener;

public class ChatSettingHistoryActivity extends AppCompatActivity {
    ActionBar actionBar;
    AccountItemView aivExport, aivArchive, aivClear, aivDelete;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_history);
        initView();
        onConfigSetup();
        onActionbarSetup();
    }

    private void initView() {
        aivExport = findViewById(R.id.aivExport);
        aivArchive = findViewById(R.id.aivArchive);
        aivClear = findViewById(R.id.aivClear);
        aivDelete = findViewById(R.id.aivDelete);
    }

    private void onConfigSetup() {
        aivExport.setItemInfo(AccountItem.EXPORT_CHAT);
        aivArchive.setItemInfo(AccountItem.ARCHIVED_ALL_CHAT);
        aivClear.setItemInfo(AccountItem.CLEAR_ALL_CHATS);
        aivDelete.setItemInfo(AccountItem.DELETE_ALL_CHATS);
        aivArchive.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                ChatHistoryArchiveFragment chatHistoryArchiveFragment = new ChatHistoryArchiveFragment();
                chatHistoryArchiveFragment.show(getSupportFragmentManager(), "example");
            }
        });
        aivClear.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                ChatClearAllFragment chatClearAllFragment = new ChatClearAllFragment();
                chatClearAllFragment.show(getSupportFragmentManager(), "example");
            }
        });
        aivDelete.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                ChatDeleteAllChatFragment chatDeleteAllChatFragment = new ChatDeleteAllChatFragment();
                chatDeleteAllChatFragment.show(getSupportFragmentManager(), "example");
            }
        });
    }

    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Chat history");
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.green));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}