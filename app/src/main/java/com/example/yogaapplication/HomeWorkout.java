package com.example.yogaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_workout);
        Button btg=(Button)findViewById(R.id.bt_g);
        Button btli=(Button)findViewById(R.id.bt_li);

        btg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intg= new Intent(HomeWorkout.this,GyanMudra.class);
                startActivity(intg);
            }
        });
        btli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intli= new Intent(HomeWorkout.this, LingaMudra.class);
                startActivity(intli);
            }
        });    }
}
