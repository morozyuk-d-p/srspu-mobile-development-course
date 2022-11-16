package ru.morozdan2003.srspu_mdc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // handle buttons
        Button text_button = (Button) findViewById(R.id.text_button);
        Button clicker_button = (Button) findViewById(R.id.clicker_button);
        Button activity_button = (Button) findViewById(R.id.activity_button);
        Button callback_button = (Button) findViewById(R.id.callback_button);
        Button media_button = (Button) findViewById(R.id.media_button);
        Button video_button = (Button) findViewById(R.id.video_playback_menu_entry);

        // define listeners for buttons
        text_button.setOnClickListener(view -> {
            Intent intent = new Intent(this, TextExample.class);
            startActivity(intent);
        });
        clicker_button.setOnClickListener(view -> {
            Intent intent = new Intent(this, Clicker.class);
            startActivity(intent);
        });
        activity_button.setOnClickListener(view -> {
            Intent intent = new Intent(this, DataExchangeTest.class);
            startActivity(intent);
        });
        callback_button.setOnClickListener(view -> {
            Intent intent = new Intent(this, CallbackTest0.class);
            startActivity(intent);
        });
        media_button.setOnClickListener(view -> {
            Intent intent = new Intent(this, MediaPlayback.class);
            startActivity(intent);
        });
        video_button.setOnClickListener(view -> {
            Intent intent = new Intent(this, VideoPlayback.class);
            startActivity(intent);
        });
    }
}