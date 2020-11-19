package com.enegash.vernacular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class EnglishActivity extends AppCompatActivity {

    private TextView showMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        //Word, Pronunciation, Definition
        Bundle extras = getIntent().getExtras();

        showMessage = (TextView) findViewById(R.id.wordTextView);

        if (extras != null){
            String message = extras.getString("Message");
            String pronunciation = extras.getString("Pronunciation");
            String definition = extras.getString("Definition");

            showMessage.setText(message + "\n" + pronunciation + "\n\n" + definition);
        }
    }
}