package Ejericios.Arrays;

import java.util.Scanner;

public class Ej17 {
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
        String unionString = "";
        int union = 0;

        for(int j = 0; i < numeros.length; j++) {
            unionString += numeros[j];
        }

        union = Integer.parseInt(unionString);
        System.out.println(union);
    }
}
