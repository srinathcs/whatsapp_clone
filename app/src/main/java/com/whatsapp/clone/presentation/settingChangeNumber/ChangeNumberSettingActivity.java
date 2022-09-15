package com.whatsapp.clone.presentation.settingChangeNumber;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.presentation.settingPhoneNumChange.SettingPhoneNumChangeActivity;
import com.whatsapp.clone.widgets.settingItemView.listener.ItemClickListener;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChangeNumberSettingActivity extends AppCompatActivity {
    private CircleImageView civIconChangeNum;
    private AppCompatTextView tvTitle,tvDescription,tvSettingDescription;
    private AppCompatButton btChangeNum;
    ActionBar actionBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_change_number);
        initView();
        initWidget();
        onActionbarSetup();
    }

    private void initView() {
        civIconChangeNum=findViewById(R.id.civIcon);
        tvTitle=findViewById(R.id.tvTitle);
        tvDescription=findViewById(R.id.tvDescription);
        tvSettingDescription=findViewById(R.id.tvSettingDescription);
        btChangeNum=findViewById(R.id.btnChangeNum);
    }
    public void setCivIconChangeNum(Drawable drawable){
        civIconChangeNum.setImageDrawable(drawable);
        btChangeNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChangeNumberSettingActivity.this, SettingPhoneNumChangeActivity.class);
                startActivity(intent);
            }
        });
    }
    public void setTitle(String title){
        tvTitle.setText(title);
    }
    public void setDescription(String description){
        tvDescription.setText(description);
    }
    public void setSettingDescription(String settingDescription){
        tvSettingDescription.setText(settingDescription);
    }
    private void initWidget(){
        setCivIconChangeNum(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_sim_change,getTheme()));
        setTitle(getString(R.string.changeNumTitle));
        setDescription(getString(R.string.changeNumDescription));
        setSettingDescription(getString(R.string.changeNumSettingDescription));

    }

    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.titleChangeNumber);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
