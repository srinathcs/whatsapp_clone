package com.whatsapp.clone.presentation.helpPayment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.res.ResourcesCompat;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.accountItemView.AccountItemView;
import com.whatsapp.clone.widgets.accountItemView.ui.utils.AccountItem;

public class HelpPaymentActivity extends AppCompatActivity {
    private CardView cvPayment,cvHistory,cvMethod;
    private AccountItemView aivSendPayment,aivScanPayment,aivAddPayment,aivHelp;
    private AppCompatImageView ivHistory,ivPaymentMethod;
    private AppCompatTextView tvPaymentHistoryDescription,tvHistoryTitle,tvPaymentTitle;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_payment);
        initView();
        initWidget();
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
    }
    private void initWidget(){
        setDescription("No payment history");
        setHistoryTitle("History");
        setPaymentTitle("Payment methods");
        setIconPayment(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_rupee,getTheme()));
        setImage(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_history_document,getTheme()));
        aivSendPayment.setItemInfo(AccountItem.SEND_PAYMENT);
        aivScanPayment.setItemInfo(AccountItem.SCAN_PAYMENT);
        aivAddPayment.setItemInfo(AccountItem.ADD_PAYMENT);
        aivHelp.setItemInfo(AccountItem.HELP);
    }
    private void setDescription(String description){
        tvPaymentHistoryDescription.setText(description);
    }
    private void setIconPayment(Drawable drawable){
        ivPaymentMethod.setImageDrawable(drawable);
    }
    private void setImage(Drawable drawable){
        ivHistory.setImageDrawable(drawable);
    }
    private void setHistoryTitle(String historyTitle){
        tvHistoryTitle.setText(historyTitle);
    }
    private void setPaymentTitle(String paymentTitle){
        tvPaymentTitle.setText(paymentTitle);
    }

}
