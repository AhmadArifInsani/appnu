package com.example.login.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.login.R;

public class AlumniActivity extends AppCompatActivity {
    private ImageView ImgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumni);
        ImgBack = findViewById(R.id.back);

        ImgBack.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), HomeActivity.class));
        });
    }
}