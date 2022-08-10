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

import com.example.anga.GAMES.TICTACTOE.SplashActivity;
import com.example.anga.R;
import com.example.anga.databinding.FragmentBottomGamesBinding;

public class Bottom_Games extends Fragment {

    Activity tictactoe;

    private FragmentBottomGamesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        tictactoe = getActivity();

        binding = FragmentBottomGamesBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    public void onStart(){
        super.onStart();

        CardView cardView1 = tictactoe.findViewById(R.id.CARD_TICTACTOE_GAME);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tictactoe, SplashActivity.class);
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