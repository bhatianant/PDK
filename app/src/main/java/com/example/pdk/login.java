package com.example.pdk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText userId, password;
    Button loginbtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userId = findViewById(R.id.UserEditText);
        password = findViewById(R.id.PassEditText);
        loginbtn = findViewById(R.id.loginBTN);



        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Uid = userId.getText().toString();
                String pass = password.getText().toString();
                if(Uid.isEmpty()||pass.isEmpty())
                {
                    if(pass.isEmpty()&&Uid.isEmpty()){
                        Toast.makeText(login.this, "Please Enter Password & ID", Toast.LENGTH_SHORT).show();
                    } else if (Uid.isEmpty()) {
                        Toast.makeText(login.this, "Please Enter ID", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(login.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                    }
                    }
                else if(Uid.equals("pdk")&&pass.equals("123"))
                {
                    Toast.makeText(login.this, "Welcome to PDK INTER COLEEGE", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,Dashboard.class);
                    startActivity(intent);
                    finish();
                }

                else{
                    Toast.makeText(login.this, "Invalid ID and Password", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}