package es.co.rys.mplayers.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import es.co.rys.mplayers.RegisterData;

/**
 * Created by HP1 on 24/06/2016.
 */
public class BaseDatos extends SQLiteOpenHelper {
    //creacion de la base de datos//////(de esta manera porque de la otra no me la coge//buscado en internet)///////
    public BaseDatos(Context context, Object name, Object factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    String password;
    // Version base de datos
    private static final int DATABASE_VERSION = 1;
    // Nombre de la BBDD
    private static final String DATABASE_NAME = "Mydatabase.db";

    // Tabla de contactos
    private static final String TABLE_REGISTER = "register";
    public static final String KEY_ID = "id";
    public static final String KEY_FIRST_NAME = "first_name";
    public static final String KEY_lAST_NAME = "last_name";
    public static final String KEY_EMAIL_ID = "email_id";
    public static final String KEY_MOB_NO = "mobile_number";
    public static final String KEY_PASSWORD = "password";
    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_REGISTER + "("
            + KEY_ID + " INTEGER PRIMARY KEY," + KEY_FIRST_NAME + " TEXT," + KEY_lAST_NAME + " TEXT," + KEY_EMAIL_ID + " TEXT,"
            + KEY_MOB_NO + " TEXT," + KEY_PASSWORD + " TEXT " + ")";
    //crear base de datos
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE);
    }

    //actualizar en caso de que se necesite
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_REGISTER);

        onCreate(db);
    }

    public void addregister(RegisterData registerdata)
    // Para añadir un nuevo registro
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_FIRST_NAME, registerdata.getfirstName()); // register first Name
        values.put(KEY_lAST_NAME, registerdata.getlastName()); // register last name
        values.put(KEY_EMAIL_ID, registerdata.getEmailId());//register email id
        values.put(KEY_MOB_NO, registerdata.getMobNo());//register mobile no
        values.put(KEY_PASSWORD, registerdata.getPassword());
        // Inserting Row

        db.insert(TABLE_REGISTER, null, values);
        db.close(); // Closing database connection

    }


    //Registrar usuario y busqueda en la base de datos//menudo lio me monte con esto...
    public String getregister(String username) {
        SQLiteDatabase db = this.getReadableDatabase();
        String selectquery="SELECT * FROM TABLE_REGISTER";
        Cursor cursor = db.query(TABLE_REGISTER, null, "FIRST_NAME=?", new String[]{username}, null, null, null, null);

        if (cursor.getCount() < 1) {
            cursor.close();
            return "No hay ese valor";
        } else if (cursor.getCount() >= 1 && cursor.moveToFirst()) {

            password = cursor.getString(cursor.getColumnIndex(KEY_PASSWORD));
            cursor.close();

        }
        return password;


    }


    public String getDatabaseName() {
        return DATABASE_NAME;
    }



}