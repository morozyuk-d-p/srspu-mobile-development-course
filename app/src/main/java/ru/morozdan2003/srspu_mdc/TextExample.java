package ru.morozdan2003.srspu_mdc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TextExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Default code to initialize the activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        // Import message string in variable
        String message = getResources().getString(R.string.message);

        // Define programmatic objects for activity views
        TextView textView = (TextView) findViewById(R.id.textView);
        EditText editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);

        // Setup event listeners for buttons
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String text = editText.getText().toString();
                textView.setText(text);
            }
        });
    }
}