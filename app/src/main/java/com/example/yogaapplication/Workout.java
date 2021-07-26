package com.example.yogaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Workout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        Button bta=(Button)findViewById(R.id.bt_a);
        Button btl=(Button)findViewById(R.id.bt_l);
        Button btk=(Button)findViewById(R.id.bt_k);
        Button bth=(Button)findViewById(R.id.bt_h);
        Button btb=(Button)findViewById(R.id.bt_b);





        bta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inta= new Intent(Workout.this,ArmWorkout.class);
                startActivity(inta);
            }
        });
        btl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intl= new Intent(Workout.this,LegWorkout.class);
                startActivity(intl);
            }
        });
        btk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intk= new Intent(Workout.this,KneeWorkout.class);
                startActivity(intk);
            }
        });
        bth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inth= new Intent(Workout.this,HomeWorkout.class);
                startActivity(inth);
            }
        });

        btb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intb = new Intent(Workout.this, BodyBuildingWorkout.class);
                startActivity(intb);
            }
        });


    }
}
