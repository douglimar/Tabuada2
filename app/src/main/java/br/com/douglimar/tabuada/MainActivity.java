package br.com.douglimar.tabuada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdicao = findViewById(R.id.btnAdicao);
        Button btnSubtracao = findViewById(R.id.btnSubtracao);
        Button btnMultiplicacao = findViewById(R.id.btnMultiplicacao);
        Button btnDivisao = findViewById(R.id.btnDivisao);

        btnAdicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getApplicationContext(), TabuadaActivity.class);
                intent.putExtra("type", "+");

                startActivity(intent);

                //Toast.makeText(getApplicationContext(), calcMathTables("+",2), Toast.LENGTH_LONG).show();
            }
        });

        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TabuadaActivity.class);
                intent.putExtra("type", "-");

                startActivity(intent);
                //Toast.makeText(getApplicationContext(), calcMathTables("-",2), Toast.LENGTH_LONG).show();
            }
        });

        btnMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TabuadaActivity.class);
                intent.putExtra("type", "*");

                startActivity(intent);


                //Toast.makeText(getApplicationContext(), calcMathTables("*",2), Toast.LENGTH_LONG).show();
            }
        });

        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TabuadaActivity.class);
                intent.putExtra("type", "/");

                startActivity(intent);

                //Toast.makeText(getApplicationContext(), calcMathTables("/",2), Toast.LENGTH_LONG).show();
            }
        });
    }

    public String calcMathTables(String operator, int number) {

        String sValor ="";

        int iResult = 0;

        switch (operator) {

            case "+": {
                for (int i = 1; i<=10;i++) {
                    iResult = i + number;
                    sValor = sValor + i +" + " + number + " = " + iResult  + "\n";
                }
                break;
            }

            case "-": {
                for (int i = 1; i<=10;i++) {
                    iResult = i - number;
                    sValor = sValor + i +" - " + number + " = " + iResult  + "\n";
                }
                break;
            }

            case "*": {
                for (int i = 1; i<=10;i++) {
                    iResult = i * number;
                    sValor = sValor + i +" x " + number + " = " + iResult  + "\n";
                }
                break;
            }

            case "/": {
                for (int i = 1; i<=10;i++) {
                    iResult = i / number;
                    sValor = sValor + i +" / " + number + " = " + iResult  + "\n";
                }
                break;
            }


        }

        return sValor;
    }
}
