package Ejericios.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej16 {

    public static void main(String[] args) {

        Integer mayor = 0;
        Integer menor = 0;
        Integer i;
        Integer[] numeros = new Integer[5];
        Integer[] orden = new Integer[5];
        Scanner teclado = new Scanner(System.in);


        for (i = 0; i < numeros.length; i++) {
            System.out.printf("Introduzca número ");
            numeros[i] = teclado.nextInt();
        }
        System.out.println(Arrays.toString(numeros));

        for (int j = 0; j < numeros.length; j++) {
            for (int k = numeros.length; k > 0; k--) {
                if (numeros[j] < numeros[k]) {
                    if (orden[j] == null) {
                        orden[j] = numeros[k];
                    } else {
                        orden[j + 1] = numeros[k];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(orden));
/*
        for (int j = 0; j < numeros.length; j++) {
            if(numeros [j] < mayor){
                mayor = numeros[i];
            }
            if(numeros[i]<menor) {
                menor = numeros[i];
            }
        }*/

        System.out.println("El mayor valor es: " + mayor);
        System.out.println("El menor valor es: " + menor);
    }
}

