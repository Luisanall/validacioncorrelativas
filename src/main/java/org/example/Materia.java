package org.example;

import java.util.ArrayList;
import java.util.List;

public class Materia {


    private String nombre;
    private String codigo;
    private List<Materia> correlativas;


    public Materia(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.correlativas = new ArrayList<> ();
    }

    public void agregarCorrelativa(Materia materia) {
        this.correlativas.add(materia);
    }
    public boolean aprobar(Alumno alumno) {
        for (Materia correlativa : this.correlativas.toArray( new Materia[0] )) {
            if (!correlativa.aprobar (alumno)) {
                return false;
            }
        }
        return true;
    }




}



