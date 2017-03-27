package com.example.rr.simplebrowser;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Url;
    Button go,fb,google,twtr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Url=(EditText)findViewById(R.id.Url);
        go=(Button)findViewById(R.id.Go);
        fb=(Button)findViewById(R.id.Fb);
        google=(Button)findViewById(R.id.Google);
        twtr=(Button)findViewById(R.id.twiter);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string=Url.getText().toString() ;// Getting the value from the user
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+string));
                startActivity(in);
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,LoadingActivity.class);
                in.putExtra("data","Facebook");
                startActivity(in);
            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,LoadingActivity.class);
                in.putExtra("data","Google");
                startActivity(in);
            }
        });
        twtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,LoadingActivity.class);
                in.putExtra("data","Twiter");
                startActivity(in);
            }
        });
    }
}
