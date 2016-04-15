package com.example.ismael.appteste;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CalendarActivity extends Activity {

    private DatePickerDialog datePickerDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        Button btnDate = (Button) findViewById(R.id.btnDate);

        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*setDateTimeField();
                datePickerDialog.show();*/
                setDateTimeField();
            }
        });

    }



    private void setDateTimeField() {
        Calendar beginTime = Calendar.getInstance();
        beginTime.set(2016, 04 - 1, 18, 7, 30);

        if (Build.VERSION.SDK_INT >= 14) {
            Intent intent = new Intent(Intent.ACTION_INSERT)
                    .setData(CalendarContract.Events.CONTENT_URI)
                    .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                    .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, beginTime.getTimeInMillis())
                    .putExtra(CalendarContract.Events.TITLE, "Audiência ")
                    .putExtra(CalendarContract.Events.DESCRIPTION, "Encontro com ...")
                    .putExtra(CalendarContract.Events.EVENT_LOCATION, "No Forum")
                    .putExtra(CalendarContract.Events.AVAILABILITY, CalendarContract.Events.AVAILABILITY_BUSY)
                    .putExtra(Intent.EXTRA_EMAIL, "rowan@example.com,trevor@example.com");
            startActivity(intent);
        }

        else {
            Calendar cal = Calendar.getInstance();
            Intent intent = new Intent(Intent.ACTION_EDIT);
            intent.setType("vnd.android.cursor.item/event");
            intent.putExtra("beginTime", cal.getTimeInMillis());
            intent.putExtra("allDay", true);
            intent.putExtra("rrule", "FREQ=YEARLY");
            intent.putExtra("endTime", cal.getTimeInMillis()+60*60*1000);
            intent.putExtra("title", "A Test Event from android app");
            startActivity(intent);
        }
    }


}
