package ru.morozdan2003.srspu_mdc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class DataExchangeTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_exchange_test);

        // Programmatically define views
        EditText text_field = (EditText) findViewById(R.id.activity_test_text_field);
        Button button = (Button) findViewById(R.id.activity_test_button);

        // Setup button click listener
        button.setOnClickListener(view -> {
            String message = text_field.getText().toString();
            Intent intent = new Intent(this, DataExchangeTestResponder.class);
            intent.putExtra("message", message);
            startActivity(intent);
        });
    }
}