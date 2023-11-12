package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println ( "Hello world!" );
       // se declara las materias
        Materia materia1 = new Materia("Algoritmos y Estructuras de Datos", "1001");
        Materia materia2 = new Materia("Paradigmas de Programación", "1002");
        Materia materia3 = new Materia("Diseño de Sistemas", "1003");
        //se asigna el nombre del alunmo tambien podemos usar el metodo Scanner para introducirlo por consola
        //faltaria agregar la calificacion para saber si fue aprobada o no
        Scanner scan =new Scanner ( System.in );

        String alumno2 = scan.next ();

        Alumno alumno = new Alumno("Juan", "Pérez");

        materia1.agregarCorrelativa(materia2);
        materia2.agregarCorrelativa(materia3);

        alumno.inscribirEn(materia1);

        materia1.aprobar(alumno);



        System.out.println(materia1.aprobar ( alumno )+ "" + alumno2);


    }
    }
