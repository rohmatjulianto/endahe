package com.joule.endahebralingmascakeb.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import com.github.islamkhsh.CardSliderViewPager;
import com.joule.endahebralingmascakeb.R;
import com.joule.endahebralingmascakeb.adapter.SliderTopAdapter;
import com.joule.endahebralingmascakeb.model.ModelBtn;
import com.joule.endahebralingmascakeb.model.ModelDestination;
import com.joule.endahebralingmascakeb.source.DummyData;

import java.util.ArrayList;

public class DetailCityActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_CITY = "extra";
    CardSliderViewPager sliderTopViewPager;
    ArrayList<ModelDestination> dataTopSlider = new ArrayList<>();

    CardView cardEcoTurism, cardCityTurism, cardCulinary;
    ModelBtn modelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_city);

         modelBtn = getIntent().getParcelableExtra(EXTRA_CITY);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(modelBtn.getName());
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        cardEcoTurism = findViewById(R.id.cardEcoTurism);
        cardCityTurism = findViewById(R.id.cardCityTurism);
        cardCulinary = findViewById(R.id.cardCulinary);

        cardCityTurism.setOnClickListener(this);
        cardCulinary.setOnClickListener(this);
        cardEcoTurism.setOnClickListener(this);

//        sliderTopViewPager = findViewById(R.id.sliderTopViewPager);
//        dataTopSlider.addAll(DummyData.getDataSliderTop());
//        sliderTopViewPager.setAdapter(new SliderTopAdapter(this, dataTopSlider));
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), DetailTypeDest.class);
        intent.putExtra(DetailTypeDest.EXTRA_KABUPATEN, modelBtn.getName());
        switch (v.getId()){
            case R.id.cardEcoTurism:
                intent.putExtra(DetailTypeDest.TYPE_DETAIL, "Eco Turism");
                break;
            case R.id.cardCityTurism:
                intent.putExtra(DetailTypeDest.TYPE_DETAIL, "City Turism");
                break;
            case R.id.cardCulinary:
                intent.putExtra(DetailTypeDest.TYPE_DETAIL, "Culinary");
                break;
        }

        startActivity(intent);
    }
}
