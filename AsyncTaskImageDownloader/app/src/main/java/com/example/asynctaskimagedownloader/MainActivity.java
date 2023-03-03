package com.example.asynctaskimagedownloader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AsyncTaskImgDownloader imgDownloader = new AsyncTaskImgDownloader(this);

        imgDownloader.execute("https://picsum.photos/300");
    }
}