//Autor app: Emerson B Dionizio
package com.example.android.discoveryourpersonality;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class MainActivity extends Activity {
    //Variaveis usadas no codigo
    private Spinner spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7, spinner8, spinner9, spinner10;
    private Button btMensagem;
    private int valor1,valor2;
    public static int valorAb, valorC, valorAf, valorEs, valorEx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Objetos spinner que recebe informaçoes com layout activity_main

        spinner1 = (Spinner) findViewById(R.id.option_personality1);
        spinner2 = (Spinner) findViewById(R.id.option_personality2);
        spinner3 = (Spinner) findViewById(R.id.option_personality3);
        spinner4 = (Spinner) findViewById(R.id.option_personality4);
        spinner5 = (Spinner) findViewById(R.id.option_personality5);
        spinner6 = (Spinner) findViewById(R.id.option_personality6);
        spinner7 = (Spinner) findViewById(R.id.option_personality7);
        spinner8 = (Spinner) findViewById(R.id.option_personality8);
        spinner9 = (Spinner) findViewById(R.id.option_personality9);
        spinner10 = (Spinner) findViewById(R.id.option_personality10);

        //Criacao do objeto ArrayAdapter que vai manipular informacoes das escolhas do usuario no menu
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.points_answer,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
        spinner4.setAdapter(adapter);
        spinner5.setAdapter(adapter);
        spinner6.setAdapter(adapter);
        spinner7.setAdapter(adapter);
        spinner8.setAdapter(adapter);
        spinner9.setAdapter(adapter);
        spinner10.setAdapter(adapter);

        btMensagem = (Button) findViewById(R.id.mensagem);

        btMensagem.setOnClickListener(new View.OnClickListener() {


            //            Metodo do btMensagem para realizar o cálculo com a formula valor1-valor2=(-4 ate +4) atraves
//            do getSelectioPosition()+1
            @Override
            public void onClick(View v) {
                valor1 = spinner1.getSelectedItemPosition() + 1;
                valor2 = spinner2.getSelectedItemPosition() + 1;
                valorAb = valor1 - valor2;


                valor1 = spinner3.getSelectedItemPosition() + 1;
                valor2 = spinner4.getSelectedItemPosition() + 1;
                valorC = valor1 - valor2;


                valor1 = spinner5.getSelectedItemPosition() + 1;
                valor2 = spinner6.getSelectedItemPosition() + 1;
                valorAf = valor1 - valor2;


                valor1 = spinner7.getSelectedItemPosition() + 1;
                valor2 = spinner8.getSelectedItemPosition() + 1;
                valorEs = valor1 - valor2;


                valor1 = spinner9.getSelectedItemPosition() + 1;
                valor2 = spinner10.getSelectedItemPosition() + 1;
                valorEx = valor1 - valor2;

                //Resultado é enviado para uma nova Activity
                Intent resultSearch = new Intent(MainActivity.this, ResultSearch.class);
                startActivity(resultSearch);

            }

        });

    }

}
