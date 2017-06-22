package ssroman.area_y_perimetro;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Trapecio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapecio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void CalcularTrapecio (View v){
        double lado, b_pequena, B_grande, altura, areaTrapecio, perimetroTrapecio;

        try {
            EditText l = (EditText)findViewById(R.id.a_trapecio);
            EditText b1 = (EditText)findViewById(R.id.bp_trapecio);
            EditText B2 = (EditText)findViewById(R.id.bg_trapecio);
            EditText h = (EditText)findViewById(R.id.h_trapecio);
            TextView resultarea = (TextView)findViewById(R.id.areaTrapecio);
            TextView resultperimetro = (TextView)findViewById(R.id.perimetroTrapecio);
            lado = Double.parseDouble(l.getText().toString());
            b_pequena = Double.parseDouble(b1.getText().toString());
            B_grande = Double.parseDouble(B2.getText().toString());
            altura = Double.parseDouble(h.getText().toString());


            areaTrapecio = (b_pequena + B_grande) * altura / 2;
            perimetroTrapecio = 2*lado + b_pequena + B_grande;

            DecimalFormat df = new DecimalFormat("0.00");

            resultarea.setText("Área: " + df.format(areaTrapecio));
            resultperimetro.setText("Perímetro: " + df.format(perimetroTrapecio));

            resultarea.setVisibility(View.VISIBLE);
            resultperimetro.setVisibility(View.VISIBLE);

        }catch (Exception e){
            Toast.makeText(this, "Asigna valor correcto a las incógnitas", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.compartir:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "http://play.google.com/store/apps/details?id=app.ejemplo.ssroman.appleatorios");
                startActivity(Intent.createChooser(intent, "Compartir con:"));
                break;
            case R.id.valorar:
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=app.ejemplo.ssroman.appleatorios")));
                } catch (android.content.ActivityNotFoundException anfe) {}
                break;
            case R.id.contacto:
                startActivity(new Intent(Trapecio.this, EmailActivity.class));
                break;
            case R.id.masapps:
                startActivity(new Intent(Trapecio.this, MasApps.class));
                break;
            case R.id.acerca:
                AlertDialog.Builder emergente = new AlertDialog.Builder(Trapecio.this);
                View vista = getLayoutInflater().inflate(R.layout.activity_acerca_popup, null);
                emergente.setView(vista);
                AlertDialog dialogo = emergente.create();
                dialogo.show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

}
