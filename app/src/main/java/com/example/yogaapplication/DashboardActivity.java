package com.example.yogaapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView homecard,profilecard,alarmcard,calendercard,logoutcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        homecard = (CardView) findViewById(R.id.home_card);
        profilecard = (CardView) findViewById(R.id.profile_card);
        alarmcard = (CardView) findViewById(R.id.alarm_card);
        calendercard = (CardView) findViewById(R.id.calender_card);
        logoutcard = (CardView) findViewById(R.id.logout_card);
        homecard.setOnClickListener(this);
        profilecard.setOnClickListener(this);
        alarmcard.setOnClickListener(this);
        calendercard.setOnClickListener(this);
        logoutcard.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent i;

        switch(v.getId()){
            case R.id.home_card: i = new Intent(this,Home.class); startActivity(i); break;
            case  R.id.profile_card: i = new Intent(this,Profile.class); startActivity(i); break;
            case  R.id.alarm_card: i = new Intent(this,Alarm.class); startActivity(i);break;
            case  R.id.calender_card: i= new Intent(this,Calender.class);startActivity(i); break;
            case  R.id.logout_card: i= new Intent(this,Logout.class);startActivity(i); break;
            default:break;

        }


    }
}
