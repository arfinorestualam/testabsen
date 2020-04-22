package com.example.absen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.absen.login.MainActivity;
import com.example.absen.util.MyConnectivityChecker;

public class InternetFailed extends AppCompatActivity {

    TextView reload;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet_failed);
        reload = findViewById(R.id.txtReload);
        reload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MyConnectivityChecker.isConnected(InternetFailed.this)) {
                    Intent i = new Intent(InternetFailed.this, MainActivity.class);
                    startActivity(i);
                }else {
                    Toast.makeText(InternetFailed.this, "Nyalain Internetnya :(", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    }

