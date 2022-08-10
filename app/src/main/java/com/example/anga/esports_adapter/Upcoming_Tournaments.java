package com.example.anga.esports_adapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.anga.R;
import com.example.anga.Tournaments.VALORANT.UPCOMING_VALORANT;

public class Upcoming_Tournaments extends Fragment {

    Activity upcoming_valorant;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        upcoming_valorant = getActivity();

        return inflater.inflate(R.layout.fragment_upcoming__tournaments, container, false);
    }
    public void onStart(){
        super.onStart();

        CardView cardView1 = upcoming_valorant.findViewById(R.id.CARD_UPCOMING_VALORANT);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(upcoming_valorant, UPCOMING_VALORANT.class);
                startActivity(intent);
            }
        });

    }

}
