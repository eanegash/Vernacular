package com.enegash.vernacular;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LanguageActivity extends AppCompatActivity implements View.OnClickListener {

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


        goToEnglishButton.setOnClickListener((View.OnClickListener) this);
        goToTigrynaButton.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.englishButton:
                Intent intentEng = new Intent(LanguageActivity.this, WordActivity.class);
                intentEng.putExtra("Language", "English");
                intentEng.putExtra("Word", "Onamonapia");
                intentEng.putExtra("Pronunciation", "on-o-mat-o-poe-ia");
                intentEng.putExtra("Definition", "The formation or use of words such as buzz or murmur that imitate sounds associated with the objects or actions they refer to.");
                startActivity(intentEng);
                break;
            case R.id.tigrynaButton:
                Intent intentTig = new Intent(LanguageActivity.this, WordActivity.class);
                intentTig.putExtra("Language", "Tigryna");
                intentTig.putExtra("Word", "Sidi");
                intentTig.putExtra("Pronunciation", "se-di");
                intentTig.putExtra("Definition", "To misbehave. To act in an un-polite manner.");
                startActivity(intentTig);
                break;
            case R.id.goBackButton:
                startActivity(new Intent(LanguageActivity.this, MainActivity.class));
                break;

        }
    }
}