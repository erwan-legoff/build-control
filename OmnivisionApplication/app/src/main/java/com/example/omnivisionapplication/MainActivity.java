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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickButton = (Button) findViewById(R.id.connectBouton);
        editLogin = (EditText) findViewById(R.id.editLoginConnect);
        editPassword = (EditText) findViewById(R.id.editPasswordConnect);
        textPrincipalLogin = (TextView) findViewById(R.id.textPrincipal);
        textPrincipalLogin.setText("Entrez vos identifiants :");

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editLogin.getText();
                editPassword.getText();
                Intent intent = new Intent(MainActivity.this, ListChantierActivity.class);
                startActivity(intent);
            }
        });
    }



}