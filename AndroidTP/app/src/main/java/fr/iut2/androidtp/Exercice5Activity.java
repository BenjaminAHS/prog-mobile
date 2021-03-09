package fr.iut2.androidtp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Exercice5Activity extends AppCompatActivity {
    private Button buttonV;
    public final static int TABLE_KEY=0;
    private int newval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // On charge le XML pour créer l'arbre graphique
        setContentView(R.layout.activity_exercice5);

        NumberPicker numberPicker = findViewById(R.id.numberpicker);
        if (numberPicker != null) {
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(9);
            numberPicker.setWrapSelectorWheel(true);
            numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
                @Override
                public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                    String text = "Changed from " + oldVal + " to " + newVal;
                    Toast.makeText(Exercice5Activity.this , text, Toast.LENGTH_SHORT).show();
                    newval = newVal;
                }
            });
        }
        buttonV = (Button) findViewById(R.id.buttonV);
        //Listener du bouton valider
        buttonV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TableMultiplicationActivity.class);
                int val = newval;
                intent.putExtra("tablenbr", val);
                startActivity(intent);
            }
        });

    }
}
