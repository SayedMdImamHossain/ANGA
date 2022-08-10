package com.example.anga.Tournaments.VALORANT;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.anga.R;
import com.example.anga.WebViewController;

public class ONGOING_VALORANT extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ongoing_valorant);

        webView = findViewById(R.id.ONGOING_VALORANT_WEB);

        webView.loadUrl("https://www.vlr.gg/events");
        webView.setWebViewClient(new WebViewController());
    }
}