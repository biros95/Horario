package bd;

import android.provider.BaseColumns;

/**
 * Created by Marcos on 06/01/2017.
 */

public class AsignaturaColumnas {
    public static abstract class AsignaturaColumna implements BaseColumns {
        public static final String TABLE_NAME ="horario";
        public static final String ID ="id";
        public static final String horaInicio ="hora_Inicio";
        public static final String horaFinal ="hora_Final";
        public static final String diaSemana ="diaSemana";
        public static final String codigoAsignatura ="codigoAsignatura";
        public static final String grupo ="grupo";


    }
}
