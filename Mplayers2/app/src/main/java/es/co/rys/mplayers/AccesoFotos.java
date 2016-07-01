package es.co.rys.mplayers;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Spinner;


public class AccesoFotos extends Activity {

    //Array de imagenes 1
    private Integer[] juegosmesa = {
            R.drawable.imperiaassault,
            R.drawable.dungeonf,
            R.drawable.munpanic,
            R.drawable.potionexplotion,
            R.drawable.steampark,
            R.drawable.superdungeon
    };

    //Array de imagenes 2
    private Integer[] juegosminiaturas = {
            R.drawable.marsat,
            R.drawable.arcadiaquest,
            R.drawable.xwing,
            R.drawable.anima,
            R.drawable.armada_product,
            R.drawable.bloodr,
            R.drawable.teothers
    };

    int a = 0;
    int b = a + 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        View.OnClickListener EarTime = new Eventos(this);
        ImageView image3 = (ImageView) findViewById(R.id.imageView3);
        image3.setOnClickListener(EarTime);
        ImageView image5 = (ImageView) findViewById(R.id.imageView5);
        image5.setOnClickListener(EarTime);

        Spinner game = (Spinner) findViewById(R.id.spinner);
        // Asigno el listener al Spinner
        game.setOnItemSelectedListener(new SpinnerListener());


    }

    public void ImagenJ1() {
        ImageView imagenJM = (ImageView) findViewById(R.id.imageView3);
        ImageView imageout = (ImageView) findViewById(R.id.imageView5);
        imageout.setImageResource(0);
        imagenJM.setVisibility(View.VISIBLE);
        if (a < juegosmesa.length-1){
            a++;
        }else{
            a=0;
        }
        imagenJM.setImageResource(juegosmesa[a]);



    }


    public void ImagenJ2() {
        ImageView imagenJS = (ImageView) findViewById(R.id.imageView5);
        ImageView imageout = (ImageView) findViewById(R.id.imageView3);
        imageout.setImageResource(0);
        imagenJS.setVisibility(View.VISIBLE);
        if (a < juegosminiaturas.length-1){
            a++;
        }else{
            a=0;
        }
        imagenJS.setImageResource(juegosminiaturas[a]);



    }

    public void ImagenClean() {
        ImageView imagenJS = (ImageView) findViewById(R.id.imageView5);
        ImageView imageout = (ImageView) findViewById(R.id.imageView3);
        imageout.setImageResource(0);
        imagenJS.setImageResource(0);



    }





    //seleccion de los valores del spinner
    public class SpinnerListener implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

            switch (pos) {

                case 0:
                    ImagenClean();
                    break;
                case 1:
                    ImagenJ1();
                    break;
                case 2:

                    ImagenJ2();
                    break;
                case 3:
                    ImagenClean();
            }

        }

        public void onNothingSelected(AdapterView<?> parent) {

        }


    }
}













