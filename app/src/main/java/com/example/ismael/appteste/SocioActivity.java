package com.example.ismael.appteste;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SocioActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socio);

        TextView title = (TextView) findViewById(R.id.title);
        TextView text = (TextView) findViewById(R.id.content);
        title.setTypeface(Typeface.DEFAULT_BOLD);

        String texto = "Todas estas questões, devidamente ponderadas, levantam dúvidas sobre se a constante divulgação das informações maximiza as possibilidades por conta dos métodos utilizados na avaliação de resultados. No mundo atual, a adoção de políticas descentralizadoras desafia a capacidade de equalização do retorno esperado a longo prazo. Gostaria de enfatizar que a crescente influência da mídia afeta positivamente a correta previsão da gestão inovadora da qual fazemos parte. Por outro lado, o entendimento das metas propostas é uma das consequências do impacto na agilidade decisória. O empenho em analisar a valorização de fatores subjetivos cumpre um papel essencial na formulação dos relacionamentos verticais entre as hierarquias";


        text.setText(texto);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F44336")));
        bar.setTitle("");
        bar.setIcon(android.R.color.transparent);
        bar.setDisplayHomeAsUpEnabled(true);
        return super.onCreateOptionsMenu(menu);
    }
}
