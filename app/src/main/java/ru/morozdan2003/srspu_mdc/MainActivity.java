package ru.morozdan2003.srspu_mdc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Default code to initialize the activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Import message string in variable
        String message = getResources().getString(R.string.message);

        // Define programmatic objects for activity views
        TextView textView = (TextView) findViewById(R.id.message);
        EditText textField = (EditText) findViewById(R.id.editTextTextPersonName2);

        // Replace contents of defined views with message string
        textView.setText(message);
        textField.setText(message);
    }
}