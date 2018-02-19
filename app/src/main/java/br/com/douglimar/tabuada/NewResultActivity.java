package br.com.douglimar.tabuada;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.analytics.FirebaseAnalytics;

public class NewResultActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_result);

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CoordinatorLayout coordinatorLayout = findViewById(R.id.coordinatorNewResult);


        CollapsingToolbarLayout toolbarLayout = findViewById(R.id.toolbar_layout);

        final TextView tvResultTitle = findViewById(R.id.tvNewResultTitle);
        TextView tvResultTableNo = findViewById(R.id.tvNewResultTableNo);

        Intent intent = getIntent();

        final TextView tvResult = findViewById(R.id.tvNewResult);

        String sType;
        String sNumber;

        sNumber = intent.getStringExtra("number");
        sType = intent.getStringExtra("type");

        switch (sType) {

            case "+":  {

                logFirebaseEvents("6", "Adicao");

                toolbarLayout.setTitle(getResources().getString(R.string.tabuada_adicao_title));
                tvResultTitle.setText(String.format("%s do %s", toolbarLayout.getTitle(), sNumber));

                toolbarLayout.setBackground(getResources().getDrawable(R.drawable.bg_plus_header));

                tvResultTableNo.setText(sNumber);
                tvResultTableNo.setTextColor(getResources().getColor(R.color.colorWhite));
                tvResultTableNo.setBackground(getResources().getDrawable(R.drawable.bg_plus_header));

                coordinatorLayout.setBackground(getResources().getDrawable(R.drawable.bg_plus_header));
                tvResult.setTextColor(getResources().getColor(R.color.colorAdicao));

                break;
            }

            case "-": {
                logFirebaseEvents("7", "Subtracao");

                toolbarLayout.setTitle(getResources().getString(R.string.tabuada_subtracao_title));
                tvResultTitle.setText(String.format("%s do %s", toolbarLayout.getTitle(), sNumber));


                toolbarLayout.setBackground(getResources().getDrawable(R.drawable.bg_minus_header));

                tvResultTableNo.setText(sNumber);
                tvResultTableNo.setTextColor(getResources().getColor(R.color.colorWhite));
                tvResultTableNo.setBackground(getResources().getDrawable(R.drawable.bg_minus_header));

                coordinatorLayout.setBackground(getResources().getDrawable(R.drawable.bg_minus_header));
                tvResult.setTextColor(getResources().getColor(R.color.colorSubtracao));


                break;
            }

            case "*": {

                logFirebaseEvents("8", "Multiplicacao");

                toolbarLayout.setTitle(getResources().getString(R.string.tabuada_multiplicacao_title));
                tvResultTitle.setText(String.format("%s do %s", toolbarLayout.getTitle(), sNumber));

                toolbarLayout.setBackground(getResources().getDrawable(R.drawable.bg_multiply_header));

                tvResultTableNo.setText(sNumber);
                tvResultTableNo.setTextColor(getResources().getColor(R.color.colorWhite));
                tvResultTableNo.setBackground(getResources().getDrawable(R.drawable.bg_multiply_header));

                coordinatorLayout.setBackground(getResources().getDrawable(R.drawable.bg_multiply_header));
                tvResult.setTextColor(getResources().getColor(R.color.colorMultiplicacao));

                break;
            }

            case "/": {

                logFirebaseEvents("9", "DIVISAO");

                toolbarLayout.setTitle(getResources().getString(R.string.tabuada_adicao_title));
                tvResultTitle.setText(String.format("%s do %s", toolbarLayout.getTitle(), sNumber));

                toolbarLayout.setBackground(getResources().getDrawable(R.drawable.bg_division_header));

                tvResultTableNo.setText(sNumber);
                tvResultTableNo.setTextColor(getResources().getColor(R.color.colorWhite));
                tvResultTableNo.setBackground(getResources().getDrawable(R.drawable.bg_division_header));

                coordinatorLayout.setBackground(getResources().getDrawable(R.drawable.bg_division_header));
                tvResult.setTextColor(getResources().getColor(R.color.colorDivisao));

                break;
            }
        }

        tvResult.setText(intent.getStringExtra("mathTable"));


        // Create a AdView
        // Load Advertisement Banner
        AdView adView = findViewById(R.id.adViewNewResult);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                shareContent(tvResultTitle.getText().toString() + "\n\n" + tvResult.getText().toString());
            }
        });

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

    private void shareContent(String pMessage) {


        logFirebaseEvents("5", "ShareContent");

        pMessage = pMessage + "\n\n" + getResources().getText(R.string.ddm_store);

        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, R.string.app_name);
        sharingIntent.putExtra(Intent.EXTRA_TEXT, pMessage);
        startActivity(Intent.createChooser(sharingIntent, String.valueOf(getResources().getText(R.string.comparilhar_com))));
    }

    private void logFirebaseEvents(String eventId, String eventName) {

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, eventId);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, eventName);
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
}
