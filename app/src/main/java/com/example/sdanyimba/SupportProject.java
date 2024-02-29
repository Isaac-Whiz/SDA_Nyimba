package com.example.sdanyimba;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class SupportProject extends AppCompatActivity {
    private ImageButton btnCorrections, btnDonate;
    private TextView txtSupportProject;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support_project);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initViews();

        btnCorrections.setOnClickListener(view -> {
            String subject = "About the Nyimba SDA project";
            String recepient = "ssekajjawavamuno@gmail.com";
            String packAge = "com.google.android.gm";
            Intent intent = new Intent(Intent.ACTION_SEND)
                    .putExtra("This is a mail", "This opnes the mail")
                    .setType("text/plain")
                    .putExtra(Intent.EXTRA_EMAIL, new String[]{recepient})
                    .putExtra(Intent.EXTRA_SUBJECT, new String[]{subject})
                    .setPackage(packAge);
            startActivity(intent);
        });
        String text = "Matayo 6:9-13\n" +
                "Kitaffe ali mu ggulu,\n" +
                "Erinnya lyo litukuzibwe.\n" +
                "Obwakabaka bwo bujje.\n" +
                "By'oyagala bikolebwe mu nsi,\n" +
                "nga bwe bikolebwa mu ggulu.\n" +
                "Otuwe leero emmere yaffe eya leero.\n" +
                "Otusonyiwe amabanja gaffe,\n" +
                "nga naffe bwe tusonyiye abatwewolako.\n" +
                "Totutwala mu kukemebwa,\n" +
                "naye otulokole eri omubi.\n" +
                "Kubanga obwakabaka,\n" +
                "n'obuyinza, n'ekitiibwa,\n" +
                "bibyo, emirembe n'emirembe,\n" +
                "Amiina.";
        txtSupportProject.setText(text);
    }

    private void initViews() {
        btnCorrections = findViewById(R.id.btnCorrections);
        btnDonate = findViewById(R.id.btnDonate);
        txtSupportProject = findViewById(R.id.txtSupport);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(SupportProject.this, MainActivity.class)
                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(SupportProject.this, MainActivity.class)
                    .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
