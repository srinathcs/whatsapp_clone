package com.whatsapp.clone.widgets.settingPrivacyLastSeen;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingPrivacyLastSeen.ui.utils.LastSeenItem;

public class SettingPrivacyLastSeen extends LinearLayoutCompat {
    Context mContext;
    AppCompatTextView tvTitle, tvDescription;
    AppCompatRadioButton rb_Everyone, rb_MyContact, rb_MyContactExcept, rb_Nobody;

    public SettingPrivacyLastSeen(@NonNull Context mContext) {
        this(mContext, null);
    }

    public SettingPrivacyLastSeen(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SettingPrivacyLastSeen(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
        initWidget();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View mView = inflater.inflate(R.layout.privacy_lastseen, this, true);
        tvTitle = mView.findViewById(R.id.tvTitle);
        tvDescription = mView.findViewById(R.id.tvDescription);
    }

    public void initWidget() {
        setTvTitle(getContext().getString(R.string.tvTitle));
        setTvDescription(getContext().getString(R.string.tvDescription));

    }

    public void setTvTitle(String title) {
        tvTitle.setText(title);
    }

    public void setTvDescription(String description) {
        tvDescription.setText(description);
    }

    public void setBtnName(String name) {
        rb_Everyone.setText(name);
        rb_MyContact.setText(name);
        rb_MyContactExcept.setText(name);
        rb_Nobody.setText(name);
    }


    public void setType(LastSeenItem type) {
        switch (type) {
            case EVERYONE:
                onEveryOneSetup();
                break;
            case MY_CONTACT:
                onMyContactSetup();
                break;
            case MY_CONTACT_EXCEPT:
                onMyContactExceptSetup();
                break;
            case NOBODY:
                onNobodySetup();
                break;
        }
    }

    private void onEveryOneSetup() {
        setBtnName(getContext().getString(R.string.rb_everyone));
    }

    private void onMyContactSetup() {
        setBtnName(getContext().getString(R.string.rb_myContacts));
    }

    private void onMyContactExceptSetup() {
        setBtnName(getContext().getString(R.string.rb_myContacts_excepts));
    }

    private void onNobodySetup() {
        setBtnName(getContext().getString(R.string.rb_nobody));
    }
}