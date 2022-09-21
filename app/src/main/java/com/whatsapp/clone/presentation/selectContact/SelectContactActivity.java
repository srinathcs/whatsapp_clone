package com.whatsapp.clone.presentation.selectContact;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.whatsapp.clone.R;
import com.whatsapp.clone.widgets.selectContactView.SelectContactView;
import com.whatsapp.clone.widgets.selectContactView.ui.utils.SelectContact;

public class SelectContactActivity extends AppCompatActivity {
    private SelectContactView mSelectContactGroup,mSelectContactNew;
    ActionBar actionBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_contact);
        initViews();
        onActionbarConfig();
        onSelectContactGroupSetup();
        onSelectContactNewSetup();
    }


    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater menuInflater =getMenuInflater();
        menuInflater.inflate(R.menu.contact_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void initViews() {
        mSelectContactGroup=findViewById(R.id.new_grp);
        mSelectContactNew=findViewById(R.id.new_contact);
    }
    private void onActionbarConfig(){
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(R.string.contact_title);
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
    public void onSelectContactGroupSetup(){
        mSelectContactGroup.setType(SelectContact.NEW_GROUP);
    }
    public void onSelectContactNewSetup(){
        mSelectContactNew.setType(SelectContact.NEW_CONTACT);
    }
}
