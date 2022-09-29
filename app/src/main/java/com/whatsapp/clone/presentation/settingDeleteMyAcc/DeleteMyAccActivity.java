package com.whatsapp.clone.presentation.settingDeleteMyAcc;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.setingDeleteAccItem.SettingDeleteAccItem;
import com.whatsapp.clone.widgets.settingDeleteChangeNum.SettingChangeNumDeleteAcc;
import com.whatsapp.clone.widgets.settingDeleteMyacc.DeleteMyAcc;
import com.whatsapp.clone.widgets.settingDltAccNumber.SettingDltAccNumber;

public class DeleteMyAccActivity extends AppCompatActivity {
    ActionBar actionBar;
    SettingDltAccNumber mSettingDltAccNumber;
    SettingDeleteAccItem mSettingDeleteAccOne, mSettingDeleteAccTwo, mSettingDeleteAccThree, mSettingDeleteAccFour;
    SettingChangeNumDeleteAcc mSettingChangeNumDeleteAcc;
    DeleteMyAcc mDeleteMyAcc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_my_account);
        initView();
        initWidget();
        onActionbarSetup();
    }

    private void initView() {
        mSettingDltAccNumber = findViewById(R.id.mDelete);
        mSettingDeleteAccOne = findViewById(R.id.lineOne);
        mSettingDeleteAccTwo = findViewById(R.id.lineTwo);
        mSettingDeleteAccThree = findViewById(R.id.lineThree);
        mSettingDeleteAccFour = findViewById(R.id.lineFour);
        mSettingChangeNumDeleteAcc = findViewById(R.id.mChangeNum);
        mDeleteMyAcc = findViewById(R.id.mDeleteAcc);
    }

    private void initWidget() {
        mSettingDeleteAccOne.setTitle("Delete your account form WhatsApp");
        mSettingDeleteAccTwo.setTitle("Erase your message history");
        mSettingDeleteAccThree.setTitle("Delete you from all of your WhatsApp groups");
        mSettingDeleteAccFour.setTitle("Delete your payment history and cancel any pending payments");
    }

    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.titleDeleteMyAcc);
        actionBar.setDisplayHomeAsUpEnabled(true);
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