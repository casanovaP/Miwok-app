/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private ArrayAdapter WordAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create and array of (words) the custom class Word
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "Eins", R.drawable.number_one));
        words.add(new Word("two", "Zwei", R.drawable.number_two));
        words.add(new Word("three", "Drei", R.drawable.number_three));
        words.add(new Word("four", "Vier", R.drawable.number_four));
        words.add(new Word("five", "Fünf", R.drawable.number_five));
        words.add(new Word("six", "Sechs", R.drawable.number_six));
        words.add(new Word("seven", "Sieben", R.drawable.number_seven));
        words.add(new Word("eight", "Acht", R.drawable.number_eight));
        words.add(new Word("nine", "Neun", R.drawable.number_nine));
        words.add(new Word("ten", "Zen", R.drawable.number_ten));

        /** LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        for(int index = 0; index < words.size(); index++) {

            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);
        }**/

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
