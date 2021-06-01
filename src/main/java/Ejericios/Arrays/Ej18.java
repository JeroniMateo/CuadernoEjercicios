package Ejericios.Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ej18 {
    public static void main(String[] args) {
        //Creamos los 2 vectores

//pedimos a usuario que nos diga la longitud que va a crear ambos vectores
        System.out.println("Longitud 1er vector");
        Scanner longitudv1= new Scanner(System.in);
        Integer v1Sc = longitudv1.nextInt();

        System.out.println("Longitud 2o vector");
        Scanner longitudv2= new Scanner(System.in);
        Integer v2Sc = longitudv2.nextInt();

        Integer[] v1 = new Integer[v1Sc];
        Integer[] v2 = new Integer[v2Sc];
        Integer i;

        Scanner tecladov1 = new Scanner(System.in);

        for ( i = 0; i < v1.length; i++) {
            System.out.printf("Introduzca número ");
            v1[i] = tecladov1.nextInt();
        }
        Scanner tecladov2 = new Scanner(System.in);

        for ( i = 0; i < v2.length; i++) {
            System.out.printf("Introduzca número ");
            v2[i] = tecladov2.nextInt();
        }


        //Creamos el vector resultante donde los juntamos creando un nuevo array conjunto
        Integer[] result = Stream.of(v1, v2).flatMap(Stream::of).toArray(Integer[]::new);
        System.out.println(Arrays.toString(result));
    }
}

