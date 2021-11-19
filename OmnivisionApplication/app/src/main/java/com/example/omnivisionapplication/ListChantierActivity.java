package com.example.omnivisionapplication;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.omnivisionapplication.placeholder.Chantier;
import com.example.omnivisionapplication.placeholder.ChantierAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class ListChantierActivity extends AppCompatActivity {

    MethodsOmniVision methodsOmniVision = RetrofitClientOmniVision.getRetrofitInstance().create(MethodsOmniVision.class);
    Call<ModelOmniVision> call = methodsOmniVision.getAllChantier();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_chantier);
        ArrayList<ModelOmniVision.Chantier> list = new ArrayList<>();
        call.enqueue(new Callback<ModelOmniVision>() {
            @Override
            public void onResponse(Call<ModelOmniVision> call, retrofit2.Response<ModelOmniVision> responseOmniVision) {
                Log.e(TAG, "onResponse: AVANT IS EXECUTED  = " + call.isExecuted() );
                Log.e(TAG, "onResponse: APRES getChantier IS EXECUTED  = " + call.isExecuted() );
                Log.e("On Response", "LISTE -------------------------> : "+ list.size());
                List<ModelOmniVision.Chantier> listChantier = responseOmniVision.body().getChantiers();
                if(listChantier == null){
                    Log.e(TAG, "onResponse: ERREUR la liste chantier est null" );
                }else{
                    Log.e(TAG, "onResponse: LA LISTE CHANTIER N'EST PAS null YOUHOU !!! sa taille est de " + listChantier.size() );
                    createListView(listChantier);
                }

            }

            @Override
            public void onFailure(Call<ModelOmniVision> call, Throwable t) {
                Log.e(TAG, "onFailure: ERREUR FAILURE" + t.getMessage()  );
            }


        });



    }

    private void createListView(List<ModelOmniVision.Chantier> listChantier) {
        final ListView listView = findViewById(R.id.listViewChantier);
        listView.setAdapter(new ChantierAdapter(this, listChantier));


        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                Intent intent2 = new Intent(ListChantierActivity.this, DetailChantierActivity.class);
                startActivity(intent2);
                ModelOmniVision.Chantier chantier = (ModelOmniVision.Chantier) o;
                Toast.makeText(ListChantierActivity.this, "Selected :" + " " + chantier, Toast.LENGTH_LONG).show();
            }

        });
    }

    private  ArrayList<ModelOmniVision.Chantier> getListData() {


        ArrayList<ModelOmniVision.Chantier> list = new ArrayList<>();
        call.enqueue(new Callback<ModelOmniVision>() {
            @Override
            public void onResponse(Call<ModelOmniVision> call, retrofit2.Response<ModelOmniVision> responseOmniVision) {
                Log.e(TAG, "onResponse: AVANT IS EXECUTED  = " + call.isExecuted() );
                list.addAll(responseOmniVision.body().getChantiers());
                Log.e(TAG, "onResponse: APRES getChantier IS EXECUTED  = " + call.isExecuted() );
                Log.e("On Response", "LISTE -------------------------> : "+ list.size());
            }

            @Override
            public void onFailure(Call<ModelOmniVision> call, Throwable t) {
            }


        });

        return list;
    }


    }
