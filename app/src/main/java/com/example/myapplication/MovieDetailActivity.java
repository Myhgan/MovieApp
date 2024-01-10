package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MovieDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailactivity);

        // Lấy dữ liệu từ Intent
        String movieTitle = getIntent().getStringExtra("MOVIE_TITLE");
        String movieImageUrl = getIntent().getStringExtra("MOVIE_IMAGE_URL");

        // Thiết lập thông tin cho các view trong layout
        // Ví dụ: Set title cho TextView, load image từ URL vào ImageView, v.v...

        ImageView backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Assuming HomeActivity is the name of your home screen activity
                Intent homeIntent = new Intent(MovieDetailActivity.this, MainActivity.class);
                // If you want to clear all previous activities off the stack
                homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(homeIntent);
                finish(); // If you want to close the current activity
            }
        });
    }
}
