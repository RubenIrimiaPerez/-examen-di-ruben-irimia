package com.example.rubenirimia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }
    public void changeToMenu(View view){
        Intent nIntent = new Intent(Registro.this, MainActivity.class);
        startActivity(nIntent);
        Toast.makeText(Registro.this, "Bienvenido ", Toast.LENGTH_SHORT).show();


    }
}