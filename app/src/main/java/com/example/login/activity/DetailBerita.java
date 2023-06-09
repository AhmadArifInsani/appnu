package com.example.login.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.login.R;
import com.example.login.model.BeritaModel;

public class DetailBerita extends AppCompatActivity {
    ImageView ImgBack, ImgHome, ImgThumbnail;
    TextView Title, tvJudul, tvDetail, tvPenulis, tvDate;
    BeritaModel beritaModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_berita);

        ImgBack = findViewById(R.id.ibBack);
        ImgHome = findViewById(R.id.ivHomeButton);
        Title = findViewById(R.id.tvTitle);

        Title.setText("Berita Kegiatan");

        ImgBack.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), BeritaKegiatan.class));
        });

        ImgHome.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), HomeActivity.class));
        });
        getData();
    }
    @SuppressLint("CheckResult")
    public void getData(){
        ImgThumbnail = findViewById(R.id.ivThumbnail);
        tvJudul = findViewById(R.id.tvJudul);
        tvDetail = findViewById(R.id.tvDetail);

        beritaModel = getIntent().getParcelableExtra("BeritaModel");
        tvJudul.setText(beritaModel.getJudul());
        tvDetail.setText(beritaModel.getDeskripsi());
        Glide.with(this).load(beritaModel.getImage()).into(ImgThumbnail);
    }
}