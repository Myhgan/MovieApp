package com.example.myapplication.movies;


import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.util.Util;

import java.util.List;

public class DetailActivity extends AppCompatActivity {

    private PlayerView playerView;
    private SimpleExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailactivity);

        playerView = findViewById(R.id.exoPlayerView);
        initializePlayer();
    }

    private void initializePlayer() {
        player = new SimpleExoPlayer.Builder(this).build();
        playerView.setPlayer(player);

        // Lấy danh sách phim từ model Movie
        List<Movie> movieList = Movie.GetList(this);

        if (!movieList.isEmpty()) {
            // Lấy URL video từ đối tượng Movie đầu tiên trong danh sách
            String videoUrl = movieList.get(0).getUrl();

            // Tạo một MediaItem
            MediaItem mediaItem = MediaItem.fromUri(Uri.parse(videoUrl));

            // Đặt MediaItem cho player
            player.setMediaItem(mediaItem);

            // Chuẩn bị player
            player.prepare();

            // Bắt đầu phát
            player.play();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (Util.SDK_INT >= 24) {
            initializePlayer();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if ((Util.SDK_INT < 24 || player == null)) {
            initializePlayer();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (Util.SDK_INT < 24) {
            releasePlayer();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (Util.SDK_INT >= 24) {
            releasePlayer();
        }
    }

    private void releasePlayer() {
        if (player != null) {
            player.release();
            player = null;
        }
    }
}
