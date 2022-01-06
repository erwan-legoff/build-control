package com.example.omnivisionapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button clickButton;
    EditText editLogin;
    EditText editPassword;
    TextView textPrincipalLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //1) méthode par défaut qui va initialiser l'activité et l'assigner au layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2) On assigne les variables aux bons éléments de la vue
        clickButton = (Button) findViewById(R.id.connectBouton);
        //3) Ce sont les champs où on écrit les identifiants
        editLogin = (EditText) findViewById(R.id.editLoginConnect);
        editPassword = (EditText) findViewById(R.id.editPasswordConnect);
        textPrincipalLogin = (TextView) findViewById(R.id.textPrincipal);
        textPrincipalLogin.setText(R.string.msg_enter_id);
        //4) c'est un listener qui va permettre de passer à la prochaine page lorsqu'on clique sur se connecter
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(MainActivity.this, ListChantierActivity.class);
                    startActivity(intent);

            }
        });
    }



}