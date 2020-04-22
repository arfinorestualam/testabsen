package com.example.absen.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.absen.R;

public class MainActivity extends AppCompatActivity {

    Button guru, ortu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guru = findViewById(R.id.imgBtnGuru);
        ortu = findViewById(R.id.imgBtnOrtu);
        guru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LoginGuru.class);
                startActivity(i);
            }
        });

        ortu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LoginOrtu.class);
                startActivity(i);
            }
        });
    }
}
