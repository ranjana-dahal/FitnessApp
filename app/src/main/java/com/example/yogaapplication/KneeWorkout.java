package com.example.yogaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KneeWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knee_workout);
        Button btf=(Button)findViewById(R.id.bt_f);
        Button btmo=(Button)findViewById(R.id.bt_mo);

        btf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intf= new Intent(KneeWorkout.this,FoamRolling.class);
                startActivity(intf);
            }
        });
        btmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intmo= new Intent(KneeWorkout.this, Mountain.class);
                startActivity(intmo);
            }
        });
    }
}
