package com.whatsapp.clone.presentation.settingRequestAcc;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.accountItemView.AccountItemView;
import com.whatsapp.clone.widgets.accountItemView.ui.utils.AccountItem;
import com.whatsapp.clone.widgets.settingItemView.ui.SettingItemView;
import com.whatsapp.clone.widgets.settingItemView.ui.utils.SettingItemType;
import com.whatsapp.clone.widgets.settingSecurity.SecurityFirstWeb;

import de.hdodenhof.circleimageview.CircleImageView;

public class RequestAccountActivity extends AppCompatActivity {
    ActionBar actionBar;
    WebView wvReqAcc;
    CircleImageView civReqIcon;
    AccountItemView mAccountItemView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_req_acc);
        initView();
        initWidget();
        onActionbarSetup();

    }
    private void initView() {
        wvReqAcc =findViewById(R.id.reqAccWeb);
        civReqIcon=findViewById(R.id.civReqAcc);
        mAccountItemView = findViewById(R.id.reqReport);
    }
    private void initWidget(){
        String str = " ";
        str += "<font color='black'>" + "Create a report of your WhatsApp account information and settings, Which you can access or port to another app. This report does not include your message.</font>";
        str += "<a href=\"https://faq.whatsapp.com/565386554257543/?locale=en_US\"> <font color='027eb5'>Learn more</a></font>";
        wvReqAcc.setWebChromeClient(new WebChromeClient());
        wvReqAcc.getSettings().setJavaScriptEnabled(true);
        wvReqAcc.loadData(str, "text/html", "UTF-8");
        wvReqAcc.setVerticalScrollBarEnabled(false);
        wvReqAcc.getSettings().setTextZoom(100);
        mAccountItemView.setItemInfo(AccountItem.REQUEST_REPORT);
        setIcon(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_document,getTheme()));

    }

    private void onActionbarSetup () {
            actionBar = getSupportActionBar();
            ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
            actionBar.setBackgroundDrawable(colorDrawable);
            actionBar.setTitle(R.string.titleRequestAcc);
            actionBar.setDisplayHomeAsUpEnabled(true);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                Window window = this.getWindow();
                window.setStatusBarColor(this.getResources().getColor(R.color.green));
            }
        }
        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            switch (item.getItemId()) {
                case android.R.id.home:
                    onBackPressed();
                    return true;
            }
            return super.onOptionsItemSelected(item);
        }
        private void setIcon(Drawable drawable){
        civReqIcon.setImageDrawable(drawable);
        }
}
