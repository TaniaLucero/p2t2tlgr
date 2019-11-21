package mx.edu.tesoem.isc.tlgr.p2t2tlgr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MostrarCol extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner objSpinner;
    ArrayAdapter<String> listColors0;
    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_col);

        objSpinner = findViewById(R.id.spcolores);
        listColors0 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, global.showColors());
        objSpinner.setAdapter(listColors0);
        objSpinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int pos, long id){
        if(!flag){
            flag = true;
            return;
        }
        Toast.makeText(this, "Ha seleccionado " + parent.getItemAtPosition(pos).toString(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0){}

    public void menu(View view){
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);
        finish();
    }

}
