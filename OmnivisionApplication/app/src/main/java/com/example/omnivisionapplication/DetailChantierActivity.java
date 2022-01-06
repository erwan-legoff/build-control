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

public class DetailChantierActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_chantier);


        List<Incident> listIncident = getListData();
        final ListView listView = (ListView) findViewById(R.id.listIncidentView);
        listView.setAdapter(new IncidentAdapter(this, listIncident));


        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                Incident incident = (Incident) o;
                Toast.makeText(DetailChantierActivity.this, "Selected :" + " " + incident, Toast.LENGTH_LONG).show();
            }

        });
    }

    private  List<Incident> getListData() {
        List<Incident> list = new ArrayList<Incident>();
        Incident enzob = new Incident("Perte de main", "Le male pourtant sacrément galber a perdu sa main dans une opération delicate", 4, "19-12-2000", "logoouvrier");
        Incident aymeriche = new Incident("Perte de main", "Le male pourtant sacrément galber a perdu sa main dans une opération delicate", 6, "19-12-2000", "logoouvrier");
        Incident leocratie = new Incident("Perte de main", "Le male pourtant sacrém", 1, "19-12-2000", "logoouvrier");


        list.add(enzob);
        list.add(aymeriche);
        list.add(leocratie);

        return list;
    }
}