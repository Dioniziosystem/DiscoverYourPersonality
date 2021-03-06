package com.example.android.discoveryourpersonality;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class ResultSearch extends Activity {
    private WebView webViewResultado;
    private String resultadofinal = "";
    private int valorFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_search);
        //Criacao do WebView para visualizacao das informaçoes no formato justificado
        webViewResultado = (WebView) findViewById(R.id.webResultado);

        //Recebimento do valor das variaveis que foram calculadas da classe MainActivity
        valorFinal = MainActivity.valorAb;

//        Condicao que avalia o resultado das escolhas do usuario para determinar o nivel (baixo,normal,alta) das caracteristicas
//        que serão citadas no resultado final

        if (valorFinal == 3 || valorFinal == 4) {
            resultadofinal += "<html><body>" + "<p align=\"justify\">" + "<font color=\"blue\">" +
                    getString(R.string.titleAbAlta, valorFinal) + "</br>" + "</font>" +
                    getString(R.string.valorAbAlta) + "</p>" + "</body></html>" + "\n";


        } else if (valorFinal == -3 || valorFinal == -4) {
            resultadofinal += "<html><body>" + "<p align=\"justify\">" + "<font color=\"red\">" +
                    getString(R.string.titleAbBaixa, valorFinal) + "</br>" + "</font>" +
                    getString(R.string.valorAbBaixa) + "</p>" + "</body></html>" + "\n";

        } else {
            resultadofinal += "<html><body>" + "<p align=\"justify\">" + "<font color=\"black\">" +
                    getString(R.string.titleAbNormal, valorFinal) + "</br>" + "</font>" +
                    getString(R.string.valorAbNormal) + "</p>" + "</body></html>" + "\n";
        }

        valorFinal = MainActivity.valorC;

        if (valorFinal == 3 || valorFinal == 4) {
            resultadofinal += "<html><body>" + "<p align=\"justify\">" + "<font color=\"blue\">" +
                    getString(R.string.titleCAlta, valorFinal) + "</br>" + "</font>" +
                    getString(R.string.valorCAlta) + "</p>" + "</body></html>" + "\n";

        } else if (valorFinal == -3 || valorFinal == -4) {
            resultadofinal += "<html><body>" + "<p align=\"justify\">" + "<font color=\"red\">" +
                    getString(R.string.titleCBaixa, valorFinal) + "</br>" + "</font>" +
                    getString(R.string.valorCBaixa) + "</p>" + "</body></html>" + "\n";

        } else {
            resultadofinal += "<html><body>" + "<p align=\"justify\">" + "<font color=\"black\">" +
                    getString(R.string.titleCNormal, valorFinal) + "</br>" + "</font>" +
                    getString(R.string.valorCNormal) + "</p>" + "</body></html>" + "\n";
        }

        valorFinal = MainActivity.valorAf;

        if (valorFinal == 3 || valorFinal == 4) {
            resultadofinal += "<html><body>" + "<p align=\"justify\">" + "<font color=\"blue\">" +
                    getString(R.string.titleAfAlta, valorFinal) + "</br>" + "</font>" +
                    getString(R.string.valorAfAlta) + "</p>" + "</body></html>" + "\n";

        } else if (valorFinal == -3 || valorFinal == -4) {
            resultadofinal += "<html><body>" + "<p align=\"justify\">" + "<font color=\"red\">" +
                    getString(R.string.titleAfBaixa, valorFinal) + "</br>" + "</font>" +
                    getString(R.string.valorAfBaixa) + "</p>" + "</body></html>" + "\n";

        } else {
            resultadofinal += "<html><body>" + "<p align=\"justify\">" + "<font color=\"black\">" +
                    getString(R.string.titleAfNormal, valorFinal) + "</br>" + "</font>" +
                    getString(R.string.valorAfNormal) + "</p>" + "</body></html>" + "\n";
        }

        valorFinal = MainActivity.valorEs;

        if (valorFinal == 3 || valorFinal == 4) {
            resultadofinal += "<html><body>" + "<p align=\"justify\">" + "<font color=\"blue\">" +
                    getString(R.string.titleEsAlta, valorFinal) + "</br>" + "</font>" +
                    getString(R.string.valorEsAlta) + "</p>" + "</body></html>" + "\n";

        } else if (valorFinal == -3 || valorFinal == -4) {
            resultadofinal += "<html><body>" + "<p align=\"justify\">" + "<font color=\"red\">" +
                    getString(R.string.titleEsBaixa, valorFinal) + "</br>" + "</font>" +
                    getString(R.string.valorEsBaixa) + "</p>" + "</body></html>" + "\n";
        } else {
            resultadofinal += "<html><body>" + "<p align=\"justify\">" + "<font color=\"black\">" +
                    getString(R.string.titleEsNormal, valorFinal) + "</br>" + "</font>" +
                    getString(R.string.valorEsNormal) + "</p>" + "</body></html>" + "\n";
        }

        valorFinal = MainActivity.valorEx;

        if (valorFinal == 3 || valorFinal == 4) {
            resultadofinal += "<html><body>" + "<p align=\"justify\">" + "<font color=\"blue\">" +
                    getString(R.string.titleExAlta, valorFinal) + "</br>" + "</font>" +
                    getString(R.string.valorExAlta) + "</p>" + "</body></html>" + "\n";

        } else if (valorFinal == -3 || valorFinal == -4) {
            resultadofinal += "<html><body>" + "<p align=\"justify\">" + "<font color=\"red\">" +
                    getString(R.string.titleExBaixa, valorFinal) + "</br>" + "</font>" +
                    getString(R.string.valorExBaixa) + "</p>" + "</body></html>" + "\n";
        } else {
            resultadofinal += "<html><body>" + "<p align=\"justify\">" + "<font color=\"black\">" +
                    getString(R.string.titleExNormal, valorFinal) + "</br>" + "</font>" +
                    getString(R.string.valorExNormal) + "</p>" + "</body></html>" + "\n";
        }

        WebSettings settings = webViewResultado.getSettings();
        //settings.setDefaultTextEncodingName("utf-8");
        settings.setDefaultFontSize(20);
        webViewResultado.setBackgroundColor(Color.parseColor("#ADFF2F"));
        //Codificaçao utf-8 para exibir corretamente os caracteres especiais
        webViewResultado.loadDataWithBaseURL(null, resultadofinal, "text/html", "utf-8", null);

    }
}