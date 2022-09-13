package com.whatsapp.clone.presentation.privacyLiveLocation;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class PrivacyLiveLocationActivity extends AppCompatActivity {
    CircleImageView cvIcon;
    ActionBar actionBar;
    AppCompatTextView tvTitle,tvDescription;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_live_location);
        initView();
        initWidget();
        onActionbarSetup();
    }

    private void initView() {
        cvIcon=findViewById(R.id.civIcon);
        tvTitle=findViewById(R.id.tvTitle);
        tvDescription=findViewById(R.id.tvDescription);
    }
    private void initWidget(){
        setTitle(getString(R.string.tvTitleLive));
        setDescription(getString(R.string.tvDescriptionLive));
        setIcon(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_live_lication,getTheme()));
    }
    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.privacyLive);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    private void setTitle(String title){
        tvTitle.setText(title);
    }
    private void setDescription(String description){
        tvDescription.setText(description);
    }
    private void setIcon(Drawable drawable){
        cvIcon.setImageDrawable(drawable);

    }
}
