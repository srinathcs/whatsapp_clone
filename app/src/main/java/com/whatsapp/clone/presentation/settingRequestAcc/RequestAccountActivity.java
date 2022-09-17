package com.whatsapp.clone.presentation.settingRequestAcc;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.settingItemView.ui.SettingItemView;
import com.whatsapp.clone.widgets.settingItemView.ui.utils.SettingItemType;
import com.whatsapp.clone.widgets.settingSecurity.SecurityFirstWeb;

public class RequestAccountActivity extends AppCompatActivity {
    ActionBar actionBar;
    SecurityFirstWeb mSecurityFirstWeb;
    SettingItemView mSettingItemView;
    AppCompatTextView tvTitle, tvDescription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_req_acc);
        initView();
        initWidget();
        onActionbarSetup();
    }

    private void initView() {
        mSecurityFirstWeb =findViewById(R.id.reqWeb);
        mSettingItemView = findViewById(R.id.reqSent);
        tvTitle = findViewById(R.id.tvTitle);
        tvDescription = findViewById(R.id.tvDescription);

    }
    private void initWidget(){
        mSecurityFirstWeb.SetIcon(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_document,getTheme()));
        String str = " ";
        str += "<font color='black'>" + "Message and calls in en-to-end encrypted chats stay between you and the people you choose.Not even WhatsApp can read or listen to them.</font>";
        str += "<a href=\"https://www.whatsapp.com/security?lg=en&lc=IN&eea=0\"> <font color='027eb5'>Learn more</a></font>";

    }
    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.titleRequestAcc);
        actionBar.setDisplayHomeAsUpEnabled(true);
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
    public void setTitle(String title){
        tvTitle.setText(title);
    }
    public void setDescription(String description){
        tvDescription.setText(description);
    }
    public void setType(SettingItemType type){
        switch (type){
            case REQUEST_SENT:
                onRequestSentSetup();
                break;
        }
    }
    private void onRequestSentSetup(){
        setTitle(getString(R.string.reqAccItemTitle));
        setDescription(getString(R.string.reqAccItemDescription));
        mSettingItemView.setIcon(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_time,getTheme()));
    }


}
