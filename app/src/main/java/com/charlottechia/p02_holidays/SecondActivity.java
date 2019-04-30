package com.charlottechia.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lvModules;
    TextView tvYear;
    ArrayAdapter aa;
    TextView tvCode;
    ArrayList<Holiday> secular_holidays, religious_holidays;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        lvModules = (ListView) this.findViewById(R.id.lVHolidays);
        tvYear = (TextView) findViewById(R.id.tVTitle);


        Intent i = getIntent();
        boolean check = i.getBooleanExtra("isSecular", false);


        secular_holidays = new ArrayList<Holiday>();
        Holiday holiday1 = new Holiday("New Year", R.drawable.new_year, "1/1/2019");
        Holiday holiday2 = new Holiday("National Day", R.drawable.national_day, "9/8/2019");
        Holiday holiday3 = new Holiday("Labour Day", R.drawable.labour_day, "1/5/2019");
        secular_holidays.add(holiday1);
        secular_holidays.add(holiday3);
        secular_holidays.add(holiday2);

        religious_holidays = new ArrayList<Holiday>();
        Holiday holiday4 = new Holiday("Chinese New Year", R.drawable.cny, "5/2/2019-6/2/2019");
        Holiday holiday5 = new Holiday("Good Friday", R.drawable.good_friday, "19/4/2019");
        Holiday holiday6 = new Holiday("Vesak Day", R.drawable.vesak_day, "19/5/2018");
        Holiday holiday7 = new Holiday("Hari Raya Puasa", R.drawable.hari_raya_puasa, "5/6/2019");
        Holiday holiday8 = new Holiday("Hari Raya Haji", R.drawable.hari_raya_haji, "11/8/2019");
        Holiday holiday9 = new Holiday("Deepavali", R.drawable.deepavali, "27/10/2019");
        Holiday holiday10 = new Holiday("Christmas Day", R.drawable.christmas, "25/12/2019");
        religious_holidays.add(holiday4);
        religious_holidays.add(holiday5);
        religious_holidays.add(holiday6);
        religious_holidays.add(holiday7);
        religious_holidays.add(holiday8);
        religious_holidays.add(holiday9);
        religious_holidays.add(holiday10);


        if(check){
            aa = new HolidayAdapter(this, R.layout.row, secular_holidays);
            tvYear.setText("Secular Holidays");
        }else{
            tvYear.setText("Religious Holidays");
            aa = new HolidayAdapter(this, R.layout.row, religious_holidays);
        }

        lvModules.setAdapter(aa);
    }

}
