package com.example.anga.Tournaments.VALORANT;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.anga.R;
import com.example.anga.WebViewController;

public class NEWS_VALORANT extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_valorant);

        webView = findViewById(R.id.NEWS_VALORANT_WEB);

        webView.loadUrl("https://playvalorant.com/en-us/news/");
        webView.setWebViewClient(new WebViewController());
    }
}