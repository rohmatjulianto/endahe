package com.joule.endahebralingmascakeb;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;

import android.view.Menu;

import com.google.android.material.navigation.NavigationView;
import com.joule.endahebralingmascakeb.ui.AboutFragment;
import com.joule.endahebralingmascakeb.ui.HomeFragment;
import com.joule.endahebralingmascakeb.ui.TraditionalEvent;
import com.joule.endahebralingmascakeb.ui.TraditionalMusicFragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ActionBarDrawerToggle toggle;
    DrawerLayout drawer;
    Toolbar toolbar;
    NavigationView navigationView;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle("Home");

        drawer = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        mediaPlayer = MediaPlayer.create(this, R.raw.music);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you

        if (savedInstanceState == null){
            Fragment currentFragment = new HomeFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.nav_host_fragment, currentFragment)
                    .commit();
        }

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                String title = null;
                switch (item.getItemId()){
                    case R.id.nav_home:
                        title = "Home";
                        fragment = new HomeFragment();
                        break;
                    case R.id.nav_about:
                        title = "About";
                        fragment = new AboutFragment();
                        break;
                    case R.id.nav_traditional:
                        title = "Traditional Event";
                        fragment = new TraditionalEvent();
                        break;
                    case R.id.nav_music:
                        title = "Traditional Music";
                        fragment = new TraditionalMusicFragment();
                        break;
                }

                if (fragment != null){
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.nav_host_fragment, fragment)
                            .commit();
                    if (getSupportActionBar() != null){
                        getSupportActionBar().setTitle(title);
                    }
                    drawer.closeDrawer(GravityCompat.START);
                }

                return true;
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        );
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_music){
            if (mediaPlayer.isPlaying()){
                mediaPlayer.stop();
            }else{
                mediaPlayer = MediaPlayer.create(this, R.raw.music);
                mediaPlayer.start();
            }
        }
        return true;
    }
}
