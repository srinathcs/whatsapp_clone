package com.whatsapp.clone.presentation.settingNotification;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentTransaction;

import com.whatsapp.clone.R;
import com.whatsapp.clone.presentation.notificationLightFragment.NotificationLightFragment;
import com.whatsapp.clone.presentation.notificationVibrateFragment.NotificationVibrateFragment;
import com.whatsapp.clone.widgets.settingItemView.listener.ItemClickListener;
import com.whatsapp.clone.widgets.settingPrivacy.PrivacyItemView;
import com.whatsapp.clone.widgets.settingPrivacy.ReadReceipts;
import com.whatsapp.clone.widgets.settingPrivacy.ui.utils.PrivacyItem;

public class NotificationActivity extends AppCompatActivity {
    ActionBar actionBar;
    ReadReceipts mNotificationTones, mNotificationMessageHighPriority, mNotificationMessageReaction, mNotificationGroupPriority, mNotificationGroupReaction;
    PrivacyItemView mNotificationTone, mNotificationVibrate, mNotificationLight, mNotificationRingtone, mNotificationGroupVibrate, mNotificationGroupLight, mNotificationCallRingtone, mNotificationCallVibrate;
    AppCompatTextView tvGroupTitle, tvCallTitle, tvMessageTitle, tvPopTitle, tvPopDescription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        initView();
        initWidget();
        onConfigSetup();
        onSetupFragment();
        onActionbarSetup();
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.notification_menu,menu);
        return true;
    }

    private void initView() {
        mNotificationTones = findViewById(R.id.notificationTones);
        mNotificationMessageHighPriority = findViewById(R.id.notificationMessageHighPriority);
        mNotificationMessageReaction = findViewById(R.id.notificationMessageReaction);
        mNotificationGroupPriority = findViewById(R.id.notificationGroupPriority);
        mNotificationGroupReaction = findViewById(R.id.notificationGroupReaction);
        mNotificationTone = findViewById(R.id.notificationTone);
        mNotificationVibrate = findViewById(R.id.notificationVibrate);
        mNotificationLight = findViewById(R.id.notificationLight);
        mNotificationRingtone = findViewById(R.id.notificationRingtone);
        mNotificationGroupVibrate = findViewById(R.id.notificationGroupVibrate);
        mNotificationGroupLight = findViewById(R.id.notificationGroupLight);
        mNotificationCallRingtone = findViewById(R.id.notificationCallRingtone);
        mNotificationCallVibrate = findViewById(R.id.notificationCallVibrate);
        tvGroupTitle = findViewById(R.id.notificationGroup);
        tvCallTitle = findViewById(R.id.notificationCall);
        tvMessageTitle = findViewById(R.id.notificationMsg);
        tvPopTitle = findViewById(R.id.tvPopTitle);
        tvPopDescription = findViewById(R.id.tvPopDescription);

    }

    private void initWidget() {
        mNotificationTones.setTitle("Conversation tones");
        mNotificationTones.setDescription("Play sound for incoming and outgoing message.");
        mNotificationMessageHighPriority.setTitle("Use high priority notification");
        mNotificationMessageHighPriority.setDescription("Show previews of notification at the top of the screen");
        mNotificationMessageReaction.setTitle("Reaction Notifications");
        mNotificationMessageReaction.setDescription("Show notification for reaction to message you send");
        mNotificationGroupPriority.setTitle("Use high priority notification");
        mNotificationGroupPriority.setDescription("Show previews of notification at the top of the screen");
        mNotificationGroupReaction.setTitle("Reaction Notification");
        mNotificationGroupReaction.setDescription("Show notification for reactions to message you send");
        setMessageTitle("Message");
        setGroupTitle("Group");
        setCallTitle("Calls");
        setPopTitle("Popup notification");
        setPopDescription("Not available");
    }

    private void onConfigSetup() {
        mNotificationTone.setType(PrivacyItem.NOTIFICATION_TONE_MESSAGE);
        mNotificationVibrate.setType(PrivacyItem.VIBRATE_MESSAGE);
        mNotificationLight.setType(PrivacyItem.LIGHT_MESSAGE);
        mNotificationRingtone.setType(PrivacyItem.NOTIFICATION_TONE_GROUP);
        mNotificationGroupVibrate.setType(PrivacyItem.VIBRATE_GROUP);
        mNotificationGroupLight.setType(PrivacyItem.LIGHT_GROUP);
        mNotificationCallRingtone.setType(PrivacyItem.RINGTONE_CALL);
        mNotificationCallVibrate.setType(PrivacyItem.VIBRATE_CALL);
    }

    private void onSetupFragment(){
        mNotificationVibrate.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                NotificationVibrateFragment notificationVibrateFragment = new NotificationVibrateFragment();
                notificationVibrateFragment.show(getSupportFragmentManager(),"example");
            }
        });
        mNotificationLight.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                NotificationLightFragment notificationLightFragment = new NotificationLightFragment();
                notificationLightFragment.show(getSupportFragmentManager(),"Example");
            }
        });
        mNotificationGroupVibrate.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                NotificationVibrateFragment notificationVibrateFragment = new NotificationVibrateFragment();
                notificationVibrateFragment.show(getSupportFragmentManager(),"Example");
            }
        });
        mNotificationGroupLight.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                NotificationLightFragment notificationLightFragment = new NotificationLightFragment();
                notificationLightFragment.show(getSupportFragmentManager(),"Example");
            }
        });
        mNotificationCallVibrate.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClicked() {
                NotificationVibrateFragment notificationVibrateFragment = new NotificationVibrateFragment();
                notificationVibrateFragment.show(getSupportFragmentManager(),"example");
            }
        });
    }

    private void onActionbarSetup() {
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#008069"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Notification");
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

    private void setMessageTitle(String title) {
        tvMessageTitle.setText(title);
    }

    private void setGroupTitle(String groupTitle) {
        tvGroupTitle.setText(groupTitle);
    }

    private void setCallTitle(String callTitle) {
        tvCallTitle.setText(callTitle);
    }

    private void setPopTitle(String popTitle) {
        tvPopTitle.setText(popTitle);
    }

    private void setPopDescription(String popDescription) {
        tvPopDescription.setText(popDescription);
    }
}