package com.example.hp640.iotfranciscopereira;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class User_Activity extends AppCompatActivity {


    @BindView(R.id.NombresR)
    TextView txtNombres;

    @BindView(R.id.ApellidosR)
    TextView txtApellidos;

    @BindView(R.id.DireccionR)
    TextView txtDireccion;

    @BindView(R.id.EmailR)
    TextView txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_);

        ButterKnife.bind(this);

        String Nombres =getIntent().getStringExtra("Nombre");
        String Apellidos =getIntent().getStringExtra("Apellidos");
        String Direccion =getIntent().getStringExtra("Direccion");
        String Email =getIntent().getStringExtra("Email");


        txtNombres.setText("Nombres :"+ "" +Nombres);
        txtApellidos.setText("Apellidos :"+""+ Apellidos);
        txtDireccion.setText("Dirección :" + ""+ Direccion);
        txtEmail.setText("Email :" +""+ Email);


    }

}
