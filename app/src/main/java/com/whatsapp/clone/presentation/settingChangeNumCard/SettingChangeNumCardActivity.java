package com.whatsapp.clone.presentation.settingChangeNumCard;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;

import com.whatsapp.clone.R;

public class SettingChangeNumCardActivity extends AppCompatActivity {
    CardView cvChangeNum;
    AppCompatTextView tvCardTitle;
    AppCompatButton btCard;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_num_card);
        initView();
        initWidget();
    }

    private void initView() {
        cvChangeNum = findViewById(R.id.cvChangeNum);
        tvCardTitle = findViewById(R.id.tvCardTitle);
        btCard = findViewById(R.id.btCard);
    }

    private void initWidget() {
        setTitle(getString(R.string.cardTitle));
    }

    public void setTitle(String title) {
        tvCardTitle.setText(title);
    }
}