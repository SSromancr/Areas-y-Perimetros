package ssroman.area_y_perimetro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Cuadrado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void CalcularCuadrado (View v){
        double l1, areaCuadrado, perimetroCuadrado;

        try {
            EditText l = (EditText)findViewById(R.id.l_cuadrado);
            TextView resultarea = (TextView)findViewById(R.id.areaCuadrado);
            TextView resultperimetro = (TextView)findViewById(R.id.perimetroCuadrado);
            l1 = Double.parseDouble(l.getText().toString());



            areaCuadrado = l1 * l1;
            perimetroCuadrado = l1 * 4;

            DecimalFormat df = new DecimalFormat("0.00");

            resultarea.setText("Área: " + df.format(areaCuadrado));
            resultperimetro.setText("Perímetro: " + df.format(perimetroCuadrado));

            resultarea.setVisibility(View.VISIBLE);
            resultperimetro.setVisibility(View.VISIBLE);

        }catch (Exception e){
            Toast.makeText(this, "Asigna valor correcto a las incógnitas", Toast.LENGTH_LONG).show();
        }

    }

}
