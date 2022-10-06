package com.whatsapp.clone.presentation.helpAppInfo;

import android.os.Bundle;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.whatsapp.clone.R;

public class HelpAppInfoActivity extends AppCompatActivity {
    private AppCompatImageView ivWallpaper, ivIcon;
    private AppCompatTextView tvTitle, tvDescription, tvLicenses, tvImageDescription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_info);
        initView();
        initWidget();
        onActionBarSetup();
    }

    private void initView() {
        ivWallpaper = findViewById(R.id.ivWallpaper);
        ivIcon = findViewById(R.id.ivIcon);
        tvTitle = findViewById(R.id.tvTitle);
        tvDescription = findViewById(R.id.tvDescription);
        tvLicenses = findViewById(R.id.tvLicenses);
        tvImageDescription = findViewById(R.id.tvImageDescription);
    }

    private void initWidget() {
        setTitle("WhatsApp Message");
        setDescription("Version 2.22.19.76");
        setImageDescription("© 2010-2022 WhatsApp Inc.");
        setLicenses("LICENSES");
    }

    private void onActionBarSetup() {
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.licenses));

    }

    private void setTitle(String title) {
        tvTitle.setText(title);
    }

    private void setDescription(String description) {
        tvDescription.setText(description);
    }

    private void setImageDescription(String imageDescription) {
        tvImageDescription.setText(imageDescription);
    }

    private void setLicenses(String licenses) {
        tvLicenses.setText(licenses);
    }

}
