package ssroman.area_y_perimetro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class AreaCirculo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_circulo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void CalcularCirculo (View v){
        double radio, areaCirculo, longitudCircunferencia;

        try {
            EditText r = (EditText)findViewById(R.id.r_circulo);
            TextView resultarea = (TextView)findViewById(R.id.areaCirulo);
            TextView resultperimetro = (TextView)findViewById(R.id.longitudCircunferencia);
            radio = Double.parseDouble(r.getText().toString());



            areaCirculo = Math.pow(radio,2) * Math.PI;
            longitudCircunferencia = 2 * Math.PI * radio;

            DecimalFormat df = new DecimalFormat("0.00");

            resultarea.setText("Área: " + df.format(areaCirculo));
            resultperimetro.setText("Longitud Circunferencia: " + df.format(longitudCircunferencia));

            resultarea.setVisibility(View.VISIBLE);
            resultperimetro.setVisibility(View.VISIBLE);

        }catch (Exception e){
            Toast.makeText(this, "Asigna valor correcto a las incógnitas", Toast.LENGTH_LONG).show();
        }

    }

}
