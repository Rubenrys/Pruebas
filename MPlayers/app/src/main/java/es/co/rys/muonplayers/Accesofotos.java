package es.co.rys.muonplayers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Accesofotos extends AppCompatActivity {

    private Spinner juegosspinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        juegosspinner = (Spinner)findViewById(R.id.spinner);

        final String[] datos =
                new String[]{"Juegos de Mesa","Juegos de Miniaturas","Favoritos"};

        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, datos);



    }
}
