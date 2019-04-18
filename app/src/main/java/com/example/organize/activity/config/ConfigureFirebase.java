package com.example.organize.activity.config;

import com.google.firebase.auth.FirebaseAuth;

public class ConfigureFirebase {

    private static FirebaseAuth autenticacao;

    public static FirebaseAuth getFirebaseAutenticacao(){

        if (autenticacao == null){
            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;
    }

}
