package com.example.ismael.appteste;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.Image;
import android.os.Build;
import android.provider.CalendarContract;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends Activity {

    private static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActionBar().hide();

        ImageButton calendar = (ImageButton) findViewById(R.id.calendar);
        ImageButton location = (ImageButton) findViewById(R.id.location);
        ImageButton news = (ImageButton) findViewById(R.id.news);
        ImageButton contactUs = (ImageButton) findViewById(R.id.contact_us);
        ImageButton about = (ImageButton) findViewById(R.id.about);
        ImageButton partner = (ImageButton) findViewById(R.id.partner);
        ImageButton chat = (ImageButton) findViewById(R.id.chat);
        ImageButton beneficios = (ImageButton) findViewById(R.id.beneficios);
        ImageButton socio =  (ImageButton) findViewById(R.id.socio);

        socio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SocioActivity.class);
                startActivity(i);
            }
        });

        beneficios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BeneficioActivity.class);
                startActivity(i);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ChatActivity.class);
                startActivity(i);
            }
        });

        partner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PartnerActivity.class);
                startActivity(i);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SindicateActivity.class);
                startActivity(i);
            }
        });



        contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ContactUsActivity.class);
                startActivity(i);
            }
        });

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NewsActivity.class);
                startActivity(i);
            }
        });

        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*Intent i = new Intent(MainActivity.this, CalendarActivity.class);
                startActivity(i);*/

                /*Intent intent = new Intent(Intent.ACTION_INSERT);
                intent.setType("vnd.android.cursor.item/event");
                intent.putExtra(CalendarContract.Events.TITLE, "titulo");
                intent.putExtra(CalendarContract.Events.EVENT_LOCATION, "local");
                intent.putExtra(CalendarContract.Events.DESCRIPTION, "Descrição");

// Setting dates
                GregorianCalendar calDate = new GregorianCalendar(2016, 03, 23);
                intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        calDate.getTimeInMillis());
                intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        calDate.getTimeInMillis());

// make it a full day event
                intent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);

// make it a recurring Event
                intent.putExtra(CalendarContract.Events.RRULE, "FREQ=WEEKLY;COUNT=11;WKST=SU;BYDAY=TU,TH");

// Making it private and shown as busy
                intent.putExtra(CalendarContract.Events.ACCESS_LEVEL, CalendarContract.Events.ACCESS_PRIVATE);
                intent.putExtra(CalendarContract.Events.AVAILABILITY, CalendarContract.Events.AVAILABILITY_BUSY);

                intent.setData(CalendarContract.Events.CONTENT_URI);
                startActivity(intent);*/
                setDateTimeField();
            }
        });

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //callMap();
                Intent i = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(i);
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


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        return super.onCreateOptionsMenu(menu);
    }*/

    public void callMap() {


        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
            ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            if (ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.ACCESS_COARSE_LOCATION) &&
                    ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.ACCESS_FINE_LOCATION)) {

                Intent i = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(i);

            }else {
                Intent i = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(i);
            }
        }else {

            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION},
                    REQUEST_IMAGE_CAPTURE);

        }
    }
}
