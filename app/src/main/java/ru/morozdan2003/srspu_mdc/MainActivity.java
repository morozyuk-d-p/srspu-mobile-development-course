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

        // define listeners for buttons
        text_button.setOnClickListener(view -> {
            Intent intent = new Intent(this, TextExample.class);
            startActivity(intent);
        });
        clicker_button.setOnClickListener(view -> {
            Intent intent = new Intent(this, Clicker.class);
            startActivity(intent);
        });
    }
}