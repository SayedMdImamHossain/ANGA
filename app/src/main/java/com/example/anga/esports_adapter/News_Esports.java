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
import com.example.anga.Tournaments.VALORANT.NEWS_VALORANT;

public class News_Esports extends Fragment {

    Activity news_valorant;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        news_valorant = getActivity();

        return inflater.inflate(R.layout.fragment_news__esports, container, false);
    }
    public void onStart(){
        super.onStart();

        CardView cardView = news_valorant.findViewById(R.id.CARD_NEWS_VALORANT);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(news_valorant, NEWS_VALORANT.class);
                startActivity(intent);
            }
        });

    }
}