package ru.morozdan2003.srspu_mdc;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MediaPlayback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_playback);
        // init player
        Uri sound_path = Uri.parse("android.resource://ru.morozdan2003.srspu_mdc/" + R.raw.doggy);
        MediaPlayer player = MediaPlayer.create(this, sound_path);
        player.start();

        // button
        Button stop_button = (Button) findViewById(R.id.media_stop_button);
        stop_button.setOnClickListener(view -> {
            player.stop();
            finish();
        });
    }
}