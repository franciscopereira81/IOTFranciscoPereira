package com.example.hp640.iotfranciscopereira;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegistrarActivity extends AppCompatActivity {

    @BindView(R.id.Nombres)
    EditText txtNombres;

    @BindView(R.id.Apellidos)
    EditText txtApellidos;

    @BindView(R.id.Direccion)
    EditText txtDireccion;

    @BindView(R.id.Email)
    EditText txtEmail;

    @BindView(R.id.bntEnviar)
    Button bntEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.bntEnviar)
    public void clickEnviar() {
        String Nombres = txtNombres.getText().toString();
        String Apellidos = txtApellidos.getText().toString();
        String Direccion = txtDireccion.getText().toString();
        String Email = txtEmail.getText().toString();


        Intent intent = new Intent(RegistrarActivity.this, User_Activity.class);

        intent.putExtra("Nombre",Nombres);
        intent.putExtra("Apellidos",Apellidos);
        intent.putExtra("Direccion",Direccion);
        intent.putExtra("Email",Email);

        startActivity(intent);

    }
}
