package com.example.sdanyimba;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawer;
    private NavigationView navigationView;
    private MaterialToolbar toolbar;
    private TextView txtSearch, txtError;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnX, btnGo;
    private ImageButton btnAll;
    private final StringBuilder input = new StringBuilder();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
         ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.open_drawer, R.string.drawer_closed);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.allHyms) {
                startActivity(new Intent(getApplicationContext(), AllHyms.class)
                        .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
                return true;
            }
            else if (itemId == R.id.supportProject) {
                startActivity(new Intent(getApplicationContext(), SupportProject.class)
                        .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
                return true;
            }
            else if (itemId == R.id.aboutUs) {
                if (isNetworkAvailable(getApplicationContext())) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://github.com/Isaac-Whiz")));
                }
                return true;
            }
            else if (itemId == R.id.userPolicy) {
                String url = "https://drive.google.com/drive/folders/131W2SklMSACfh2koG9Bcx0tVLs6NgtVO?usp=sharing";
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, url);
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent, "Share app download link"));
                return true;
            }
        return false;
        });

        //Call the button clicks method
        buttonClick();
    }
    private boolean isNetworkAvailable(Context context){
        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (manager != null){
            NetworkInfo networkInfo = manager.getActiveNetworkInfo();
            if (networkInfo != null)
                return networkInfo.isConnected();
            Toast.makeText(context, "Enable internet connection first.", Toast.LENGTH_SHORT).show();
        }
        return false;
    }

    private void initViews() {
        drawer = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navigationView);
        toolbar = findViewById(R.id.toolbar);
        txtSearch = findViewById(R.id.txtSearch);
        txtError = findViewById(R.id.txtError);
        btn0 = findViewById(R.id.btn0);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btnGo = findViewById(R.id.btnGo);
        btn9 = findViewById(R.id.btn9);
        btnX = findViewById(R.id.btnX);
        btn1 = findViewById(R.id.btn1);
        btnAll = findViewById(R.id.btnAll);
    }

    private void populateTextView(Button button, int element, TextView textView) {
        int limit = 3;
        button.setOnClickListener(view -> {
            if (input.length() < limit) {
                    input.append(element);
                }
            textView.setText(input);
        });
    }
    private void buttonClick() {
        populateTextView(btn0, 0, txtSearch);
        populateTextView(btn1, 1, txtSearch);
        populateTextView(btn2, 2, txtSearch);
        populateTextView(btn3, 3, txtSearch);
        populateTextView(btn4, 4, txtSearch);
        populateTextView(btn5, 5, txtSearch);
        populateTextView(btn6, 6, txtSearch);
        populateTextView(btn7, 7, txtSearch);
        populateTextView(btn8, 8, txtSearch);
        populateTextView(btn9, 9, txtSearch);

        btnGo.setOnClickListener(view -> {
            if (txtSearch.getText().equals("")) {
                startActivity(new Intent(MainActivity.this, AllHyms.class)
                        .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
            } else {
                int input = Integer.parseInt(txtSearch.getText().toString());
                if (input > 250 || input == 0) {
                    txtSearch.setText("");
                    resetBuilder();
                    txtError.setVisibility(View.VISIBLE);
                } else {
                    txtError.setVisibility(View.INVISIBLE);
                    DbClass dbClass = new DbClass(MainActivity.this);
                    try {
                        String text = txtSearch.getText().toString();
                        SQLiteDatabase database = dbClass.getReadableDatabase();
                        Cursor cursor = database.query("ennyimba", null, "HymNo = ?", new String[]{text}, null, null, null);
                        if (cursor != null) {
                            cursor.moveToFirst();
                            for (int i = 0; i < cursor.getCount(); i++) {

                                String name = cursor.getString(0);
                                String number = cursor.getString(1);
                                String longDesc = cursor.getString(2);
                                //Calling activity
                                String callingActivity = getPackageName();

                                startActivity(new Intent(view.getContext(), SelectedHym.class)
                                        .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK)
                                        .putExtra("calling_activity_main", callingActivity)
                                        .putExtra("number", number)
                                        .putExtra("title", name)
                                        .putExtra("longDesc", longDesc));
                            }
                        }
                        cursor.close();
                        database.close();

                    } catch (SQLException v) {
                        String error = v.getLocalizedMessage();
                        Toast.makeText(MainActivity.this, "Failed to fetch data " + error, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btnX.setOnClickListener(view -> {
            resetBuilder();
        });

        btnAll.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), AllHyms.class)
                    .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
        });
    }
    private void resetBuilder() {
        input.delete(0, input.length());
        txtSearch.setText(input);
    }

}