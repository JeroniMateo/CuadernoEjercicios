package Ejericios.Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ej18 {
    public static void main(String[] args) {
        //Creamos los 2 vectores
        Integer[] v1={1,2,3};
        Integer[] v2={4,5,6};
        //Creamos el vector resultante donde los juntamos creando un nuevo array conjunto
        Integer[] result = Stream.of(v1, v2).flatMap(Stream::of).toArray(Integer[]::new);
        System.out.println(Arrays.toString(result));
    }
}

