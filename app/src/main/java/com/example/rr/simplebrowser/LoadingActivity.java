package com.example.rr.simplebrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LoadingActivity extends AppCompatActivity {
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        web=(WebView)findViewById(R.id.Web);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setBuiltInZoomControls(true);

        String getData= getIntent().getExtras().getString("data");

        if(getData.equals("Facebook")){
            web.loadUrl("http://www.facebook.com");
        }
        if(getData.equals("Google")){
            web.loadUrl("http://www.google.com");
        }
        if(getData.equals("Twiter")){
            web.loadUrl("http://twitter.com");
        }
    }
}
