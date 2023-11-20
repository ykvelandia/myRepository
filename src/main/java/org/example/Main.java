package org.example;

public class Main {
    public static void main(String[] args) {
        double number1 = 2;
        double  number2 = 2;
        System.out.println("Hello world!, I am  creating my repository");
        System.out.println("Ya he iniciado mi repositorio local");
        System.out.println("La potencia es: " +potencia(number1,number2));

        Main.saludoEstudiante("Karina");
    }
    private static void saludoEstudiante (String nombre){
        System.out.println( "Hola soy el estudiante: " + nombre);

    }

    private static double   potencia(double base,double exponente){
        return Math.pow(base, exponente);
    }

}