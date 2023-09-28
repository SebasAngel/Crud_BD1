package co.edu.crud_bd;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class GestionBD extends SQLiteOpenHelper {
    private static final String DATABASEUSERS="dbusuarios";
    private static final int VERSION =1;
    private static final String TABLE_USERS="usuarios";
    private static final String CREATE_TABLE_USERS = " CREATE TABLE "+TABLE_USERS+" (USU_DOCUMENTO INTEGER" +
            " PRIMARY KEY, USU_USUARIO varchar(50) NOT NULL, USU_NOMBRES varchar(150) NOT NULL, "+
        " USU_APELLIDOS varchar(150) NOT NULL, USU_CONTRA varchar(25) NOT NULL)";


    private static final String DELATE_TABLE = " DROP TABLE IF" +TABLE_USERS;

    public GestionBD(@Nullable Context context ) {
        super(context, DATABASEUSERS, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_USERS);
        Log.i("BASE DE DATOS","SE CREO LA BASE DE DATOS");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DELATE_TABLE);
        onCreate(db);

    }
}
