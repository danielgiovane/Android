package com.example.organize.activity.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.organize.R;
<<<<<<< HEAD
=======
import com.example.organize.activity.PrincipalActivity;
>>>>>>> 0c7a05f7186915226be1fdd06c4cf5c820507514
import com.example.organize.activity.config.ConfigureFirebase;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    private FirebaseAuth autenticacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        verificarUsuarioLogado();
        autenticacao.signOut();
    }

<<<<<<< HEAD
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

=======
>>>>>>> 0c7a05f7186915226be1fdd06c4cf5c820507514
    public void btEntrar(View view){

        startActivity(new Intent(this, LoginActivity.class));
    }

    public void btCadastrar(View view){
        startActivity(new Intent(this, CadastroActivity.class));

    }

    public void verificarUsuarioLogado(){

        autenticacao = ConfigureFirebase.getFirebaseAutenticacao();

        if (autenticacao.getCurrentUser() != null){
            abrirTelaPrincipal();
        }
    }

    public void abrirTelaPrincipal(){
        startActivity(new Intent(this, PrincipalActivity.class));
    }
}
