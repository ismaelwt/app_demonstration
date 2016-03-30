package com.example.ismael.appteste;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class PartnerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partner);


        String texto = " \n" +
                "1) Como faço pra me associar?\n" +
                "Para se associar é necessário estar trabalhando no comércio com carteira registrada.\n" +
                "Caso queira mais informações Clique Aqui\n" +
                " \n" +
                "2) O que é preciso para ser sócio?\n" +
                "Para ser sócio é necessário ser maior de 18 anos, ou para menores de 18, apresentar autorização por escrito dos pais ou responsável.\n" +
                " \n" +
                "3) Quais os documentos necessários?\n" +
                "Os documentos necessários são:\n" +
                "RG/ CPF/ carteira profissional/taxa admissional de R$ 23,00.\n" +
                "Caso seja casado, e tenha filhos menores de 18 anos, é necessário:\n" +
                "*Certidão de casamento e/ou declaração de união estável (no caso de amasiado) e cópia do RG do cônjuge.\n" +
                "*Certidão de nascimento ou rg dos filhos.\n" +
                "*No caso de enteados, só serão inclusos como dependentes caso seja apresentado comprovante da guarda legal dos mesmos.\n" +
                " \n" +
                "4) Se eu quiser ser sócio tenho que ir até o Sindicato?\n" +
                "Existem três opções para se associar:\n" +
                "a) Pode ser feita pessoalmente nas sub-sedes ou sede (Rua Formosa, 99 ao lado do metrô Anhangabaú)\n" +
                "b) Pode ser feita pelo nosso site na opção \"Fique Sócio\"\n" +
                "c) Pode ser passado o endereço da empresa/loja por contato telefônico, e um de nossos representantes entra em contato para combinar dia e horário para realizar a visita.\n" +
                " \n" +
                "5) Qual é o valor da mensalidade?\n" +
                "A mensalidade é no valor de R$ 23,00 mensais. deverá ser pago enquanto for sócio.\n" +
                " \n" +
                "6) Sou enfermeira, posso me associar?\n" +
                "\n" +
                "Exemplos de algumas categorias que não podem se associar conosco:\n" +
                "*Proprietários/ Autônomos\n" +
                "*Imobiliárias\n" +
                "*Telemarketing\n" +
                "*Enfermeiros\n" +
                "*Cabelereiros\n" +
                "*Aposentados (exceto aposentados que estiverem ativos no comércio trabalhando com carteira registrada)\n" +
                "* Motorista\n" +
                " \n" +
                "7) Trabalho em Guarulhos posso me associar no sindicato dos comerciários de São Paulo.\n" +
                "COMERCIÁRIOS QUE EXCERCEREM FUNÇÃO FORA DO MUNICÍPIO DE SÃO PAULO, DEVE SE ASSOCIAR NO SINDICATO CORRESPONDENTE À SUA BASE.\n" +
                "EX.: Funcionário do comércio em Guarulhos, deve se associar ao Sindicato dos Comerciários de Guarulhos.";

        TextView t = (TextView) findViewById(R.id.content);
        t.setText(texto);
    }
}
