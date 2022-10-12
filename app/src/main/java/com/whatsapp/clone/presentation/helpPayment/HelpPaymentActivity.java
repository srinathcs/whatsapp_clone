package com.whatsapp.clone.presentation.helpPayment;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.accountItemView.AccountItemView;
import com.whatsapp.clone.widgets.accountItemView.ui.utils.AccountItem;

public class HelpPaymentActivity extends AppCompatActivity {
    ActionBar actionBar;
    private CardView cvPayment, cvHistory, cvMethod;
    private WebView wvPaymentMethod;
    private AccountItemView aivSendPayment, aivScanPayment, aivAddPayment, aivHelp;
    private AppCompatImageView ivHistory, ivPaymentMethod, ivPaymentUpi;
    private AppCompatTextView tvPaymentHistoryDescription, tvHistoryTitle, tvPaymentTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_payment);
        initView();
        initWidget();
        onActionbarSetup();
    }

    private void initView() {
        cvPayment = findViewById(R.id.cvSentPayment);
        cvHistory = findViewById(R.id.cvHistory);
        cvMethod = findViewById(R.id.cvPaymentMethod);
        aivSendPayment = findViewById(R.id.aivPayment);
        aivScanPayment = findViewById(R.id.aivScanPayment);
        aivAddPayment = findViewById(R.id.aivAddPaymentMethod);
        aivHelp = findViewById(R.id.aivHelp);
        ivHistory = findViewById(R.id.ivPaymentHistory);
        ivPaymentMethod = findViewById(R.id.ivPaymentMethod);
        tvPaymentHistoryDescription = findViewById(R.id.tvPaymentHistoryDescription);
        tvHistoryTitle = findViewById(R.id.tvTitleHistory);
        tvPaymentTitle = findViewById(R.id.tvPayment);
        wvPaymentMethod = findViewById(R.id.wvPaymentMethod);
        ivPaymentUpi = findViewById(R.id.ivUpi);
    }

    private void initWidget() {
        setDescription("No payment history");
        setHistoryTitle("History");
        setPaymentTitle("Payment methods");
        setIconPayment(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_shield_lock, getTheme()));
        setImage(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_history_document, getTheme()));
        setUpiIcon(ResourcesCompat.getDrawable(getResources(), R.drawable.ic_upi, getTheme()));
        aivSendPayment.setItemInfo(AccountItem.SEND_PAYMENT);
        aivScanPayment.setItemInfo(AccountItem.SCAN_PAYMENT);
        aivAddPayment.setItemInfo(AccountItem.ADD_PAYMENT);
        aivHelp.setItemInfo(AccountItem.HELP);
        wvPaymentMethod.setWebChromeClient(new WebChromeClient());
        wvPaymentMethod.getSettings().setJavaScriptEnabled(true);
        String str = " ";
        str += "<font color = '7c8a93'>To protect your security, WhatsApp does not store your UPI PIN or full bank account number.</font>";
        str += "<a href=\"https://www.facebook.com/help/whatsapp/129306731845141/?ref=share\"><font color='027eb5'>Learn more</a></font>";
        wvPaymentMethod.loadData(str, "text/html", "UTF-8");
        wvPaymentMethod.setVerticalScrollBarEnabled(false);
        wvPaymentMethod.getSettings().setTextZoom(90);
        wvPaymentMethod.setBackgroundColor(Color.parseColor("#b2e5da"));

    }

    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle("Payment");
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

    private void setDescription(String description) {
        tvPaymentHistoryDescription.setText(description);
    }

    private void setIconPayment(Drawable drawable) {
        ivPaymentMethod.setImageDrawable(drawable);
    }

    private void setImage(Drawable drawable) {
        ivHistory.setImageDrawable(drawable);
    }

    private void setHistoryTitle(String historyTitle) {
        tvHistoryTitle.setText(historyTitle);
    }

    private void setPaymentTitle(String paymentTitle) {
        tvPaymentTitle.setText(paymentTitle);
    }

    private void setUpiIcon(Drawable drawable) {
        ivPaymentUpi.setImageDrawable(drawable);
    }

}
