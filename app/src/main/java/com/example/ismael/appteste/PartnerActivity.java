package com.example.ismael.appteste;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PartnerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partner);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar bar = getActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F44336")));
        bar.setTitle("");
        getActionBar().setIcon(android.R.color.transparent);

        TextView t = (TextView) findViewById(R.id.content);
        t.setText("videntemente, a competitividade nas transações comerciais auxilia a preparação e a composição dos modos de operação convencionais. Assim mesmo, a determinação clara de objetivos acarreta um processo de reformulação e modernização do orçamento setorial. Acima de tudo, é fundamental ressaltar que a percepção das dificuldades faz parte de um processo de gerenciamento das direções preferenciais no sentido do progresso. \n" +
                "\n" +
                "          A prática cotidiana prova que o novo modelo estrutural aqui preconizado apresenta tendências no sentido de aprovar a manutenção de alternativas às soluções ortodoxas. Neste sentido, a contínua expansão de nossa atividade ainda não demonstrou convincentemente que vai participar na mudança das condições financeiras e administrativas exigidas. Por conseguinte, o surgimento do comércio virtual exige a precisão e a definição de todos os recursos funcionais envolvidos. No entanto, não podemos esquecer que a estrutura atual da organização estimula a padronização dos níveis de motivação departamental. O que temos que ter sempre em mente é que a consulta aos diversos militantes obstaculiza a apreciação da importância das condições inegavelmente apropriadas. \n");
    }
}
