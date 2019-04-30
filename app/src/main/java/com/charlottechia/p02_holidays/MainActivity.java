package com.charlottechia.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvHolidays;
    ArrayList<String> alHolidays;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvHolidays = findViewById(R.id.lvHolidays);

        alHolidays = new ArrayList<String>();
        alHolidays.add("Secular");
        alHolidays.add("Ethnic and Religious");
        aa = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alHolidays);
        lvHolidays.setAdapter(aa);

        lvHolidays.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               // Intent intent = new Intent(getBaseContext());

            }
        });
    }
}
