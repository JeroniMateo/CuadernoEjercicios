package Ejericios.Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ej19 {
    public static void main(String[] args) {
        //Creamos los 2 vectores

        //pedimos a usuario que nos diga la longitud que va a crear ambos vectores
        System.out.println("Longitud 1er vector");
        Scanner longitudv1= new Scanner(System.in);
        Integer v1Sc = longitudv1.nextInt();

        System.out.println("Longitud 2o vector");
        Scanner longitudv2= new Scanner(System.in);
        Integer v2Sc = longitudv2.nextInt();

    //Creamos los vectores y las variables apra poder recorrerlos
        Integer[] v1 = new Integer[v1Sc];
        Integer[] v2 = new Integer[v2Sc];
        Integer i;
        Integer j;
        Integer k;
        Integer[] v3 = new Integer[v2Sc + v1Sc];

        Scanner tecladov1 = new Scanner(System.in);

        //Recorremos ambos vectores para ir introduciendo los valores que mete el usuario por teclado
        for ( i = 0; i < v1.length; i++) {
            System.out.printf("Introduzca número ");
            v1[i] = tecladov1.nextInt();
        }
        Scanner tecladov2 = new Scanner(System.in);

        for ( i = 0; i < v2.length; i++) {
            System.out.printf("Introduzca número ");
            v2[i] = tecladov2.nextInt();
        }

        //Comprovamos si son iguales entonces introducimos el valor en el 3er vector
        for (j = 0; j< v1.length ; j++) {
            for ( k = 0; k <v2.length ; k++) {
                if (v1[i]==v2[i]){
                    for (int l = 0; l <v3.length ; l++) {
                      //  v3[l]==v2[i];
                    }

                }
                else if (v1[i]==v2[i]){
                    break;
                }
            }
        }
    //imprimimos el 3er vector

        System.out.println(v3);
    }
}

