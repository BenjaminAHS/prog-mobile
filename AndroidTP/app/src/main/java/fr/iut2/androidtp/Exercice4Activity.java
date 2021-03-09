package fr.iut2.androidtp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.Console;
import java.text.BreakIterator;

public class Exercice4Activity extends AppCompatActivity {
    private Button buttonV;
    private EditText prenomedit;
    public final static int HELLO_REQUEST=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // On charge le XML pour créer l'arbre graphique
        setContentView(R.layout.activity_exercice4);
        //On recupere le bouton valider
        buttonV = (Button) findViewById(R.id.buttonV);
        //Listener du bouton valider
        buttonV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HelloActivity.class);
                prenomedit = (EditText) findViewById(R.id.prenomedit);
                String prenom = prenomedit.getText().toString();
                intent.putExtra(HelloActivity.PRENOM_KEY, prenom);
                startActivityForResult(intent, HELLO_REQUEST);
            }
        });



    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == HELLO_REQUEST) {
            //vérifier l'état de retour
            if (resultCode == RESULT_OK) {
                //notif
                Toast toast = Toast.makeText(this, "Retour OK", Toast.LENGTH_LONG);
                toast.show();

            } else if (resultCode == RESULT_CANCELED) {

                Toast toast = Toast.makeText(this, "Retour Cancel/Back", Toast.LENGTH_LONG);
                toast.show();
            }

        }
    }

}
