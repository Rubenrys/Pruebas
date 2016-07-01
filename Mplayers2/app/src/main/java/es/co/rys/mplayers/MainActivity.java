package es.co.rys.mplayers;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import es.co.rys.mplayers.dao.BaseDatos;


public class MainActivity extends Activity {

    EditText user, pass;
    Button login, not_reg;
    BaseDatos db;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.Username);
        pass = (EditText) findViewById(R.id.Password);
        login = (Button) findViewById(R.id.Login);
        not_reg = (Button) findViewById(R.id.Registrar);

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            //revisar datos de usuario y password
            public void onClick(View arg0) {

                db = new BaseDatos(MainActivity.this, null, null, 2);
                String username = user.getText().toString();
                String password = pass.getText().toString();

                String StoredPassword = db.getregister(username);
                if (password.equals(StoredPassword)) {

                    Toast.makeText(getApplicationContext(), StoredPassword + "Acceso Correcto", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getApplicationContext(), AccesoFotos.class));

                } else {
                    Toast.makeText(getApplicationContext(), "Usuario y password incorrectos", Toast.LENGTH_LONG).show();
                    user.setText("");
                    pass.setText("");
                }


            }
        });
        //boton de registrar usuario
        not_reg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
            }
        });


    }




}





