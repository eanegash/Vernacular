package com.enegash.vernacular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WordActivity extends AppCompatActivity {

    private TextView dictionaryWord;
    private TextView dictionaryDefinition;
    private Bundle extras;


    private TextView whichCountryFlag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word2);

        //Word, Pronunciation, Definition
        extras = getIntent().getExtras();

        dictionaryWord = (TextView) findViewById(R.id.wordDictView);
        dictionaryDefinition = (TextView) findViewById(R.id.definitionView);


        whichCountryFlag = (TextView) findViewById(R.id.flagPlaceHolder);


        if (extras != null){
            String lang = extras.getString("Language");
            String word = extras.getString("Word");
            String pronunciation = extras.getString("Pronunciation");
            String definition = extras.getString("Definition");

            setUp(lang, word, pronunciation, definition);
        }
    }


    public void setUp(String lang, String word, String pronunciation, String define){
        dictionaryWord.setText(word + "\n" + pronunciation);
        whichCountryFlag.setText(lang);
        dictionaryDefinition.setText(define);
    }
}