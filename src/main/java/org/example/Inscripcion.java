package org.example;
public class Inscripcion {
    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    private Materia materia;

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    private Alumno alumno;
        private boolean aprobada;

        public Inscripcion(Materia materia, Alumno alumno) {
            this.materia = materia;
            this.alumno = alumno;
            this.aprobada = false;
        }

        public void aprobar() {
            this.aprobada = true;
        }
    }