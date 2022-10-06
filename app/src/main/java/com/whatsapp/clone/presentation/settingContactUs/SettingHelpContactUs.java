package com.whatsapp.clone.presentation.settingContactUs;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import com.whatsapp.clone.R;

public class SettingHelpContactUs extends AppCompatActivity {
    ActionBar actionBar;
    private AppCompatEditText etHelp;
    private AppCompatTextView tvTitle, tvBottomTitle;
    private WebView wvLearnMore,wvSupport;
    private AppCompatCheckBox cbContactUs;
    private AppCompatButton btNext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        initView();
        initWidget();
        onActionbarConfig();
    }

    private void initView() {
        etHelp = findViewById(R.id.etHelp);
        tvTitle = findViewById(R.id.tvTitle);
        tvBottomTitle = findViewById(R.id.tvBottomTitle);
        wvLearnMore = findViewById(R.id.wvContactUs);
        wvSupport = findViewById(R.id.wvSupport);
        cbContactUs = findViewById(R.id.cbContactUs);
        btNext = findViewById(R.id.btnNext);
    }

    private void initWidget() {
        setTitle("Include device information? (optional)");
        setBottomTitle("We will respond to you in a WhatsApp chat");
        String str = " ";
        str += "<font color = '7c8a93'>Technical details like your model and settings can help us answer your question.</font>";
        str += "<a href=\"https://www.facebook.com/help/whatsapp/3633003156750725/?ref=share\"><font color='027eb5'>Learn more</a></font>";
        wvLearnMore.setWebChromeClient(new WebChromeClient());
        wvLearnMore.getSettings().setJavaScriptEnabled(true);
        wvLearnMore.loadData(str, "text/html", "UTF-8");
        wvLearnMore.setVerticalScrollBarEnabled(false);
        wvLearnMore.getSettings().setTextZoom(85);
        String myStr= "";
        myStr+= ("<b> For support with payment</b>, go to <a href= \"SettingChatActivity\"<font color='027eb5'> Help in your payments home screen");
        wvSupport.getSettings().setJavaScriptEnabled(true);

        wvSupport.loadData(myStr,"text/html","UTF-8");
        wvSupport.setVerticalScrollBarEnabled(false);
        wvSupport.getSettings().setTextZoom(85);
    }
    private void onActionbarConfig () {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FF000000"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle("Contact us");
        actionBar.setDisplayHomeAsUpEnabled(true);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.helpAction));
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.help_contact,menu);
        return true;
    }

    private void setTitle(String title) {
        tvTitle.setText(title);
    }

    private void setBottomTitle(String title) {
        tvBottomTitle.setText(title);
    }

}
