package com.example.bottom_navigation_view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
BottomNavigationView btm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btm = (BottomNavigationView) findViewById(R.id.btmnav);
        HomeFragment home = new HomeFragment();
        // 2
        FragmentTransaction obj1 = getSupportFragmentManager().beginTransaction();
        obj1.replace(R.id.placeholder,home).commit();
        btm.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:

                        HomeFragment home = new HomeFragment();
                        FragmentTransaction obj1 = getSupportFragmentManager().beginTransaction();
                        obj1.replace(R.id.placeholder,home).commit();
                        break;
                    case R.id.search:
                        SearchFragment search = new SearchFragment();
                        FragmentTransaction obj2 = getSupportFragmentManager().beginTransaction();
                        obj2.replace(R.id.placeholder,search).commit();
                        break;
                    case R.id.add:
                        addFragment add = new addFragment();
                        FragmentTransaction obj3 = getSupportFragmentManager().beginTransaction();
                        obj3.replace(R.id.placeholder,add).commit();
                        break;
                    case R.id.favorite:
                        favoriteFragment favorite = new favoriteFragment();
                        FragmentTransaction obj4 = getSupportFragmentManager().beginTransaction();
                        obj4.replace(R.id.placeholder,favorite).commit();
                        break;
                    case R.id.person:
                        profileFragment profile = new profileFragment();
                        FragmentTransaction obj5 = getSupportFragmentManager().beginTransaction();
                        obj5.replace(R.id.placeholder,profile).commit();
                        break;
                }
                return true;
            }
        });
    }
}