package com.example.anga.home_cards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.anga.R;
import com.example.anga.WebViewController;

public class Games_information extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_information);

        webView = findViewById(R.id.GAMES_INFO_WEB);

        webView.loadUrl("https://www.gameinformer.com/");
        webView.setWebViewClient(new WebViewController());


    }
}