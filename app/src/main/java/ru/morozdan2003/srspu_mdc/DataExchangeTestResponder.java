package ru.morozdan2003.srspu_mdc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DataExchangeTestResponder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_exchange_test_responder);

        // Get data from intent
        Intent intent = (Intent) getIntent();
        String message = intent.getStringExtra("message");

        // Programmatically define text view
        TextView text_view = (TextView) findViewById(R.id.activity_test_textbox);

        // Display payload string in text view
        text_view.setText(message);
    }
}