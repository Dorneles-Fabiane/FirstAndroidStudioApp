package com.example.firstandroidstudioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*final EditText editTextTexto = findViewById(R.id.et_texto);
        Button btnMostrar = findViewById(R.id.btn_mostrar);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, editTextTexto.getText(), Toast.LENGTH_LONG).show();
            }
        }); */
    }

    public void onClickMostrarNome(View v) {
        EditText editNome = findViewById(R.id.et_nome);
        EditText editSobrenome = findViewById(R.id.et_sobrenome);

        Editable nome = editNome.getText();
        Editable sobrenome = editSobrenome.getText();

        Toast.makeText(MainActivity.this, nome.toString().concat(" ").concat(sobrenome.toString()), Toast.LENGTH_LONG).show();
    }


    public void onClickApagar(View v) {
        EditText editNome = findViewById(R.id.et_nome);
        EditText editSobrenome = findViewById(R.id.et_sobrenome);

        editNome.setText("");
        editSobrenome.setText("");

       Toast.makeText(MainActivity.this, editNome.getText(), Toast.LENGTH_LONG).show();

       editNome.requestFocus();
    }
}