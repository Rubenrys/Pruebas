package es.co.rys.mplayers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import es.co.rys.mplayers.dao.BaseDatos;


public class RegisterActivity extends Activity {


    EditText first, last, email, mobile, pass, confpass;
    Button save, cancel;
    BaseDatos db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        first= (EditText)findViewById(R.id.editfirstname);
        last =(EditText)findViewById(R.id.editlastname);
        email=(EditText)findViewById(R.id.editemail);
        mobile =(EditText)findViewById(R.id.editmobileno);
        pass=(EditText)findViewById(R.id.editpassword);
        confpass=(EditText)findViewById(R.id.editconformpassword);

        save=(Button)findViewById(R.id.btnsave);
        cancel=(Button)findViewById(R.id.btncancel);

        //boton Salvar datos
        save.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {


                String edfirst = first.getText().toString();
                String edlast = last.getText().toString();
                String edemail = email.getText().toString();
                String edmobile = mobile.getText().toString();
                String edpass = pass.getText().toString();
                String edConf = confpass.getText().toString();

                if(edConf.equals(edpass) ){


                    db = new BaseDatos(RegisterActivity.this, null, null, 2);
                    RegisterData reg = new RegisterData();

                    reg.setfirstName(edfirst);
                    reg.setlastName(edlast);
                    reg.setEmailId(edemail);
                    reg.setMobNo(edmobile);
                    reg.setPassword(edpass);
                    db.addregister(reg);

                    Toast.makeText(getApplicationContext(), "Registrado nuevo usuario", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                }
                else{

                    Toast.makeText(getApplicationContext(), "El password no concuerda", Toast.LENGTH_LONG).show();
                    pass.setText("");
                    confpass.setText("");
                }


            }

        });
        //Boton cancelar
        Button MyOnBackButton = (Button) findViewById(R.id.btncancel);
        MyOnBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }
}
