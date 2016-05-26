package helpers;

import modelos.Estudiante;
import modelos.Fecha;
import modelos.NumeroRacional;
import modelos.TelefonoMovil;

import java.util.Date;

/**
 * Created by kefala on 25/05/16.
 */
public class Estudiantes {

    public static void mostrarEstudiante(){
        Fecha fechaDeParcial = new Fecha(new Date());
        NumeroRacional notaDeParcial = new NumeroRacional(5);
        TelefonoMovil telefono = new TelefonoMovil(11, 68884747);

        Estudiante alumno = new Estudiante(fechaDeParcial, notaDeParcial, telefono, "Martín Lobo");

        alumno.mostrarse();
    }
}
