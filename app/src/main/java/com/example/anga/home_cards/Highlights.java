package com.example.anga.home_cards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.anga.R;
import com.example.anga.Tournaments.VALORANT.HIGHLIGHT_VALORANT;
import com.example.anga.logsign.Register;

public class Highlights extends AppCompatActivity {

    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highlights);

        cardView = findViewById(R.id.CARD_HIGHLIGHTS_VALORANT);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HIGHLIGHT_VALORANT.class));
            }
        });



    }
}