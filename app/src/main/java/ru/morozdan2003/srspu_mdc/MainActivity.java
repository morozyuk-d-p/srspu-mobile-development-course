package ru.morozdan2003.srspu_mdc;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Default code to initialize the activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Import message string in variable
        String message = getResources().getString(R.string.message);

        // Integer for counter for red button
        final Integer[] redButtonCounter = {0};

        // Define programmatic objects for activity views
        TextView textView = (TextView) findViewById(R.id.textView);
        EditText editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        ImageButton redButton = (ImageButton) findViewById(R.id.redButton);

        // Setup event listeners for buttons
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String text = editText.getText().toString();
                textView.setText(text);
            }
        });
        redButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                redButtonCounter[0]++;
                textView.setText("Кнопка нажата " + redButtonCounter[0].toString() + " раз");
            }
        });
    }
}