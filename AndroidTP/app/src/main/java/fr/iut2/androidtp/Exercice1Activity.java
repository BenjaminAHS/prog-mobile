package fr.iut2.androidtp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Exercice1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // On charge le XML pour créer l'arbre graphique
        setContentView(R.layout.activity_exercice1);
    }
}
