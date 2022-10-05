package ru.morozdan2003.srspu_mdc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Clicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicker);

        // variable to count clicker events
        final Integer[] clickerCounter = {0};

        // handle some views
        TextView clickerText = (TextView) findViewById(R.id.clickerText);
        ImageButton clickerButton = (ImageButton) findViewById(R.id.clickerButton);

        // setup event listener for button
        clickerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                clickerCounter[0]++;
                clickerText.setText("Кнопка нажата " + clickerCounter[0].toString() + " раз");
            }
        });
    }
}