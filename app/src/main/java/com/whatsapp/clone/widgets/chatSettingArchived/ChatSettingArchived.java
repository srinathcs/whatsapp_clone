package com.whatsapp.clone.widgets.chatSettingArchived;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.accountItemView.AccountItemView;
import com.whatsapp.clone.widgets.settingItemView.ui.SettingItemView;
import com.whatsapp.clone.widgets.settingPrivacy.ReadReceipts;

public class ChatSettingArchived extends LinearLayoutCompat {
    Context mContext;
    AppCompatTextView tvTitle;
    AppCompatTextView tvTitleChat, tvDescription;
    SwitchCompat scSwitch;
    SettingItemView mSettingItemView;
    AccountItemView mAccountItemBackup, mAccountItemHistory;

    public ChatSettingArchived(@NonNull Context mContext) {
        this(mContext, null);
    }

    public ChatSettingArchived(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ChatSettingArchived(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
        initWidget();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.setting_chat_archived, this, true);
        tvTitle = mView.findViewById(R.id.tvTitle);
        tvTitleChat = mView.findViewById(R.id.tvTitleChat);
        tvDescription = mView.findViewById(R.id.tvDescription);
        scSwitch = mView.findViewById(R.id.scReceipts);
        mSettingItemView = mView.findViewById(R.id.chatAppLang);
        mAccountItemBackup = mView.findViewById(R.id.chatBackup);
        mAccountItemHistory = mView.findViewById(R.id.chatHistory);
    }

    private void initWidget() {
        setTitle("Archived chats");
        setTitleChat("Keep chats archived");
        setDescription("Archived chats will remain archived when you receive a new message");
        mSettingItemView.setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_global, mContext.getTheme()));
        mSettingItemView.setTitle("App Language");
        mSettingItemView.setDescription("Phone's language (English)");
        mAccountItemBackup.setTitle("Chat backup");
        mAccountItemBackup.setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_cloud_backup, mContext.getTheme()));
        mAccountItemHistory.setTitle("Chat history");
        mAccountItemHistory.setIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_history, mContext.getTheme()));
    }

    public void setTitleChat(String titleChat) {
        tvTitleChat.setText(titleChat);
    }

    public void setTitle(String title) {
        tvTitle.setText(title);
    }

    public void setDescription(String description) {
        tvDescription.setText(description);
    }
}
