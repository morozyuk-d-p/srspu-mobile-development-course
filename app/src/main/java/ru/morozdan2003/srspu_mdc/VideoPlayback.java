package ru.morozdan2003.srspu_mdc;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.VideoView;

public class VideoPlayback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_playback);

        VideoView videoview = (VideoView) findViewById(R.id.videoView);
        Button play_button = (Button) findViewById(R.id.playButton);
        Button stop_button = (Button) findViewById(R.id.stopButton);

        play_button.setOnClickListener(view -> {
            videoview.start();
        });

        stop_button.setOnClickListener(view -> {
            videoview.stopPlayback();
        });

        Uri video_path = Uri.parse("android.resource://ru.morozdan2003.srspu_mdc/" + R.raw.doggy_sleeping);
        videoview.setVideoURI(video_path);
        videoview.start();
    }
}