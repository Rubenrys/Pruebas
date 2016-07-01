package es.co.rys.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private ListView miLista;
        @Override
        public void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            miLista = (ListView)findViewById(R.id.lista);
            //con esto se puede hacer que sea clickable multiple...
            miLista.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);

            //Hago un ArrayAdapter sencillo con letras
            String[] nombres=new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X", "Y", "Z", "ZZ", "ZZZ", "AB", "ABB"};
            ArrayAdapter<String> data=new ArrayAdapter<String>(this,R.layout.row1,R.id.titulo, nombres);
            //Le asigno ese adapter a la lista
            miLista.setAdapter(data);
        }



    }
