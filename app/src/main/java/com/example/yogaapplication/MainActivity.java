package com.example.yogaapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private EditText userMail,userPassword;
    private Button btnLogin;
    private Button btnregister;
    private FirebaseAuth mAuth;
    private Intent Dashboard;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userMail= findViewById(R.id.login_mail);
        userPassword= findViewById(R.id.login_password);
        btnLogin= findViewById(R.id.loginBtn);
        btnregister= findViewById(R.id.registerBtn);
        mAuth= FirebaseAuth.getInstance();
        Dashboard= new Intent(this, com.example.yogaapplication.DashboardActivity.class);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnLogin.setVisibility(View.VISIBLE);
                final String mail= userMail.getText().toString();
                final String password = userPassword.getText().toString();

                if(mail.isEmpty() || password.isEmpty()){
                    showMessage("Please verify all fields");

                }
                else{

                    signIn(mail,password);

                }



            }
        });

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent register = new Intent(getApplicationContext(), Register.class);
                startActivity(register);
                finish();
            }
        });

    }

    private void signIn(String mail, String password) {

        mAuth.signInWithEmailAndPassword(mail, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){

                            btnLogin.setVisibility(View.VISIBLE);
                            updateUI();

                        }

                        else{

                            showMessage(task.getException().getMessage());


                        }


                    }
                });


    }

    private void updateUI() {

        startActivity(Dashboard);
        finish();


    }

    private void showMessage(String text) {

        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();


    }
}
