package com.joule.endahebralingmascakeb.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.joule.endahebralingmascakeb.R;
import com.joule.endahebralingmascakeb.adapter.TypeDestAdapter;
import com.joule.endahebralingmascakeb.model.ModelDestination;
import com.joule.endahebralingmascakeb.source.DummyBanjar;
import com.joule.endahebralingmascakeb.source.DummyBms;
import com.joule.endahebralingmascakeb.source.DummyCilacap;
import com.joule.endahebralingmascakeb.source.DummyData;
import com.joule.endahebralingmascakeb.source.DummyKeb;
import com.joule.endahebralingmascakeb.source.DummyPbg;

import java.util.ArrayList;

public class DetailTypeDestActivity extends AppCompatActivity {

    public static final String TYPE_DETAIL = "type";
    public static final String EXTRA_KABUPATEN = "kab";
    RecyclerView rvDetail;
    ArrayList<ModelDestination> modelDestination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_type_dest);

        String nameType = getIntent().getStringExtra(TYPE_DETAIL);
        String nameKab = getIntent().getStringExtra(EXTRA_KABUPATEN);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(nameType + " of " + nameKab);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        rvDetail = findViewById(R.id.rv_ofTypeDest);
        rvDetail.setLayoutManager(new LinearLayoutManager(this));

        switch (nameKab){
            case "Banjarnegara":
                rvDetail.setAdapter( new TypeDestAdapter(this,DummyBanjar.getType(nameType)));
                break;
            case "Cilacap" :
                rvDetail.setAdapter( new TypeDestAdapter(this, DummyCilacap.getType(nameType)));
                break;
            case "Purbalingga" :
                rvDetail.setAdapter(new TypeDestAdapter(this, DummyPbg.getType(nameType)));
                break;
            case  "Banyumas" :
                rvDetail.setAdapter(new TypeDestAdapter(this, DummyBms.getType(nameType)));
                break;
            case "Kebumen" :
                rvDetail.setAdapter(new TypeDestAdapter(this, DummyKeb.getType(nameType)));
                break;
        }
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
