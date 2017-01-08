package com.example.marcos.horario;

import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Calendar;
import java.util.HashMap;

import bd.AsignaturaColumnas;
import bd.HorarioDbHelper;

public class MainActivity extends Activity {


    private TextView txtResultado;

    private HashMap<String, String> miMapa;




    Calendar c = Calendar.getInstance();
    int dia = c.get(Calendar.DAY_OF_WEEK);
    String hora = "'"+c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+"'";

    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenemos las referencias a los controles

        txtResultado = (TextView)findViewById(R.id.txtResultado);

        miMapa = new HashMap<>();
        CrearMapa();


        //Abrimos la base de datos 'DBUsuarios' en modo escritura
        HorarioDbHelper usdbh =
                new HorarioDbHelper(this);

        db = usdbh.getWritableDatabase();

        //Alternativa 1: m�todo rawQuery()
        Cursor c = db.rawQuery("SELECT * FROM "+ AsignaturaColumnas.AsignaturaColumna.TABLE_NAME
                + " WHERE "+dia +" LIKE diaSemana AND "+hora+" BETWEEN hora_Inicio AND hora_Final", null);


        //Recorremos los resultados para mostrarlos en pantalla
        txtResultado.setText("");
        if (c.moveToFirst()) {
            //Recorremos el cursor hasta que no haya m�s registros
            do {
                String cod = c.getString(0);
                String nom = c.getString(1);
                String codigo = c.getString(2);

                txtResultado.append(" " + cod + " - " + nom + miMapa.get(codigo) + "\n");
            } while(c.moveToNext());
        }


            //Cerramos la base de datos


    }
    public void CrearMapa() {
        miMapa.put("7", "M7- Desenvolupament d'interficies (A201) José Antonio Leo");
        miMapa.put("11", "Tutoria  (A201) Josefa González");
        miMapa.put("3", "M3- Programació básica (A201)/(A208) Josefa Gónzalez");
        miMapa.put("10", "M10- Sistemes de gestió empresarial (A201) Marta Planas");
        miMapa.put("9", "M9- Programació de serveis i procesos A201)/(A208) Jorge Rubio");
        miMapa.put("8", "M8- Programació multimèdia i dispositius mòbils A201)/(A208) Lluis Perpinyà");
        miMapa.put("5", "M5- Entorns de desenvolupament / Bases de dades / Accés a dades A201)/(A208) Jorge Rubio");

    }
}

