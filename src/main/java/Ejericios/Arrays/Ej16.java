package Ejericios.Arrays;

import java.util.Scanner;

public class Ej16 {

    public static void main(String[] args) {

        Integer i;
        Integer[] numeros = new Integer[5];

        Scanner teclado = new Scanner(System.in);


        for (i = 0; i < numeros.length; i++) {
            System.out.printf("Introduzca número %d: ", i + 1);
            numeros[i] = teclado.nextInt();
        }

        for (i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);


    }
        int mayor, menor;
        mayor = menor = numeros [0];

        for (int j = 0; i < numeros.length; j++) {
            if(numeros [i] > mayor) {
                mayor = numeros[i];
            }
            if(numeros[i]<menor) {
                menor = numeros[i];
            }
        }
        System.out.println("El mayor valor es: "+mayor);
        System.out.println("El menor valor es: "+menor);
    }
}

