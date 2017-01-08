package bd;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Marcos on 07/01/2017.
 */

public class HorarioDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Horario.db";

    private int Grupo = 1;
    private int Asignatura = 1;
    private int DiaSemana = 1;
    private String HoraInicio = "'19:00'";
    private String HoraFinal = "'20:00'";


    public HorarioDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME + " ("
                + AsignaturaColumnas.AsignaturaColumna._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + AsignaturaColumnas.AsignaturaColumna.diaSemana + " INTEGER,"
                + AsignaturaColumnas.AsignaturaColumna.codigoAsignatura + " INTEGER,"
                + AsignaturaColumnas.AsignaturaColumna.grupo + " INTEGER,"
                + AsignaturaColumnas.AsignaturaColumna.horaInicio + " TEXT NOT NULL,"
                + AsignaturaColumnas.AsignaturaColumna.horaFinal + " TEXT NOT NULL)");
            //Lunes
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (1,1,7,0,'15:00','18:00')");
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (2,1,11,0,'18:20','19:20')");
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (3,1,3,2,'19:20','21:20')");
            //Martes
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (4,2,3,1,'15:00','17:00')");
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (5,2,8,1,'15:00','17:00')");
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (6,2,10,0,'17:00','19:20')");
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (7,2,5,0,'19:20','21:20')");
            //Miercoles
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (8,3,5,0,'16:00','17:00')");
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (9,3,9,1,'17:00','19:20')");
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (10,3,8,2,'17:00','19:20')");
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (11,3,9,2,'19:20','20:20')");
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (12,3,3,1,'19:20','21:20')");

            //Jueves
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (13,4,9,1,'15:00','16:00')");
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (14,4,8,1,'16:00','18:00')");
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (15,4,3,2,'16:00','18:00')");
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (16,4,5,0,'18:20','21:20')");

            //Viernes
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (17,5,10,0,'15:00','17:00')");
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (18,5,8,1,'17:00','19:20')");
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (19,5,9,2,'17:00','19:20')");
            db.execSQL("INSERT INTO " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME +
                    " VALUES (20,5,5,0,'19:20','21:20')");




    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Usuarios");

        //Se crea la nueva versi�n de la tabla
        db.execSQL("CREATE TABLE " + AsignaturaColumnas.AsignaturaColumna.TABLE_NAME + " ("
                + AsignaturaColumnas.AsignaturaColumna._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + AsignaturaColumnas.AsignaturaColumna.diaSemana + " INTEGER,"
                + AsignaturaColumnas.AsignaturaColumna.codigoAsignatura + " INTEGER,"
                + AsignaturaColumnas.AsignaturaColumna.grupo + " INTEGER,"
                + AsignaturaColumnas.AsignaturaColumna.horaInicio + " TEXT NOT NULL,"
                + AsignaturaColumnas.AsignaturaColumna.horaFinal + " TEXT NOT NULL,"
                + ")");
    }
}
