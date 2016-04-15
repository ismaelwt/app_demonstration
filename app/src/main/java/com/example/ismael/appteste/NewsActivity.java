package com.example.ismael.appteste;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

import com.example.ismael.appteste.adapter.AdapterList;
import com.example.ismael.appteste.model.News;

import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        ListView listView = (ListView) findViewById(R.id.listView);

        ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F44336")));
        bar.setTitle("");
        getActionBar().setIcon(android.R.color.transparent);

        List<News> list = new ArrayList<>();

        News n = new News();
        n.setTitulo("A jornais estrangeiros, Dilma repete que não renunciará, informa 'NYT'");
        n.setDescricao("A presidente Dilma Rousseff reafirmou na manhã desta quinta-feira (24), em entrevista coletiva a correspondentes de seis jornais estrangeiros, no Palácio do Planalto, que não renunciará ao mandato, informou em sua edição online o diário New York Times.\n" +
                "Dilma recebeu repórteres do francês Le Monde, do norte-americano The New York Times, do argentino Pagina 12, do espanhol El País, do inglês The Guardian e do alemão Die Zeit. A entrevista, segundo o NYT, durou mais de uma hora.");

        News n1 = new News();
        n1.setTitulo("A jornais estrangeiros, Dilma repete que não renunciará, informa 'NYT'");
        n1.setDescricao("A presidente Dilma Rousseff reafirmou na manhã desta quinta-feira (24), em entrevista coletiva a correspondentes de seis jornais estrangeiros, no Palácio do Planalto, que não renunciará ao mandato, informou em sua edição online o diário New York Times.\n" +
                "Dilma recebeu repórteres do francês Le Monde, do norte-americano The New York Times, do argentino Pagina 12, do espanhol El País, do inglês The Guardian e do alemão Die Zeit. A entrevista, segundo o NYT, durou mais de uma hora.");

        list.add(n);
        list.add(n1);


        AdapterList adapter = new AdapterList(this, android.R.layout.simple_list_item_1, list);

        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        return super.onCreateOptionsMenu(menu);
    }


    //
}
