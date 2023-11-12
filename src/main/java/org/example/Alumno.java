package org.example;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String Nombre;
    private String apellido;
    private List<Inscripcion> inscripciones;

    public Alumno(String nombre, String apellido) {
        this.Nombre = nombre;
        this.apellido = apellido;
        this.inscripciones = new ArrayList<> ();
    }


    public void inscribirEn(Materia materia) {
        Inscripcion inscripcion = new Inscripcion(materia, this);
        this.inscripciones.add(inscripcion);
    }

}
