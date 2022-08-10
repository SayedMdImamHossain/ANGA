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
import com.example.anga.Tournaments.VALORANT.ONGOING_VALORANT;

public class Ongoing_Tournaments extends Fragment {

    Activity ongoing_valorant;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ongoing_valorant = getActivity();

        return inflater.inflate(R.layout.fragment_ongoing__tournaments, container, false);
    }

    public void onStart(){
        super.onStart();

        CardView cardView1 = ongoing_valorant.findViewById(R.id.CARD_ONGOING_VALORANT);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ongoing_valorant, ONGOING_VALORANT.class);
                startActivity(intent);
            }
        });

    }


}