package com.example.absen;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.activeandroid.query.Select;
import com.example.absen.activeandroid.DbAbsenModel;
import com.example.absen.detailactivity.guru.DetailGuru;
import com.example.absen.detailactivity.ortu.DetailOrangTua;
import com.example.absen.login.MainActivity;
import com.example.absen.util.MyConnectivityChecker;

public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashbg);

        final DbAbsenModel db;
        db = new Select().from(DbAbsenModel.class).executeSingle();
        if (MyConnectivityChecker.isConnected(this) && db == null) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();}
        else if (MyConnectivityChecker.isConnected(this) && db.getStatus().equalsIgnoreCase("guru")){
            Intent intent = new Intent(this, DetailGuru.class);
            startActivity(intent);
            finish();
        }else if (MyConnectivityChecker.isConnected(this) && db.getStatus().equalsIgnoreCase("ortu")){
            Intent intent = new Intent(this, DetailOrangTua.class);
            startActivity(intent);
            finish();
        }
        else {
            Intent intent = new Intent(this, InternetFailed.class);
            startActivity(intent);
            finish();
        }
    }
}

