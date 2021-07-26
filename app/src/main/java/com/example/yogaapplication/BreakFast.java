package com.example.yogaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BreakFast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break_fast);
        Button btoat=(Button)findViewById(R.id.bt_oat);
        Button bteg=(Button)findViewById(R.id.bt_eg);
        Button btdrin=(Button)findViewById(R.id.bt_drin);
        btoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intp= new Intent(BreakFast.this,Oats.class);
                startActivity(intp);
            }
        });
        bteg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intc= new Intent(BreakFast.this, BoiledEgg.class);
                startActivity(intc);
            }
        });
        btdrin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intdo= new Intent(BreakFast.this,Drinks.class);
                startActivity(intdo);
            }
        });
    }
}
