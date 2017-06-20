package ssroman.area_y_perimetro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Rectangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void CalcularRectangulo (View v){
        double base, altura, areaRectangulo, perimetroRectangulo;

        try {
            EditText b = (EditText)findViewById(R.id.b_rectangulo);
            EditText h = (EditText)findViewById(R.id.h_rectangulo);
            TextView resultarea = (TextView)findViewById(R.id.areaRectangulo);
            TextView resultperimetro = (TextView)findViewById(R.id.perimetroRectangulo);
            base = Double.parseDouble(b.getText().toString());
            altura = Double.parseDouble(h.getText().toString());



            areaRectangulo = base * altura;
            perimetroRectangulo = 2 * (base + altura);

            resultarea.setText("Área: " + areaRectangulo);
            resultperimetro.setText("Perímetro: " + perimetroRectangulo);

            resultarea.setVisibility(View.VISIBLE);
            resultperimetro.setVisibility(View.VISIBLE);

        }catch (Exception e){
            Toast.makeText(this, "Asigna valor correcto a las incógnitas", Toast.LENGTH_LONG).show();
        }

    }

}
