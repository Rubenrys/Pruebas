package es.co.rys.mplayers;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;

/**
 * Created by HP1 on 27/06/2016.
 */
public class Eventos implements View.OnClickListener {

    Context context;
    AccesoFotos mAccesoFotos;


    public Eventos(Context context){this.context = context;}


    @Override
    public void onClick(View vista){
    int id_vista = vista.getId();

        switch(id_vista) {
            case R.id.imageView3:

                mAccesoFotos = (AccesoFotos) this.context;
                mAccesoFotos.ImagenJ1();
            break;


            case R.id.imageView5:
                mAccesoFotos = (AccesoFotos) this.context;
                mAccesoFotos.ImagenJ2();
             break;

        }

    }



}

