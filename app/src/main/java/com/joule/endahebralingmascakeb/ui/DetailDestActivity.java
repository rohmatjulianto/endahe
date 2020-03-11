package com.joule.endahebralingmascakeb.ui;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.islamkhsh.CardSliderViewPager;
import com.joule.endahebralingmascakeb.R;
import com.joule.endahebralingmascakeb.adapter.SliderTopAdapter;
import com.joule.endahebralingmascakeb.model.ModelDestination;
import com.joule.endahebralingmascakeb.source.DummyBanjar;
import com.joule.endahebralingmascakeb.source.DummyBms;
import com.joule.endahebralingmascakeb.source.DummyCilacap;
import com.joule.endahebralingmascakeb.source.DummyData;
import com.joule.endahebralingmascakeb.source.DummyKeb;
import com.joule.endahebralingmascakeb.source.DummyPbg;

public class DetailDestActivity extends AppCompatActivity {

    public static final String EXTRA_DATA = "extra";

    CardSliderViewPager cardSliderViewPager;
    CardView cardAbout, cardMaps;
    TextView tvAbout, tvMaps, tvHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_dest);

        final ModelDestination modelDestination = getIntent().getParcelableExtra(EXTRA_DATA);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(modelDestination.getName());
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        tvAbout = findViewById(R.id.tv_detail_about);
        tvAbout.setText("About "+ modelDestination.getName());

        tvMaps = findViewById(R.id.tv_detail_maps);
        tvMaps.setText("Maps "+ modelDestination.getName());

        tvHarga = findViewById(R.id.tv_harga);
        tvHarga.setText(modelDestination.getRating());
        cardSliderViewPager = findViewById(R.id.sliderTopViewPager);

        if (modelDestination.getCity().equals("Banjarnegara")){
            cardSliderViewPager.setAdapter(new SliderTopAdapter(this, DummyBanjar.getsliderofBanjar(modelDestination.getName())));
        }else if (modelDestination.getCity().equals("Cilacap")){
            cardSliderViewPager.setAdapter(new SliderTopAdapter(this, DummyCilacap.getsliderofCilacap(modelDestination.getName())));
        }else if (modelDestination.getCity().equals("Purbalingga")){
            cardSliderViewPager.setAdapter(new SliderTopAdapter(this, DummyPbg.getsliderofPbg(modelDestination.getName())));
        }else if (modelDestination.getCity().equals("Banyumas")){
            cardSliderViewPager.setAdapter(new SliderTopAdapter(this, DummyBms.getsliderofBms(modelDestination.getName())));
        }else if (modelDestination.getCity().equals("Kebumen")){
            cardSliderViewPager.setAdapter(new SliderTopAdapter(this, DummyKeb.getsliderofKeb(modelDestination.getName())));
        }



        cardAbout = findViewById(R.id.cardAbout);
        cardAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.dialog_about, null);

                TextView tvabout,tvPhotos;
                Button btnClose;

                btnClose = view.findViewById(R.id.btn_close);
                tvabout = view.findViewById(R.id.tv_about);
                tvPhotos = view.findViewById(R.id.tv_photos);

                tvabout.setText(modelDestination.getAbout());
                tvPhotos.setText(modelDestination.getType());

                builder.setView(view);
                final AlertDialog alertDialog = builder.create();
                alertDialog.show();

                btnClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
            }
        });

        cardMaps = findViewById(R.id.cardMaps);
        cardMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(modelDestination.getMapUrl()));
                startActivity(intent);
            }
        });


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
