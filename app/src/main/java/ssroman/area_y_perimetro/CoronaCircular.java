package ssroman.area_y_perimetro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class CoronaCircular extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corona_circular);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void CalcularCoronaCircular (View v){
        double radiomayor, radiomenor, coronaCircular;

        try {
            EditText Rg = (EditText)findViewById(R.id.radiomayorCC);
            EditText Rp = (EditText)findViewById(R.id.radiomenorCC);
            TextView resultarea = (TextView)findViewById(R.id.TV_coronaCircular);

            radiomayor = Double.parseDouble(Rg.getText().toString());
            radiomenor = Double.parseDouble(Rp.getText().toString());

            coronaCircular = Math.PI * (Math.pow(radiomayor,2)-Math.pow(radiomenor,2));

            DecimalFormat df = new DecimalFormat("0.00");

            resultarea.setText("Corona Circular: " + df.format(coronaCircular));

            resultarea.setVisibility(View.VISIBLE);


        }catch (Exception e){
            Toast.makeText(this, "Asigna valor correcto a las incógnitas", Toast.LENGTH_LONG).show();
        }

    }

}
