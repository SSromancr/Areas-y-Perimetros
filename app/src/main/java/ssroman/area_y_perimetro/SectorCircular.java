package ssroman.area_y_perimetro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class SectorCircular extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sector_circular);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void CalcularSectorCircular (View v){
        double radio, alfa, sectorCircular, longitudArco;

        try {
            EditText r = (EditText)findViewById(R.id.radio_SC_LA);
            EditText a = (EditText)findViewById(R.id.angulo_SC_LA);
            TextView resultarea = (TextView)findViewById(R.id.TV_sectorCircular);
            TextView resultperimetro = (TextView)findViewById(R.id.TV_longitudArco);
            radio = Double.parseDouble(r.getText().toString());
            alfa = Double.parseDouble(a.getText().toString());

            sectorCircular = (Math.PI * Math.pow(radio,2) * alfa)/360;
            longitudArco = (2 * Math.PI * radio * alfa)/360;

            DecimalFormat df = new DecimalFormat("0.00");

            resultarea.setText("Sector Circular: " + df.format(sectorCircular));
            resultperimetro.setText("Longitud Arco: " + df.format(longitudArco));

            resultarea.setVisibility(View.VISIBLE);
            resultperimetro.setVisibility(View.VISIBLE);

        }catch (Exception e){
            Toast.makeText(this, "Asigna valor correcto a las incógnitas", Toast.LENGTH_LONG).show();
        }

    }

}
