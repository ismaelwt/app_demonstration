package com.example.ismael.appteste;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;

public class ChatDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatcell);

        Intent i = getIntent();

        if(i.hasExtra("name")){

            String title = i.getStringExtra("name");

            getActionBar().setTitle(Html.fromHtml("<font color=\"white\">" + title + "</font>"));

        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F44336")));
        actionBar.setIcon(android.R.color.transparent);
        return super.onCreateOptionsMenu(menu);
    }
}
