package com.enegash.vernacular;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LanguageActivity extends AppCompatActivity {

    private Button goToEnglishButton;
    private Button goToTigrynaButton;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        goToEnglishButton = (Button) findViewById(R.id.englishButton);
        goToTigrynaButton = (Button) findViewById(R.id.tigrynaButton);
        backButton = (Button) findViewById(R.id.goBackButton);

        //English Button
        goToEnglishButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LanguageActivity.this, EnglishActivity.class);
                intent.putExtra("Word", "Onamonapia");
                intent.putExtra("Pronunciation", "on-o-mat-o-poe-ia");
                intent.putExtra("Definition", "The formation or use of words such as buzz or murmur that imitate sounds associated with the objects or actions they refer to.");
                
                startActivity(intent);
            }
        });

        //Tigryna Button
        goToTigrynaButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LanguageActivity.this, TigrynaActivity.class);
                intent.putExtra("Word", "Sidi");
                intent.putExtra("Pronunciation", "se-di");
                intent.putExtra("Definition", "To misbehave. To act in an un-polite manner.");

                startActivity(intent);
            }
        });

        //Back Button
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(LanguageActivity.this, MainActivity.class));
            }
        });
    }
}