package bd;

/**
 * Created by Marcos on 06/01/2017.
 */

public class Asignatura {
    private Integer id;
    private String grupo;
    private String codigoAsignatura;
    private String horaInicio;
    private String horaFinal;
    private Integer diaSemana;


    public Asignatura(Integer id, String horaInicio, String horaFinal, String grupo, Integer diaSemana, String codigoAsignatura) {
        this.id = id;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.grupo = grupo;
        this.diaSemana = diaSemana;
        this.codigoAsignatura = codigoAsignatura;
    }

    public Integer getDiaSemana() {
        return diaSemana;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public Integer getId() {
        return id;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }

}
