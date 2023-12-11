package com.example.rubenirimia;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Acceso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso);
    }
    public void changeToMain(View view){
        Intent nIntent = new Intent(Acceso.this, MainActivity.class);
        startActivity(nIntent);
        Toast.makeText(Acceso.this, "Bienvenido ", Toast.LENGTH_SHORT).show();


    }
    public void changeToRegistro(View view){
        Intent nIntent = new Intent(Acceso.this, Registro.class);
        startActivity(nIntent);
        Toast.makeText(Acceso.this, "a crearte cuenta ", Toast.LENGTH_SHORT).show();


    }
    public void AlertDialog(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        EditText nuevaContraeña = new EditText(this);
        nuevaContraeña.setInputType(InputType.TYPE_CLASS_TEXT);
        nuevaContraeña.setHint("nuevo e-mail@example.com");

        builder.setView(nuevaContraeña);
        builder.setTitle("Ingrese el e-mail para poder reestablecer contraseña");

        builder.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Acceso.this, "Enviado", Toast.LENGTH_SHORT).show();
            }
        });
        builder.create().show();
    }
}