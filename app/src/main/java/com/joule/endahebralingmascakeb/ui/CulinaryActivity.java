package com.joule.endahebralingmascakeb.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.github.islamkhsh.CardSliderViewPager;
import com.joule.endahebralingmascakeb.R;
import com.joule.endahebralingmascakeb.adapter.SliderTopAdapter;
import com.joule.endahebralingmascakeb.model.ModelDestination;
import com.joule.endahebralingmascakeb.source.DummyBanjar;
import com.joule.endahebralingmascakeb.source.DummyCulinary;

import java.util.ArrayList;

public class CulinaryActivity extends AppCompatActivity {

    public static final String TYPE_DETAIL = "type";
    public static final String EXTRA_KABUPATEN = "kab";
    ModelDestination modelDestination;
    TextView tvAbout, tvPhotos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culinary);

        String nameType = getIntent().getStringExtra(TYPE_DETAIL);
        String nameKab = getIntent().getStringExtra(EXTRA_KABUPATEN);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(nameType + " of " + nameKab);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        modelDestination = DummyCulinary.getData(nameKab);

        CardSliderViewPager cardSliderViewPager = findViewById(R.id.sliderTopViewPager);
        cardSliderViewPager.setAdapter(new SliderTopAdapter(this, DummyCulinary.getSider(modelDestination.getCity())));

//        if (modelDestination.getCity().equals("Banjarnegara")){
//            cardSliderViewPager.setAdapter(new SliderTopAdapter(this, DummyCulinary.getSider(modelDestination.getCity())));
//        }else if (modelDestination.getCity().equals("Cilacap")){
//
//        }

        tvAbout = findViewById(R.id.tv_about);
        tvPhotos = findViewById(R.id.tv_photos);

        tvAbout.setText(modelDestination.getAbout());
        tvPhotos.setText(modelDestination.getType());
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
}
