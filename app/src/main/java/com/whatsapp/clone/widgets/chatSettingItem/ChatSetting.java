package com.whatsapp.clone.widgets.chatSettingItem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacy.PrivacyItemView;
import com.whatsapp.clone.widgets.settingPrivacy.ReadReceipts;

public class ChatSetting extends LinearLayoutCompat {
    Context mContext;
    ReadReceipts mReadReceiptsSend, mReadReceiptsMedia;
    PrivacyItemView mPrivacyItemView;
    AppCompatTextView tvTitle;

    public ChatSetting(@NonNull Context mContext) {
        this(mContext, null);
    }

    public ChatSetting(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ChatSetting(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        initView();
        initWidget();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.setting_chat_setting, this, true);
        mReadReceiptsSend = mView.findViewById(R.id.chatSettingSend);
        mReadReceiptsMedia = mView.findViewById(R.id.chatSettingMedia);
        mPrivacyItemView = mView.findViewById(R.id.chatFont);
        tvTitle = mView.findViewById(R.id.tvTitle);
    }

    private void initWidget() {
        mReadReceiptsSend.setTitle("Enter is send");
        mReadReceiptsSend.setDescription("Enter key will send your message");
        mReadReceiptsMedia.setTitle("Media visibility");
        mReadReceiptsMedia.setDescription("Show newly download media in your phone's gallery");
        mPrivacyItemView.setTitle("Font size");
        mPrivacyItemView.setDescription("Medium");
        setTitle("Chat setting");
    }

    public void setTitle(String title) {
        tvTitle.setText(title);
    }
}
