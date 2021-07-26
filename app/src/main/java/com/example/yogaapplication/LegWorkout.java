package com.example.yogaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class LegWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_workout);
        Button bts=(Button)findViewById(R.id.bt_s);
        Button btbr=(Button)findViewById(R.id.bt_br);
        Button btsi=(Button)findViewById(R.id.bt_si);
        bts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intp= new Intent(LegWorkout.this,Squat.class);
                startActivity(intp);
            }
        });
        btbr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intc= new Intent(LegWorkout.this, Bridge.class);
                startActivity(intc);
            }
        });
        btsi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intdo= new Intent(LegWorkout.this,SideLunge.class);
                startActivity(intdo);
            }
        });


    }
}



