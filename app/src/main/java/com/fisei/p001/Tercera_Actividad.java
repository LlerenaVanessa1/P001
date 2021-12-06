package com.fisei.p001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Tercera_Actividad extends AppCompatActivity {


    private TextView tv_mnombre;
    private EditText eT_mbase;
    private EditText eT_Apellido;
    private EditText eT_exponente;
    private EditText eTNumero;
    private Button btn_cerrar;
    private int codigoRequerido =1;
    Button btn_mostar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera_actividad);

        tv_mnombre = findViewById(R.id.textView_MNombre);
        eT_mbase = findViewById(R.id.editText_MBase);
        eT_Apellido= findViewById(R.id.editText_IApellido);
        eT_exponente = findViewById(R.id.editText_IExponente);
        eTNumero = findViewById(R.id.editText_INumero);
        btn_cerrar = findViewById(R.id.button_CerrarT);
        Bundle datosExtras = getIntent().getExtras();
        String nombre = datosExtras.getString("key_nombre");
        String base= datosExtras.getString("key_base");
        tv_mnombre.setText(nombre.toUpperCase(Locale.ROOT));
        eT_mbase.setText(base);
        btn_mostar = findViewById(R.id.button_mostrarActividad);



    }

    public void Cerrar (View view){


        String apellido = eT_Apellido.getText().toString();
        String exponente = eT_exponente.getText().toString();
        String numero = eTNumero.getText().toString();
        String nombre = tv_mnombre.getText().toString();
        String base= eT_mbase.getText().toString();

        if (!apellido.matches("") && !exponente.matches("")&& !numero.matches("")){
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("key_apellido", apellido);
            intent.putExtra("key_exponente", exponente);
            intent.putExtra("key_numero", numero);
            intent.putExtra("key_nombre",nombre);
            intent.putExtra("key_base",base);

            startActivity(intent);
            Button btn = (Button) findViewById(R.id.button_mostrarActividad);
            btn.setEnabled(true);

        }else{
            Toast.makeText(this, "El apellido, exponente y número deben son obligatorios", Toast.LENGTH_LONG).show();
        }


        finish();

    }


}