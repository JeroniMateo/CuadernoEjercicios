package Ejericios.Arrays;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        int i;
        int[] numeros = new int[5];
        int[] invertido= new int[5];

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

        numeros = invertido;

        for( i=0;i<invertido.length;i++){
            invertido[i] = invertido[invertido.length-1-i];
        }
        if (numeros == invertido ){
            System.out.println("Es capicua");
        }else if (numeros != invertido){
            System.out.println("No es capicua");
        }


        System.out.println(union);
    }
}
