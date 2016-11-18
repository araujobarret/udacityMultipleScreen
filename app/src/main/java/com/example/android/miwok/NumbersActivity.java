package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.ListView;
import java.util.ArrayList;
import model.Word;
import model.WordAdapter;


public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words= new ArrayList<Word>();
        Word word;

        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kanekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo'e"));
        words.add(new Word("ten", "na'aacha"));


        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(itemsAdapter);
    }

    @Override
    public boolean onKeyDown(int keycode, KeyEvent event) {
        if(keycode == KeyEvent.KEYCODE_BACK) {
            this.finish();
        }

        return super.onKeyDown(keycode, event);
    }
}
