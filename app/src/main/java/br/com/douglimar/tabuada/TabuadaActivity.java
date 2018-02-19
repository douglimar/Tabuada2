package br.com.douglimar.tabuada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.analytics.FirebaseAnalytics;

public class TabuadaActivity extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAnalytics mFirebaseAnalytics;

    private Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven,
            btnEight, btnNine, btnTen, btnEleven, btnTwelve, btnThirteen,
            btnFourteen, btnFifteen, btnSixteen, btnSeventeen, btnEighteen, btnNineteen, btnTwenty;

    private String sType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuada);

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        LinearLayout linearTabuada = findViewById(R.id.linearTabuada);
        //TextView tvTitle = findViewById(R.id.tvTabuadaTitle);

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

        sType = intent.getStringExtra("type");

        switch (sType) {


            case "+": {

                logFirebaseEvents("10", "ADICAO");

                this.setTitle(getString(R.string.tabuada_adicao_title));
                linearTabuada.setBackgroundColor(getResources().getColor(R.color.colorWhite));
                setButtonsTextColor(R.color.colorWhite);
                setButtonsBackground(R.drawable.bg_plus_header);

                break;
            }

            case "-": {

                logFirebaseEvents("11", "SUBTRACAO");
                this.setTitle(getString(R.string.tabuada_subtracao_title));
                linearTabuada.setBackgroundColor(getResources().getColor(R.color.colorWhite));
                setButtonsTextColor(R.color.colorWhite);

                setButtonsBackground(R.drawable.bg_minus_header);
                break;
            }

            case "*": {

                logFirebaseEvents("12", "MULTIPLICACAO");

                this.setTitle(getString(R.string.tabuada_multiplicacao_title));

                linearTabuada.setBackgroundColor(getResources().getColor(R.color.colorWhite));
                setButtonsTextColor(R.color.colorWhite);

                setButtonsBackground(R.drawable.bg_multiply_header);
                break;
            }

            case "/": {

                logFirebaseEvents("13", "DIVISAO");

                this.setTitle(getString(R.string.tabuada_divisao_title));

                linearTabuada.setBackgroundColor(getResources().getColor(R.color.colorWhite));
                setButtonsTextColor(R.color.colorWhite);

                setButtonsBackground(R.drawable.bg_division_header);
                break;
            }

        }

        // Create a AdView
        // Load Advertisement Banner
        AdView adView = findViewById(R.id.adViewTabuada);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }
        return super.onOptionsItemSelected(item);
    }

    private void setButtonsTextColor(int iColor) {

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

    private void setButtonsBackground(int iColor) {

        btnOne.setBackground(getResources().getDrawable(iColor));
        btnTwo.setBackground(getResources().getDrawable(iColor));
        btnThree.setBackground(getResources().getDrawable(iColor));
        btnFour.setBackground(getResources().getDrawable(iColor));
        btnFive.setBackground(getResources().getDrawable(iColor));
        btnSix.setBackground(getResources().getDrawable(iColor));
        btnSeven.setBackground(getResources().getDrawable(iColor));
        btnEight.setBackground(getResources().getDrawable(iColor));
        btnNine.setBackground(getResources().getDrawable(iColor));
        btnTen.setBackground(getResources().getDrawable(iColor));
        btnEleven.setBackground(getResources().getDrawable(iColor));
        btnTwelve.setBackground(getResources().getDrawable(iColor));
        btnThirteen.setBackground(getResources().getDrawable(iColor));
        btnFourteen.setBackground(getResources().getDrawable(iColor));
        btnFifteen.setBackground(getResources().getDrawable(iColor));
        btnSixteen.setBackground(getResources().getDrawable(iColor));
        btnSeventeen.setBackground(getResources().getDrawable(iColor));
        btnEighteen.setBackground(getResources().getDrawable(iColor));
        btnNineteen.setBackground(getResources().getDrawable(iColor));
        btnTwenty.setBackground(getResources().getDrawable(iColor));
    }

    @Override
    public void onClick(View v) {


        int iNumber = 0;

        switch (v.getId()) {

            case R.id.btnOne: {
                iNumber = 1;
                break;
            }
            case R.id.btnTwo: {
                iNumber = 2;
                break;
            }
            case R.id.btnThree: {
                iNumber = 3;
                break;
            }
            case R.id.btnFour: {
                iNumber = 4;
                break;
            }
            case R.id.btnFive: {
                iNumber = 5;
                break;
            }
            case R.id.btnSix: {
                iNumber = 6;
                break;
            }
            case R.id.btnSeven: {
                iNumber = 7;
                break;
            }
            case R.id.btnEight: {
                iNumber = 8;
                break;
            }
            case R.id.btnNine: {
                iNumber = 9;
                break;
            }
            case R.id.btnTen: {
                iNumber = 10;
                break;
            }
            case R.id.btnEleven: {
                iNumber = 11;
                break;
            }
            case R.id.btnTwelve: {
                iNumber = 12;
                break;
            }
            case R.id.btnThirteen: {
                iNumber = 13;
                break;
            }
            case R.id.btnFourteen: {
                iNumber = 14;
                break;
            }
            case R.id.btnFifteen: {
                iNumber = 15;
                break;
            }
            case R.id.btnSixteen: {
                iNumber = 16;
                break;
            }
            case R.id.btnSeventeen: {
                iNumber = 17;
                break;
            }
            case R.id.btnEighteen: {
                iNumber = 18;
                break;
            }
            case R.id.btnNineteen: {
                iNumber = 19;
                break;
            }
            case R.id.btnTwenty: {
                iNumber = 20;
                break;
            }

        }

        String sMathTableResult = calcMathTables(sType, iNumber);

        Intent intent = new Intent(getApplicationContext(), NewResultActivity.class);

        intent.putExtra("type", sType);
        intent.putExtra("number", String.valueOf(iNumber));
        intent.putExtra("mathTable", sMathTableResult);

        startActivity(intent);

    }


    private String calcMathTables(String operator, int number) {

        StringBuilder sValor = new StringBuilder();

        int iResult;

        switch (operator) {

            case "+": {
                for (int i = 1; i<=10;i++) {
                    iResult = i + number;
                    //sValor = sValor + i +" + " + number + " = " + iResult  + "\n";
                    sValor.append(i).append(" + ").append(number).append(" = ").append(iResult).append("\n");
                }
                break;
            }

            case "-": {
                for (int i = 1; i<=10;i++) {
                    iResult = (i+number) - number;
                    //sValor = sValor + (i+number) +" - " + number + " = " + iResult  + "\n";
                    sValor.append(i + number).append(" - ").append(number).append(" = ").append(iResult).append("\n");
                }
                break;
            }

            case "*": {
                for (int i = 1; i<=10;i++) {
                    iResult = i * number;
                    //sValor = sValor + i +" x " + number + " = " + iResult  + "\n";
                    sValor.append(i).append(" x ").append(number).append(" = ").append(iResult).append("\n");
                }
                break;
            }

            case "/": {
                for (int i = 1; i<=10;i++) {
                    iResult = (i*number) / number;
                    //sValor = sValor + (i*number) +" / " + number + " = " + iResult  + "\n";
                    sValor.append(i * number).append(" / ").append(number).append(" = ").append(iResult).append("\n");
                }
                break;
            }


        }

        return sValor.toString();
    }

    private void logFirebaseEvents(String eventId, String eventName) {

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, eventId);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, eventName);
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
}
