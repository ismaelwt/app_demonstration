package com.example.ismael.appteste;

import android.app.ActionBar;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class BeneficioActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beneficio);
        //getActionBar().setStackedBackgroundDrawable(getDrawable(R.drawable.logo_hecato));
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("Gostaria de enfatizar que a consulta aos diversos militantes nos obriga à análise das condições financeiras e administrativas exigidas. Nunca é demais lembrar o peso e o significado destes problemas, uma vez que o acompanhamento das preferências de consumo possibilita uma melhor visão global das posturas dos órgãos dirigentes com relação às suas atribuições. Assim mesmo, a estrutura atual da organização exige a precisão e a definição do sistema de participação geral. O cuidado em identificar pontos críticos na contínua expansão de nossa atividade cumpre um papel essencial na formulação do remanejamento dos quadros funcionais. \n" +
                "\n" +
                "          Caros amigos, a constante divulgação das informações desafia a capacidade de equalização do levantamento das variáveis envolvidas. É importante questionar o quanto o consenso sobre a necessidade de qualificação assume importantes posições no estabelecimento das direções preferenciais no sentido do progresso. Todavia, a complexidade dos estudos efetuados faz parte de um processo de gerenciamento das novas proposições. As experiências acumuladas demonstram que a consolidação das estruturas pode nos levar a considerar a reestruturação das condições inegavelmente apropriadas. Evidentemente, a execução dos pontos do programa obstaculiza a apreciação da importância do impacto na agilidade decisória.");

    }


    private Bitmap resizeBitmapImageFn(
            Bitmap bmpSource, int maxResolution){
        int iWidth = bmpSource.getWidth();
        int iHeight = bmpSource.getHeight();
        int newWidth = iWidth ;
        int newHeight = iHeight ;
        float rate = 0.0f;

        if(iWidth > iHeight ){
            if(maxResolution < iWidth ){
                rate = maxResolution / (float) iWidth ;
                newHeight = (int) (iHeight * rate);
                newWidth = maxResolution;
            }
        }else{
            if(maxResolution < iHeight ){
                rate = maxResolution / (float) iHeight ;
                newWidth = (int) (iWidth * rate);
                newHeight = maxResolution;
            }
        }

        return Bitmap.createScaledBitmap(
                bmpSource, newWidth, newHeight, true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F44336")));
        actionBar.setTitle("");
        actionBar.setIcon(android.R.color.transparent);
        //menu.getItem(0).setIcon(d); //choose the item number you want to set
        return true;
    }
}
