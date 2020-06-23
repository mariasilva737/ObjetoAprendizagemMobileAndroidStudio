package com.example.objetoaprendizagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText userna;
    private EditText pass;
    private Button entrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userna = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        entrar = (Button) findViewById(R.id.login);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = userna.getText().toString();
                String password = pass.getText().toString();

                if(!username.equals("") && !password.equals("")){
                    if (username.equals("admin") && password.equals("123")){
                        Toast.makeText(MainActivity.this, "Login efetuado com sucesso", Toast.LENGTH_LONG).show();
                    }else {
                        Toast.makeText(MainActivity.this, "Preencha todos os campos", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}