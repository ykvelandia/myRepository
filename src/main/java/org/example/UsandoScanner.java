package org.example;

import java.util.Scanner;

public class UsandoScanner {
    public static void main(String[] args) {
        Scanner consola  = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre  = consola.nextLine();
        System.out.println("Digite un numero entero");
        int numeroEntero = consola.nextInt();
        System.out.println("Digite un numero decimal");
        double numeroDecimal = consola.nextDouble();

        System.out.printf("Tu nombre es :"+nombre + " has digitado el numero entero:" +numeroEntero
                + "y tambien has digitado un numero decimal: "+ numeroDecimal);
    }
}
