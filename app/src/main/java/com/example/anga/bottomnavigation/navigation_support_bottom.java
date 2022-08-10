package com.example.anga.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.anga.R;
import com.example.anga.bottomnavigation.fragments_bottom.Bottom_Esports;
import com.example.anga.bottomnavigation.fragments_bottom.Bottom_Games;
import com.example.anga.bottomnavigation.fragments_bottom.Bottom_Home;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class navigation_support_bottom extends AppCompatActivity implements View.OnClickListener {


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_support_bottom);


        FragmentTransaction Transaction = getSupportFragmentManager().beginTransaction();
        Transaction.replace(R.id.container, new Bottom_Home());
        Transaction.commit();

        bottomNavigationView = findViewById(R.id.bottomnavigation);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction Transaction = getSupportFragmentManager().beginTransaction();

                switch (item.getItemId())
                {
                    case R.id.menu_home:
                        Transaction.replace(R.id.container, new Bottom_Home());
                        break;
                    case R.id.menu_esports:
                        Transaction.replace(R.id.container, new Bottom_Esports());
                        break;

                    case R.id.menu_games:
                        Transaction.replace(R.id.container, new Bottom_Games());
                        break;
                }
                Transaction.commit();

                return true;
            }
        });







    }

    @Override
    public void onClick(View view) {



    }
}