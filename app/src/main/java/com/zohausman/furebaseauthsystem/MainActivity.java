package com.zohausman.furebaseauthsystem;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        drawerLayout = findViewById(R.id.drawerLayourt);
        navigationView= findViewById(R.id.navigationView);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,
                drawerLayout,
                toolbar,
                R.string.navigationOpen,
                R.string.navigationClosed);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }
}