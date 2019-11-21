package mx.edu.tesoem.isc.tlgr.p2t2tlgr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void agregarColor(View view){
        Intent add = new Intent(this, AgregarCol.class);
        startActivity(add);
        finish();
    }

    public void mostrarColor(View view){
        Intent show = new Intent(this, MostrarCol.class);
        startActivity(show);
        finish();
    }
}
