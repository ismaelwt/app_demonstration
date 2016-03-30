package com.example.ismael.appteste;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ChatDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatcell);

        Intent i = getIntent();

        if(i.hasExtra("name")){

            String title = i.getStringExtra("name");

            getActionBar().setTitle(title);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
