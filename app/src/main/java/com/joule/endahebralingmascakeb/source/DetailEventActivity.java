package com.joule.endahebralingmascakeb.source;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.github.islamkhsh.CardSliderViewPager;
import com.joule.endahebralingmascakeb.R;
import com.joule.endahebralingmascakeb.adapter.SliderTopAdapter;
import com.joule.endahebralingmascakeb.model.ModelEvent;

public class DetailEventActivity extends AppCompatActivity {
    public static String EXTRA = "Extra";

    CardSliderViewPager cardSliderViewPager;
    TextView desc1, desc2, photos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_event);
        ModelEvent modelEvent = getIntent().getParcelableExtra(EXTRA);

        cardSliderViewPager = findViewById(R.id.sliderTopViewPager);
        cardSliderViewPager.setAdapter(new SliderTopAdapter(this,DummyEvent.getDataSliderTop(modelEvent.getName())));

        desc1 = findViewById(R.id.tv_desc1);
        desc2 = findViewById(R.id.tv_desc2);
        photos = findViewById(R.id.tv_photos);

        desc1.setText(modelEvent.getDesc1());
        desc2.setText(modelEvent.getDesc2());
        photos.setText(modelEvent.getPhotosby());

        getSupportActionBar().setTitle(modelEvent.getName());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Log.d("yy", "onCreate: "+DummyEvent.getDataSliderTop(modelEvent.getName()).size());
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
