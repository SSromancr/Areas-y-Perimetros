package ssroman.area_y_perimetro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class TrapecioCircular extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapecio_circular);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void CalcularTrapecioCircular (View v){
        double RmayorTC, RmenorTC, alfaTC, trapecioCircular;

        try {
            EditText RgTC = (EditText)findViewById(R.id.radiomayor_TC);
            EditText RpTC = (EditText)findViewById(R.id.radiomenor_TC);
            EditText anguloTC = (EditText)findViewById(R.id.angulo_TC);
            TextView resultarea = (TextView)findViewById(R.id.areaTrapecioCircular);

            RmayorTC = Double.parseDouble(RgTC.getText().toString());
            RmenorTC = Double.parseDouble(RpTC.getText().toString());
            alfaTC = Double.parseDouble(anguloTC.getText().toString());


            trapecioCircular = (Math.PI*(Math.pow(RmayorTC,2)-Math.pow(RmenorTC,2))*alfaTC) / 360;

            DecimalFormat df = new DecimalFormat("0.00");

            resultarea.setText("Área Trapecio Circular: " + df.format(trapecioCircular));



            resultarea.setVisibility(View.VISIBLE);


        }catch (Exception e){
            Toast.makeText(this, "Asigna valor correcto a las incógnitas", Toast.LENGTH_LONG).show();
        }

    }

}
