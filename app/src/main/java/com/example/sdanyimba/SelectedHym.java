package com.example.sdanyimba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;


public class SelectedHym extends AppCompatActivity {
    private TextView txtDetailedHym, txtSelectedHymNo, txtSelHymNo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_hym);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initViews();
        getIntentData();
    }

    private void initViews() {
        txtDetailedHym = findViewById(R.id.txtDetailedHym);
        txtSelectedHymNo = findViewById(R.id.txtSelectedHymNo);
        txtSelHymNo = findViewById(R.id.txtSelHymNo);

    }

    private void getIntentData() {
        Intent intent = getIntent();
        String number = intent.getStringExtra("number");
        String title = intent.getStringExtra("title");
        String longDesc = intent.getStringExtra("longDesc");

//        //Target activity
        String callingActivity = getIntent().getStringExtra("calling_activity_main");
        String currentActivity = getPackageName();

        //If data is from the Main activity
        if (callingActivity != null && callingActivity.equals(currentActivity)) {
            txtDetailedHym.setText(longDesc);
            txtSelectedHymNo.setText(number);
            txtSelHymNo.setText(title + ".");
              } else {
            txtDetailedHym.setText(longDesc);
            txtSelectedHymNo.setText(title);
            txtSelHymNo.setText(number);
        }
        }

        private void returnToPreviousActivity() {
            String callingActivity = getIntent().getStringExtra("calling_activity_main");
            String currentActivity = getPackageName();

            if (callingActivity != null && callingActivity.equals(currentActivity)) {
                startActivity(new Intent(this, MainActivity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
            } else {
                startActivity(new Intent(this, AllHyms.class)
                        .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
            }
        }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        returnToPreviousActivity();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            returnToPreviousActivity();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}