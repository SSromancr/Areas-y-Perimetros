package ssroman.area_y_perimetro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Rombo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rombo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void CalcularRombo (View v){
        double D, d, l, areaRombo, perimetroRombo;

        try {
            EditText D1 = (EditText)findViewById(R.id.d1_rombo);
            EditText d2 = (EditText)findViewById(R.id.d2_rombo);
            EditText lado = (EditText)findViewById(R.id.l_rombo);
            TextView resultarea = (TextView)findViewById(R.id.areaRombo);
            TextView resultperimetro = (TextView)findViewById(R.id.perimetroRombo);
            D = Double.parseDouble(D1.getText().toString());
            d = Double.parseDouble(d2.getText().toString());
            l = Double.parseDouble(lado.getText().toString());



            areaRombo = (D * d) / 2;
            perimetroRombo = 4 * l;

            DecimalFormat df = new DecimalFormat("0.00");

            resultarea.setText("Área: " + df.format(areaRombo));
            resultperimetro.setText("Perímetro: " + df.format(perimetroRombo));

            resultarea.setVisibility(View.VISIBLE);
            resultperimetro.setVisibility(View.VISIBLE);

        }catch (Exception e){
            Toast.makeText(this, "Asigna valor correcto a las incógnitas", Toast.LENGTH_LONG).show();
        }

    }

}
