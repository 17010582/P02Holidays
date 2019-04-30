package com.charlottechia.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {

    private ArrayList<Holiday> holidayArrayList;
    private Context context;
    private TextView tvName, tvDate;
    private ImageView ivHoliday;


    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects) {
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        holidayArrayList = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvName = rowView.findViewById(R.id.tVname);
        tvDate = rowView.findViewById(R.id.tVdate);
        // Get the ImageView object
        ivHoliday = rowView.findViewById(R.id.iVholiday);



        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Holiday currentFood = holidayArrayList.get(position);
        // Set the TextView to show the food

        tvName.setText(currentFood.getName());
        // Set the image to star or nostar accordingly
        ivHoliday.setImageResource(currentFood.getImageName());
        tvDate.setText(currentFood.getDate());

        // Return the nicely done up View to the ListView
        return rowView;
    }
}
