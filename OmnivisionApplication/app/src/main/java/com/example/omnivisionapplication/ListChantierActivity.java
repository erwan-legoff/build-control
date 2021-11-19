package com.example.omnivisionapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.omnivisionapplication.placeholder.Chantier;
import com.example.omnivisionapplication.placeholder.ChantierAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListChantierActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_chantier);

        List<Chantier> listChantier = getListData();
        final ListView listView = (ListView) findViewById(R.id.listViewChantier);
        listView.setAdapter(new ChantierAdapter(this, listChantier));


        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                Chantier chantier = (Chantier) o;
                //Toast.makeText(ListChantierActivity.this, "Selected :" + " " + chantier, Toast.LENGTH_LONG).show();
                Intent intent2 = new Intent(ListChantierActivity.this, DetailChantierActivity.class);
                startActivity(intent2);
            }

        });
    }

    private  List<Chantier> getListData() {
        List<Chantier> list = new ArrayList<Chantier>();
        Chantier enzob = new Chantier(1, "chantier cool", R.drawable.logoouvrier, "chantier_image1");
        Chantier aymeriche = new Chantier(2, "chantier cool", R.drawable.logoouvrier, "logoouvrier");
        Chantier leocratie = new Chantier(3, "chantier cool", R.drawable.logoouvrier, "logoouvrier");


        list.add(enzob);
        list.add(aymeriche);
        list.add(leocratie);

        return list;
    }


    }
