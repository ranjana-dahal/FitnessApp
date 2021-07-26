package com.example.yogaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static android.widget.Toast.LENGTH_LONG;


public class Profile extends AppCompatActivity {
    EditText editTextName;
    Button buttonsave;
    EditText editTextWeight;
    EditText editTextHeight;
    EditText editTextGen;

    DatabaseReference database;
    Member member;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
         database= FirebaseDatabase.getInstance().getReference("Member");
         editTextName=(EditText)findViewById(R.id.Name);
        editTextWeight=(EditText)findViewById(R.id.weight);
        editTextHeight=(EditText)findViewById(R.id.height);
        editTextGen=(EditText)findViewById(R.id.gender);
        buttonsave=(Button) findViewById(R.id.save);

        buttonsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addMember();

            }
        });


    }
    private void addMember(){
        String name= editTextName.getText().toString().trim();
        String weight= editTextWeight.getText().toString().trim();
        String Height= editTextHeight.getText().toString().trim();
        String gender= editTextGen.getText().toString().trim();

        if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(weight) && !TextUtils.isEmpty(Height) && !TextUtils.isEmpty(gender)){
            String id= database.push().getKey();
            Member member = new Member(id,name,weight,Height,gender);

            database.child(id).setValue(member);
            Toast.makeText(this,"Member added", LENGTH_LONG).show();

        }else {
            Toast.makeText(this,"Enter all fields",LENGTH_LONG).show();
        }
    }
}
