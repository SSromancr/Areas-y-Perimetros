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

            DecimalFormat df = new DecimalFormat("0.00");

            resultarea.setText("Área: " + df.format(areaRectangulo));
            resultperimetro.setText("Perímetro: " + df.format(perimetroRectangulo));

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
                startActivity(new Intent(Rectangulo.this, EmailActivity.class));
                break;
            case R.id.masapps:
                startActivity(new Intent(Rectangulo.this, MasApps.class));
                break;
            case R.id.acerca:
                AlertDialog.Builder emergente = new AlertDialog.Builder(Rectangulo.this);
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
