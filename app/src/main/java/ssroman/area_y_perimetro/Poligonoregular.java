package ssroman.area_y_perimetro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Poligonoregular extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poligonoregular);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void CalcularPoligono (View v){
        double n_lados, apotema, lado, areaPoligono, perimetroPoligono;

        try {
            EditText nl = (EditText)findViewById(R.id.nl_poligono);
            EditText l = (EditText)findViewById(R.id.l_poligono);
            EditText a = (EditText)findViewById(R.id.a_poligono);
            TextView resultarea = (TextView)findViewById(R.id.areaPoligono);
            TextView resultperimetro = (TextView)findViewById(R.id.perimetroPoligono);
            n_lados = Double.parseDouble(nl.getText().toString());
            lado = Double.parseDouble(l.getText().toString());
            apotema = Double.parseDouble(a.getText().toString());


            perimetroPoligono = n_lados * lado;
            areaPoligono = (perimetroPoligono * apotema) / 2;

            resultarea.setText("Área: " + areaPoligono);
            resultperimetro.setText("Perímetro: " + perimetroPoligono);

            resultarea.setVisibility(View.VISIBLE);
            resultperimetro.setVisibility(View.VISIBLE);

        }catch (Exception e){
            Toast.makeText(this, "Asigna valor correcto a las incógnitas", Toast.LENGTH_LONG).show();
        }

    }

}
