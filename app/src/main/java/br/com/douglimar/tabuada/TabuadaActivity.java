package br.com.douglimar.tabuada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TabuadaActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven,
            btnEight, btnNine, btnTen, btnEleven, btnTwelve, btnThirteen,
            btnFourteen, btnFifteen, btnSixteen, btnSeventeen, btnEighteen, btnNineteen, btnTwenty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuada);

        LinearLayout linearTabuada = findViewById(R.id.linearTabuada);
        TextView tvTitle = findViewById(R.id.tvTabuadaTitle);

        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnTen = findViewById(R.id.btnTen);
        btnEleven = findViewById(R.id.btnEleven);
        btnTwelve = findViewById(R.id.btnTwelve);
        btnThirteen = findViewById(R.id.btnThirteen);
        btnFourteen = findViewById(R.id.btnFourteen);
        btnFifteen = findViewById(R.id.btnFifteen);
        btnSixteen = findViewById(R.id.btnSixteen);
        btnSeventeen = findViewById(R.id.btnSeventeen);
        btnEighteen = findViewById(R.id.btnEighteen);
        btnNineteen = findViewById(R.id.btnNineteen);
        btnTwenty = findViewById(R.id.btnTwenty);


        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnTen.setOnClickListener(this);
        btnEleven.setOnClickListener(this);
        btnTwelve.setOnClickListener(this);
        btnThirteen.setOnClickListener(this);
        btnFourteen.setOnClickListener(this);
        btnFifteen.setOnClickListener(this);
        btnSixteen.setOnClickListener(this);
        btnSeventeen.setOnClickListener(this);
        btnEighteen.setOnClickListener(this);
        btnNineteen.setOnClickListener(this);
        btnTwenty.setOnClickListener(this);


        Intent intent = getIntent();

        String sType = intent.getStringExtra("type");

        switch (sType) {


            case "+": {

                tvTitle.setText(tvTitle.getText() + " de Adição");

                linearTabuada.setBackgroundColor(getResources().getColor(R.color.colorAdicao));
                setButtonsTextColor(R.color.colorAdicao);
                setButtonsBackgroundColor(R.color.colorAdicaoLight);
                break;
            }

            case "-": {
                tvTitle.setText(tvTitle.getText() + " de Subtração");
                linearTabuada.setBackgroundColor(getResources().getColor(R.color.colorSubtracao));
                setButtonsTextColor(R.color.colorSubtracao);
                break;
            }

            case "*": {

                tvTitle.setText(tvTitle.getText() + " de Multiplicação");
                linearTabuada.setBackgroundColor(getResources().getColor(R.color.colorMultiplicacao));
                setButtonsTextColor(R.color.colorMultiplicacao);
                break;
            }

            case "/": {

                tvTitle.setText(tvTitle.getText() + " de Divisão");
                linearTabuada.setBackgroundColor(getResources().getColor(R.color.colorDivisao));
                setButtonsTextColor(R.color.colorDivisao);
                break;
            }

        }


    }

    public void setButtonsTextColor(int iColor) {

        btnOne.setTextColor(getResources().getColor(iColor));
        btnTwo.setTextColor(getResources().getColor(iColor));
        btnThree.setTextColor(getResources().getColor(iColor));
        btnFour.setTextColor(getResources().getColor(iColor));
        btnFive.setTextColor(getResources().getColor(iColor));
        btnSix.setTextColor(getResources().getColor(iColor));
        btnSeven.setTextColor(getResources().getColor(iColor));
        btnEight.setTextColor(getResources().getColor(iColor));
        btnNine.setTextColor(getResources().getColor(iColor));
        btnTen.setTextColor(getResources().getColor(iColor));
        btnEleven.setTextColor(getResources().getColor(iColor));
        btnTwelve.setTextColor(getResources().getColor(iColor));
        btnThirteen.setTextColor(getResources().getColor(iColor));
        btnFourteen.setTextColor(getResources().getColor(iColor));
        btnFifteen.setTextColor(getResources().getColor(iColor));
        btnSixteen.setTextColor(getResources().getColor(iColor));
        btnSeventeen.setTextColor(getResources().getColor(iColor));
        btnEighteen.setTextColor(getResources().getColor(iColor));
        btnNineteen.setTextColor(getResources().getColor(iColor));
        btnTwenty.setTextColor(getResources().getColor(iColor));
    }


    public void setButtonsBackgroundColor(int iColor) {

        btnOne.setBackgroundColor(getResources().getColor(iColor));
        btnTwo.setBackgroundColor(getResources().getColor(iColor));
        btnThree.setBackgroundColor(getResources().getColor(iColor));
        btnFour.setBackgroundColor(getResources().getColor(iColor));
        btnFive.setBackgroundColor(getResources().getColor(iColor));
        btnSix.setBackgroundColor(getResources().getColor(iColor));
        btnSeven.setBackgroundColor(getResources().getColor(iColor));
        btnEight.setBackgroundColor(getResources().getColor(iColor));
        btnNine.setBackgroundColor(getResources().getColor(iColor));
        btnTen.setBackgroundColor(getResources().getColor(iColor));
        btnEleven.setBackgroundColor(getResources().getColor(iColor));
        btnTwelve.setBackgroundColor(getResources().getColor(iColor));
        btnThirteen.setBackgroundColor(getResources().getColor(iColor));
        btnFourteen.setBackgroundColor(getResources().getColor(iColor));
        btnFifteen.setBackgroundColor(getResources().getColor(iColor));
        btnSixteen.setBackgroundColor(getResources().getColor(iColor));
        btnSeventeen.setBackgroundColor(getResources().getColor(iColor));
        btnEighteen.setBackgroundColor(getResources().getColor(iColor));
        btnNineteen.setBackgroundColor(getResources().getColor(iColor));
        btnTwenty.setBackgroundColor(getResources().getColor(iColor));
    }

    @Override
    public void onClick(View v) {



        switch (v.getId()) {

            case R.id.btnOne: {
                break;
            }
            case R.id.btnTwo: {
                break;
            }
            case R.id.btnThree: {
                break;
            }
            case R.id.btnFour: {
                break;
            }
            case R.id.btnFive: {
                break;
            }
            case R.id.btnSix: {
                break;
            }
            case R.id.btnSeven: {
                break;
            }
            case R.id.btnEight: {
                break;
            }
            case R.id.btnNine: {
                break;
            }
            case R.id.btnTen: {
                break;
            }
            case R.id.btnEleven: {
                break;
            }
            case R.id.btnTwelve: {
                break;
            }
            case R.id.btnThirteen: {
                break;
            }
            case R.id.btnFourteen: {
                break;
            }
            case R.id.btnFifteen: {
                break;
            }
            case R.id.btnSixteen: {
                break;
            }
            case R.id.btnSeventeen: {
                break;
            }
            case R.id.btnEighteen: {
                break;
            }
            case R.id.btnNineteen: {
                break;
            }
            case R.id.btnTwenty: {
                break;
            }




        }



    }
}
