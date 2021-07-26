package com.example.yogaapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Observer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Logout extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private CardView logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        firebaseAuth = FirebaseAuth.getInstance();

        logout = (CardView) findViewById(R.id.logout_card);


            firebaseAuth.signOut();
            finish();
            startActivity(new Intent(Logout.this, MainActivity.class));


        }
    }

