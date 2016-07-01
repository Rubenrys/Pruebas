package es.co.rys.muonplayers.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import es.co.rys.apprysprueba1.dto.Usuarios;


public class BasedeDatos extends SQLiteOpenHelper {
    private final String sqlCreacionTablaPersona = "CREATE TABLE USUARIOS (id INTEGER PRIMARY KEY, user TEXT, password TEXT)";

    public BasedeDatos(Context contexto, String nombre, SQLiteDatabase.CursorFactory factory, int version) {
        super(contexto, nombre, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(sqlCreacionTablaPersona);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }

    public void insertarPersona (Usuarios usuario)
    {
        SQLiteDatabase database = this.getWritableDatabase();
        database.execSQL("INSERT INTO USUARIOS (id, user, password ) VALUES ('"+usuario.getId()+"' , '"+usuario.getUsuario()+"', '"+usuario.getPassword()+"')");
        this.cerrarBaseDatos(database);
        this.cerrarBaseDatos(database);

    }

    private void cerrarBaseDatos (SQLiteDatabase database)
    {
        database.close();
    }


}
