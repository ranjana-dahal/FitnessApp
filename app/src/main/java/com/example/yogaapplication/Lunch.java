package com.example.yogaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lunch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);

        Button btgrill=(Button)findViewById(R.id.bt_grill);
        Button btcha=(Button)findViewById(R.id.bt_cha);
        Button btgree=(Button)findViewById(R.id.bt_gree);
        btgrill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intp= new Intent(Lunch.this,GrilledChicken.class);
                startActivity(intp);
            }
        });
        btcha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intc= new Intent(Lunch.this, Chapati.class);
                startActivity(intc);
            }
        });
        btgree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intdo= new Intent(Lunch.this,GreenVegetables.class);
                startActivity(intdo);
            }
        });

    }
}
