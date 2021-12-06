package com.fisei.p001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Segunda_Actividd extends AppCompatActivity {

    private EditText et_nombre;
    private EditText et_base;
    private Button btn_siguienteD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividd);

        et_nombre = findViewById(R.id.editText_INombre);
        et_base = findViewById(R.id.editText_IBase);

        btn_siguienteD = findViewById(R.id.button_SiguienteD);


    }

    public void Siguiente(View view){
        String nombre = et_nombre.getText().toString();
        String base = et_base.getText().toString();

        if (!nombre.matches("") && !base.matches(""))
        {
            Intent intent = new Intent(this, Tercera_Actividad.class);
            intent.putExtra("key_nombre", nombre);
            intent.putExtra("key_base", base);
            startActivity(intent);
        } else {
            Toast.makeText(this, "El nombre y la base son obligatorios",Toast.LENGTH_LONG).show();
        }
    }

    public void Cerrar(View view)
    {
        finish();
    }
}