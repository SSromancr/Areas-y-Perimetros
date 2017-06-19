package ssroman.area_y_perimetro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Circunferencias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circunferencias);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton areacirculo=(ImageButton)findViewById(R.id.IB_areacirculo);
        areacirculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Circunferencias.this, AreaCirculo.class));
            }
        });

        ImageButton sectorcircular=(ImageButton)findViewById(R.id.IB_sectorcircular);
        sectorcircular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Circunferencias.this, SectorCircular.class));
            }
        });

        ImageButton coronacircular=(ImageButton)findViewById(R.id.IB_coronacircular);
        coronacircular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Circunferencias.this, CoronaCircular.class));
            }
        });

        ImageButton trapeciocircular=(ImageButton)findViewById(R.id.IB_trapeciocircular);
        trapeciocircular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Circunferencias.this, TrapecioCircular.class));
            }
        });

    }

}
