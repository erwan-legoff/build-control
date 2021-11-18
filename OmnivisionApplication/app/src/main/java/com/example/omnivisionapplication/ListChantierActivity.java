package com.example.omnivisionapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListChantierActivity extends AppCompatActivity {

    ListView mListView;
    String[] prenoms = new String[]{
            "Antoine", "Benoit", "Cyril", "David", "Eloise", "Florent",
            "Gerard", "Hugo", "Ingrid", "Jonathan", "Kevin", "Logan",
            "Mathieu", "Noemie", "Olivia", "Philippe", "Quentin", "Romain","Sophie",
            "Tristan", "Ulric", "Vincent", "Willy", "Xavier","Yann", "Zoé"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_chantier);

         mListView = (ListView) findViewById(R.id.listViewChantier);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListChantierActivity.this,
                android.R.layout.simple_list_item_1, prenoms);
        mListView.setAdapter(adapter);

    }
}