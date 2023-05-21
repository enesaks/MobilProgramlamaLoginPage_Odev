package com.example.mobilprogramlamaloginpage_odev;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity3 extends AppCompatActivity {

    BottomNavigationView bottomNAvim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler, new homeFragment()).commit();

        bottomNAvim = findViewById(R.id.bnavi);


        bottomNAvim.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler, new homeFragment()).commit();
                        break;
                    case R.id.person:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler, new personFragment()).commit();
                        break;
                    case R.id.search:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentler, new searchFragment()).commit();
                        break;
                    default:

                        break;
                }

                return  true;
            }
        });



    }
    public void onBackPressed(){
        Intent geriIntent = new Intent(MainActivity3.this,MainActivity.class);
        finish();
        startActivity(geriIntent);
    }
}