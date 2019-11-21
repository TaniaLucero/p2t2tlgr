package mx.edu.tesoem.isc.tlgr.p2t2tlgr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AgregarCol extends AppCompatActivity {

    EditText color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_col);

        color = (EditText) findViewById(R.id.color);
    }

    public void agregarColor(View v){
        if(color.getText().toString().length() < 1) {
            Toast.makeText(this, "Ingrese un color valido.", Toast.LENGTH_SHORT).show();
        }else{
            global.addColor(color.getText().toString().toUpperCase());
            Toast.makeText(this, "Color " + color.getText().toString().toUpperCase() + " agregado.", Toast.LENGTH_SHORT).show();
            color.setText("");
        }
    }

    public void menu(View view){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
        finish();
    }

    public void mostrarColor(View v){
        Intent show = new Intent(this, MostrarCol.class);
        startActivity(show);
        finish();
    }
}
