package com.example.hackaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CatalagoActivity extends AppCompatActivity {

    ImageView imgLamp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalago);

        imgLamp = (ImageView) findViewById(R.id.img_Pato);
        imgLamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CatalagoActivity.this, LamparaActivity.class);
                startActivity(i);
            }
        });
    }
}