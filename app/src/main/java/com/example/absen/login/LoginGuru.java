package com.example.absen.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.absen.R;

public class LoginGuru extends AppCompatActivity {

    EditText username, pass;
    Button login;
    String user, passed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_guru);
        username = findViewById(R.id.txtUseraname);
        pass = findViewById(R.id.txtPassword);
        login = findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = username.getText().toString();
                passed = pass.getText().toString();
                logined(user,passed);
            }
        });

    }


    private void logined(String user, String passed) {

    }


}
