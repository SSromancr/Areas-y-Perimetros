package ssroman.area_y_perimetro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Triangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void CalcularTriangulo (View v){
        double l1, l2, l3, altura, areaTriangulo, perimetroTriangulo;

        try {
            EditText a = (EditText)findViewById(R.id.a_triangulo);
        EditText b = (EditText)findViewById(R.id.b_triangulo);
        EditText c = (EditText)findViewById(R.id.c_triangulo);
        EditText h = (EditText)findViewById(R.id.h_triangulo);
        TextView resultarea = (TextView)findViewById(R.id.areaTriangulo);
        TextView resultperimetro = (TextView)findViewById(R.id.perimetroTriangulo);
        l1 = Double.parseDouble(a.getText().toString());
        l2 = Double.parseDouble(b.getText().toString());
        l3 = Double.parseDouble(c.getText().toString());
        altura = Double.parseDouble(h.getText().toString());


            areaTriangulo = (l2 * altura) / 2;
            perimetroTriangulo = l1 + l2 + l3;

            resultarea.setText("Área: " + areaTriangulo);
            resultperimetro.setText("Perímetro: " + perimetroTriangulo);

            resultarea.setVisibility(View.VISIBLE);
            resultperimetro.setVisibility(View.VISIBLE);

        }catch (Exception e){
            Toast.makeText(this, "Asigna valor correcto a las incógnitas", Toast.LENGTH_LONG).show();
        }

    }

}
