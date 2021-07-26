package com.example.yogaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Track extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);
        Button btbre=(Button)findViewById(R.id.bt_bre);
        Button btlun=(Button)findViewById(R.id.bt_lun);
        Button btdin=(Button)findViewById(R.id.bt_din);
        btbre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intp= new Intent(Track.this,BreakFast.class);
                startActivity(intp);
            }
        });
        btlun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intc= new Intent(Track.this, Lunch.class);
                startActivity(intc);
            }
        });
        btdin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intdo= new Intent(Track.this,Dinner.class);
                startActivity(intdo);
            }
        });    }
}
