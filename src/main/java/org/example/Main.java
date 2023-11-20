package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!, I am  creating my repository");
        System.out.println("Ya he iniciado mi repositorio local");

        Main.saludoEstudiante("Karina");
    }
    private static void saludoEstudiante (String nombre){
        System.out.println( "Hola soy el estudiante: " + nombre);

    }

    private static double   potencia(double base,double exponente){
        double potencia = 1;
        for (int i  = 0;i <exponente; i++){
            potencia *= base;
        }
        return potencia;

    }

}