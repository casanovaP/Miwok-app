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
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("padre", "Vater", R.drawable.family_father));
        words.add(new Word("madre", "Mutter", R.drawable.family_mother));
        words.add(new Word("hijo", "Sohn", R.drawable.family_son));
        words.add(new Word("hija", "Töchter", R.drawable.family_daughter));
        words.add(new Word("hemano mayor", "älterer Bruder", R.drawable.family_older_brother));
        words.add(new Word("hermano menor", "jüngerer Bruder", R.drawable.family_younger_brother));
        words.add(new Word("hermana mayor", "ältere Schwester", R.drawable.family_older_sister));
        words.add(new Word("hermana menor", "jüngere Schwester", R.drawable.family_younger_sister));
        words.add(new Word("abuela", "Großmutter", R.drawable.family_grandmother));
        words.add(new Word("abuelo", "Großvater", R.drawable.family_grandfather));

        // Create an WordAdapter, whose data source is a list of link Words. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
