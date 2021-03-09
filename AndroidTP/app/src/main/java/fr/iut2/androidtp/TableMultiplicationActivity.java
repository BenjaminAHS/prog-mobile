package fr.iut2.androidtp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TableMultiplicationActivity extends AppCompatActivity {
    public static final int TABLE_KEY = 0;
    private Button buttonV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_multiplication);

        int tableval = getIntent().getIntExtra("tablenbr", 0);

        TextView tablede = (TextView) findViewById(R.id.tablevalue);
        tablede.setText("Table de " + tableval);
        TextView x1 = (TextView) findViewById(R.id.x1);
        x1.setText("1 x " + tableval + " =");
        TextView x2 = (TextView) findViewById(R.id.x2);
        x2.setText("2 x " + tableval + " =");
        TextView x3 = (TextView) findViewById(R.id.x3);
        x3.setText("3 x " + tableval + " =");
        TextView x4 = (TextView) findViewById(R.id.x4);
        x4.setText("4 x " + tableval + " =");
        TextView x5 = (TextView) findViewById(R.id.x5);
        x5.setText("5 x " + tableval + " =");
        TextView x6 = (TextView) findViewById(R.id.x6);
        x6.setText("6 x " + tableval + " =");
        TextView x7 = (TextView) findViewById(R.id.x7);
        x7.setText("7 x " + tableval + " =");
        TextView x8 = (TextView) findViewById(R.id.x8);
        x8.setText("8 x " + tableval + " =");
        TextView x9 = (TextView) findViewById(R.id.x9);
        x9.setText("9 x " + tableval + " =");
        TextView x10 = (TextView) findViewById(R.id.x10);
        x10.setText("10 x " + tableval + " =");

        buttonV = (Button) findViewById(R.id.buttonV);
        //Listener du bouton valider
        buttonV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TableMultiplicationActivity.class);

                //recuperation des nbr
                EditText y1 = (EditText) findViewById(R.id.y1);
                String str1 = y1.getText().toString();
                int v1 = Integer.parseInt(str1);
                intent.putExtra("tablenbr", str1);

                EditText y2 = (EditText) findViewById(R.id.y2);
                String str2 = y2.getText().toString();
                int v2 = Integer.parseInt(str2);
                intent.putExtra("tablenbr", str1);

                EditText y3 = (EditText) findViewById(R.id.y3);
                String str3 = y2.getText().toString();
                int v3 = Integer.parseInt(str3);
                intent.putExtra("tablenbr", str1);

                int nberreur=0;
                //Vérification des trois premiers résultats
                if ((1*tableval) != v1) {
                    nberreur = nberreur +1;
                }


                startActivity(intent);
            }
        });

    }
}