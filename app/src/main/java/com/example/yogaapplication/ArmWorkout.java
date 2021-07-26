package com.example.yogaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class ArmWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arm_workout);
        Button btp=(Button)findViewById(R.id.bt_p);
        Button btc=(Button)findViewById(R.id.bt_c);
        Button btdo=(Button)findViewById(R.id.bt_do);

        btp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intp= new Intent(ArmWorkout.this,Pushup.class);
                startActivity(intp);
            }
        });
        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intc= new Intent(ArmWorkout.this, Crane.class);
                startActivity(intc);
            }
        });
        btdo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intdo= new Intent(ArmWorkout.this,DownwardFacinfDog.class);
                startActivity(intdo);
            }
        });

    }
}
