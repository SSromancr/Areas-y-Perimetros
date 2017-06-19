package ssroman.area_y_perimetro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Poligonos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poligonos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton triangulo=(ImageButton)findViewById(R.id.IB_triangulo);
        triangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Poligonos.this, Triangulo.class));
            }
        });

        ImageButton cuadrado=(ImageButton)findViewById(R.id.IB_cuadrado);
        cuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Poligonos.this, Cuadrado.class));
            }
        });

        ImageButton rectangulo=(ImageButton)findViewById(R.id.IB_rectangulo);
        rectangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Poligonos.this, Rectangulo.class));
            }
        });

        ImageButton rombo=(ImageButton)findViewById(R.id.IB_rombo);
        rombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Poligonos.this, Rombo.class));
            }
        });

        ImageButton trapecio=(ImageButton)findViewById(R.id.IB_trapecio);
        trapecio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Poligonos.this, Trapecio.class));
            }
        });

        ImageButton paralelogramo=(ImageButton)findViewById(R.id.IB_paralelogramo);
        paralelogramo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Poligonos.this, Paralelogramo.class));
            }
        });

        ImageButton poligonoreg=(ImageButton)findViewById(R.id.IB_poligonoreg);
        poligonoreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Poligonos.this, Poligonoregular.class));
            }
        });

    }

}
