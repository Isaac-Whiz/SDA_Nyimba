package com.example.sdanyimba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;

public class all_hmys extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ScrollView scrollView;
    private HymRecAdapter adapter;
    private int previousScrollPosition = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_hmys);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initViews();
        adapter = new HymRecAdapter(this);
        ArrayList<Hym> hymns = new ArrayList<>();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);


        DbClass dbClass = new DbClass(this);
        try {
            SQLiteDatabase database = dbClass.getReadableDatabase();
            Cursor cursor = database.query("ennyimba", null, null, null, null, null, null);
            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    for (int i = 0; i < cursor.getCount(); i++) {
                        Hym hym = new Hym();
                        String number = cursor.getString(0);
                        String name = cursor.getString(1);
                        String longDesc = cursor.getString(2);
                        hym.setHymDesc(longDesc);
                        hym.setHymName(name);
                        hym.setHymNumber(number + ".");
                        hymns.add(hym);
                        cursor.moveToNext();
                    }
                    cursor.close();
                    database.close();
                }
            }

        } catch (SQLException v) {
            String error = v.getLocalizedMessage();
            Toast.makeText(this, "Failed to fetch data " + error, Toast.LENGTH_SHORT).show();
        }
        adapter.setHyms(hymns);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
        adapter.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY);
//        adapter.setStateRestorationStrategy(StateRestorationStrategy.WHEN_NOT_EMPTY);
//        previousScrollPosition = scrollView.getScrollY();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }



    @Override
    protected void onResume() {
        super.onResume();


    }

    private void initViews() {
        recyclerView = findViewById(R.id.allHymsRecView);
        scrollView = findViewById(R.id.scrollView);
    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(all_hmys.this, MainActivity.class)
                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            startActivity(new Intent(all_hmys.this, MainActivity.class)
                    .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}