package com.example.julio.rutasutecv3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import Clogin.AlmacenarDatos;

public class Registro extends AppCompatActivity {

    private EditText txtnombre,txtapellido,txttelefono,txtdireccion,txtpass,txtusuario;
    private Button btnGuardar,btnCancelar;

    AlmacenarDatos almacenarDatos = new AlmacenarDatos();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        txtnombre =(EditText)findViewById(R.id.txtNombre);
        txtapellido =(EditText)findViewById(R.id.txtApellido);
        txttelefono =(EditText)findViewById(R.id.txtTelefono);
        txtdireccion =(EditText)findViewById(R.id.txtDireccion);
        txtpass =(EditText)findViewById(R.id.txtpass);
        txtusuario =(EditText)findViewById(R.id.txtusuaio);

        btnGuardar= (Button)findViewById(R.id.btnGuardar);
        btnCancelar= (Button)findViewById(R.id.btnCancelar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
