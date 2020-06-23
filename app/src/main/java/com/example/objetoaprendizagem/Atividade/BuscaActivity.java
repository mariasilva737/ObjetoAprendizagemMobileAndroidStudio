package com.example.objetoaprendizagem.Atividade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.example.objetoaprendizagem.R;

public class BuscaActivity extends AppCompatActivity {

    Button buttonPesquisar;
    Spinner spinnerDisciplinas, spinnerMateria, spinnerTipoDoObjeto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca);
        buttonPesquisar = (Button) findViewById(R.id.buttonPesquisar);
        spinnerDisciplinas = (Spinner) findViewById(R.id.spinnerDisciplinas);
        spinnerMateria = (Spinner) findViewById(R.id.spinnerMateria);
        spinnerTipoDoObjeto = (Spinner) findViewById(R.id.spinnerTipoDoObjeto);


        buttonPesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(BuscaActivity.this, ListagemActivity.class);
                startActivity(it);
            }
        });
    }
}