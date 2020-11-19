package com.enegash.vernacular;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button goToLanguageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToLanguageButton = (Button) findViewById((R.id.languageButton));
        goToLanguageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Add code to instantiate intent class (parameters), and perform Activity.
                startActivity(new Intent(MainActivity.this, LanguageActivity.class));
            }
        });
    }

}