package com.example.anga.Tournaments.VALORANT;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.anga.R;
import com.example.anga.WebViewController;

public class UPCOMING_VALORANT extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_valorant);

        webView = findViewById(R.id.UPCOMING_VALORANT_WEB);

        webView.loadUrl("https://escharts.com/upcoming-tournaments/valorant");
        webView.setWebViewClient(new WebViewController());
    }
}