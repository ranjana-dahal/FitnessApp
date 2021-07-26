package com.example.yogaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BodyBuildingWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_building_workout);
        Button btdu=(Button)findViewById(R.id.bt_du);
        Button btde=(Button)findViewById(R.id.bt_de);
        Button btlg=(Button)findViewById(R.id.bt_lg);
        btdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intp= new Intent(BodyBuildingWorkout.this,DumbellLunge.class);
                startActivity(intp);
            }
        });
        btde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intc= new Intent(BodyBuildingWorkout.this, DeadLift.class);
                startActivity(intc);
            }
        });
        btlg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intdo= new Intent(BodyBuildingWorkout.this,LegPress.class);
                startActivity(intdo);
            }
        });
    }

}
