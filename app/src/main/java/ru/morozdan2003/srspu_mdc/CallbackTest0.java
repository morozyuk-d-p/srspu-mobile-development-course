package ru.morozdan2003.srspu_mdc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CallbackTest0 extends AppCompatActivity {
    final int REQUEST_CALLBACK_TEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callback_test0);

        // Define views' variables
        TextView textview = (TextView) findViewById(R.id.callback_test0_text);
        Button button = (Button) findViewById(R.id.callback_test0_button);

        // Create button click listener
        button.setOnClickListener(view -> {
            Intent intent = new Intent(this, CallbackTest1.class);
            startActivityForResult(intent, REQUEST_CALLBACK_TEST);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView textview = (TextView) findViewById(R.id.callback_test0_text);
        String text = data.getStringExtra("message");
        textview.setText(text);
    }
}