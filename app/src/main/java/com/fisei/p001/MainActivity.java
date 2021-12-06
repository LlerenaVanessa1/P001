package com.fisei.p001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private Button btn_mostrarActividad;
    private Button btn_Siguiente;
    private EditText eT_nombre;
    private EditText eT_apellido;
    private EditText eT_base;
    private EditText eT_exponente;
    private EditText eT_factorial;
    private EditText eT_potencia;
    private EditText eTNumerop;
    private int retornarCodigo=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button_mostrarActividad);
        btn.setEnabled(false);

        eT_nombre = findViewById(R.id.editText_Nombre);
        eT_apellido= findViewById(R.id.editText_Apellido);
        eT_base = findViewById(R.id.editText_Base);
        eTNumerop= findViewById(R.id.editText_INumero);
        eT_exponente = findViewById(R.id.editText_Exponente);
        eT_factorial = findViewById(R.id.editTextFactorial);
      //  eT_potencia = findViewById(R.id.editText_Potencia);

        btn_mostrarActividad= findViewById(R.id.button_mostrarActividad);
        btn_Siguiente  = findViewById(R.id.button_Siguiente);



        btn_mostrarActividad.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    btn_mostrarActividad.setEnabled(true);
                    Bundle datosExtra = getIntent().getExtras();
                    String nombre = datosExtra.getString("key_nombre");
                    String apellido = datosExtra.getString("key_apellido");
                    String base = datosExtra.getString("key_base");
                    String exponente = datosExtra.getString("key_exponente");
                    String numero = datosExtra.getString("key_numero");

                    int f1= Integer.parseInt(numero);
                    long res = Operacion.factorial(f1);

                    eT_factorial.setText(String.valueOf(res) );

                    eT_nombre.setText(nombre);
                    eT_apellido.setText(apellido);
                    eT_base.setText(base);
                    eT_exponente.setText(exponente);



                }

            });



    }

    public void Siguiente(View view){
        Intent intent = new Intent(this, Segunda_Actividd.class);
        this.startActivity(intent);
    }




}