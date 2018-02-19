package br.com.douglimar.tabuada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        Button btnAdicao = findViewById(R.id.btnAdicao);
        btnAdicao.setOnClickListener(this);

        Button btnSubtracao = findViewById(R.id.btnSubtracao);
        btnSubtracao.setOnClickListener(this);

        Button btnMultiplicacao = findViewById(R.id.btnMultiplicacao);
        btnMultiplicacao.setOnClickListener(this);

        Button btnDivisao = findViewById(R.id.btnDivisao);
        btnDivisao.setOnClickListener(this);



        // Create a AdView
        // Load Advertisement Banner
        AdView adView = findViewById(R.id.adViewMain);
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


    @Override
    public void onClick(View v) {




        Intent intent = new Intent(getApplicationContext(), TabuadaActivity.class);

        switch (v.getId()) {

            case R.id.btnAdicao: {

                logFirebaseEvents("1", "Adicao");
                intent.putExtra("type", "+");
                break;
            }

            case R.id.btnSubtracao: {
                logFirebaseEvents("2", "Subtracao");
                intent.putExtra("type", "-");
                break;
            }

            case R.id.btnMultiplicacao: {
                logFirebaseEvents("3", "Multiplicacao");
                intent.putExtra("type", "*");
                break;
            }

            case R.id.btnDivisao: {

                logFirebaseEvents("4", "Divisao");

                intent.putExtra("type", "/");
                break;
            }
            default: {
                intent.putExtra("type", "*");
                break;
            }

        }

        startActivity(intent);
    }


    private void logFirebaseEvents(String eventId, String eventName) {

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, eventId);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, eventName);
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
}
