package com.example.yogaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
        Button btsal=(Button)findViewById(R.id.bt_sal);
        Button btpast=(Button)findViewById(R.id.bt_past);

        btsal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intf= new Intent(Dinner.this,Salad.class);
                startActivity(intf);
            }
        });
        btpast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intmo= new Intent(Dinner.this, Pasta.class);
                startActivity(intmo);
            }
        });
    }
}
