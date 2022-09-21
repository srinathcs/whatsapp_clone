package com.whatsapp.clone.presentation.settingPhoneNumChange;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingChangeNumberItem.SettingChangeNumItem;
import com.whatsapp.clone.widgets.settingItemView.listener.ItemClickListener;

public class SettingPhoneNumChangeActivity extends AppCompatActivity {
    AppCompatButton btCard, btnChangeNum;
    Dialog dialog;
    private ItemClickListener mItemClickListener;
    LinearLayoutCompat llParent;
    SettingChangeNumItem mSettingChangeNumOld, mSettingChangeNumNew;
    ActionBar actionBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_number_change);
        initView();
        initWidget();
        onActionbarSetup();
    }

    private void initView() {
        llParent=findViewById(R.id.llParent);
        mSettingChangeNumOld = findViewById(R.id.oldPhone);
        mSettingChangeNumNew = findViewById(R.id.newPhone);
        btnChangeNum = findViewById(R.id.btnChangeNum);
        btCard = findViewById(R.id.btCard);
        dialog = new Dialog(this);

    }

    private void initWidget() {
        mSettingChangeNumOld.setTitle(getString(R.string.oldTitle));
        mSettingChangeNumNew.setTitle(getString(R.string.newPhoneTitle));

        btnChangeNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBtnPopup();
            }
        });
    }

    private void onBtnPopup() {
        dialog.setContentView(R.layout.change_num_card);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
        AppCompatButton button =dialog.findViewById(R.id.btCard);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }
    private void setupEvent(){
        llParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mItemClickListener!=null){
                    mItemClickListener.onClicked();
                }
            }
        });
    }
    public void setItemClickListener(ItemClickListener listener) {
        this.mItemClickListener = listener;
    }


    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.titleChangeNum);
        actionBar.setDisplayHomeAsUpEnabled(true);
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            Window window= this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.green));
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}