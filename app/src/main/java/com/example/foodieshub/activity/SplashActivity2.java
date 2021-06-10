package com.example.foodieshub.activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;

import com.example.foodieshub.R;
import com.example.foodieshub.Utils;

public class SplashActivity2 extends AppCompatActivity {

    private Button btn_get_started;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        Utils.changeStatusBarAndNavigationBarColor( SplashActivity2.this, R.color.mirage,R.color.mirage_dark);
        btn_get_started = findViewById(R.id.btn_get_started);
        btn_get_started.setOnClickListener(v -> {
            startActivity(new Intent(SplashActivity2.this,MainActivity.class));
            finish();
        });
    }
}