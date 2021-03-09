package fr.iut2.androidtp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static fr.iut2.androidtp.Exercice4Activity.HELLO_REQUEST;

public class HelloActivity extends AppCompatActivity {
    public static final String PRENOM_KEY = "prenom_key";
    private Button autreprenom, menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        String prenom = getIntent().getStringExtra(PRENOM_KEY);
        TextView textViewPrenom = (TextView) findViewById(R.id.textViewPrenom);
        textViewPrenom.setText("Hello " + prenom + " !");


        //Changer de prénom
        autreprenom = (Button) findViewById(R.id.buttonchanger);

        autreprenom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Exercice4Activity.class);
                startActivityForResult(intent, HELLO_REQUEST);
            }
        });
        //Revenir au menu principal
        menu = (Button) findViewById(R.id.buttonmenu);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

                setResult(RESULT_OK);
                finish();
            }
        });

    }
}