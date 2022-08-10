package com.example.anga.bottomnavigation.fragments_bottom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.anga.R;
import com.example.anga.calender.CALENDER_MainActivity;
import com.example.anga.databinding.FragmentBottomHomeBinding;
import com.example.anga.home_cards.Calender_schedule;
import com.example.anga.home_cards.Favourite_teams;
import com.example.anga.home_cards.Games_information;
import com.example.anga.home_cards.Highlights;
import com.example.anga.logsign.PROFILE;

public class Bottom_Home extends Fragment {

 Activity card_highlights,card_calendar,card_games,card_teams,CARD_PROFILE_A;

    private FragmentBottomHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        card_highlights = getActivity();
        card_calendar = getActivity();
        card_games = getActivity();
        card_teams = getActivity();
        CARD_PROFILE_A = getActivity();

        binding = FragmentBottomHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    public void onStart(){
        super.onStart();

        CardView cardView1 = card_highlights.findViewById(R.id.CARD_HIGHLIGHTS);
        CardView cardView2 = card_calendar.findViewById(R.id.CARD_CALENDER);
        CardView cardView3 = card_games.findViewById(R.id.CARD_GAMES);
        CardView cardView4 = card_teams.findViewById(R.id.CARD_TEAMS);
        CardView cardView5 = CARD_PROFILE_A.findViewById(R.id.CARD_PROFILE_A);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(card_highlights,Highlights.class);
                startActivity(intent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(card_calendar, CALENDER_MainActivity.class);
                startActivity(intent);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(card_games, Games_information.class);
                startActivity(intent);
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(card_teams,Favourite_teams.class);
                startActivity(intent);
            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CARD_PROFILE_A, PROFILE.class);
                startActivity(intent);
            }
        });
    }








    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}