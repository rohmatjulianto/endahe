package com.joule.endahebralingmascakeb.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.joule.endahebralingmascakeb.R;

public class DetailTypeDest extends AppCompatActivity {

    public static final String TYPE_DETAIL = "type";
    public static final String EXTRA_KABUPATEN = "kab";

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
