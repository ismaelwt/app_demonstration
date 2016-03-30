package com.example.ismael.appteste;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        ListView chatList = (ListView) findViewById(R.id.chats);

        List<String> chats = new ArrayList<>();

        chats.add("Jonas");
        chats.add("Filipi Smith");
        chats.add("Jeremias");
        chats.add("Pedro Mariano");
        chats.add("Romero Britto");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, chats);

        chatList.setAdapter(adapter);

        chatList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ChatActivity.this, ChatDetailActivity.class);
                i.putExtra("name", parent.getItemAtPosition(position).toString());
                startActivity(i);
            }
        });
    }
}
