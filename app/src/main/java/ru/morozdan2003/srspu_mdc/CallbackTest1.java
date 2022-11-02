package ru.morozdan2003.srspu_mdc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CallbackTest1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callback_test1);

        // Define text field and button
        EditText text_field = (EditText) findViewById(R.id.callback_test1_field);
        Button button = (Button) findViewById(R.id.callback_test1_button);

        // Set button click listener
        button.setOnClickListener(view -> {
            Intent intent = new Intent();
            String text = text_field.getText().toString();
            intent.putExtra("message", text);
            setResult(RESULT_OK, intent);
            finish();
        });
    }
}