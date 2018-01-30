package br.com.douglimar.tabuada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TabuadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuada);

        LinearLayout linearTabuada = findViewById(R.id.linearTabuada);
        TextView tvTitle = findViewById(R.id.tvTabuadaTitle);


        Intent intent = getIntent();

        String sType = intent.getStringExtra("type");

        switch (sType) {


            case "+": {

                tvTitle.setText(tvTitle.getText() + " de Adição");

                linearTabuada.setBackgroundColor(getResources().getColor(R.color.colorAdicao));
                break;
            }

            case "-": {
                tvTitle.setText(tvTitle.getText() + " de Subtração");
                linearTabuada.setBackgroundColor(getResources().getColor(R.color.colorSubtracao));
                break;
            }

            case "*": {

                tvTitle.setText(tvTitle.getText() + " de Multiplicação");
                linearTabuada.setBackgroundColor(getResources().getColor(R.color.colorMultiplicacao));
                break;
            }

            case "/": {

                tvTitle.setText(tvTitle.getText() + " de Divisão");
                linearTabuada.setBackgroundColor(getResources().getColor(R.color.colorDivisao));
                break;
            }

        }

    }
}
