package com.isaias.appgreencoffe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


    public class ActivityEsqueceuSenha extends AppCompatActivity {

        EditText edt_EmailRecuperacao;
        Button btn_Enviar;
        TextView txt_VoltarLogin;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_esqueceu_senha);

            edt_EmailRecuperacao        = findViewById(R.id.edt_EmailRecuperacao);
            btn_Enviar                  = findViewById(R.id.btn_Enviar);
            txt_VoltarLogin             = findViewById(R.id.txt_VoltarLogin);

            // BOTAO ENVIAR
            btn_Enviar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String email = edt_EmailRecuperacao.getText().toString();

                    if(email.isEmpty()) {

                        Toast.makeText(ActivityEsqueceuSenha.this,
                                "Digite seu e-mail",
                                Toast.LENGTH_SHORT).show();

                    } else {

                        Toast.makeText(ActivityEsqueceuSenha.this,
                                "Link enviado para o e-mail!",
                                Toast.LENGTH_LONG).show();
                    }
                }
            });

            // VOLTAR LOGIN
            txt_VoltarLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(
                            ActivityEsqueceuSenha.this,
                            ActivityLogin.class);
                            startActivity(intent);
                    finish();
                }
            });
        }
    }