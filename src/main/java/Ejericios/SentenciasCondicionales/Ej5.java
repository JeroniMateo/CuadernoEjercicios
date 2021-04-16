package Ejericios.SentenciasCondicionales;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {

        //El usuario escribe 2 numeros
        System.out.println("Escribe un numero");
        Scanner scanner = new Scanner(System.in);
        Integer num1 = scanner.nextInt();

        System.out.println("Escribe un numero");
        Scanner scanner1 = new Scanner(System.in);
        Integer num2 = scanner1.nextInt();

        /*
        * Dependiendo si la 1a o la segunda variable es mayor imprime una variable u otra
        * */
        if (num1 > num2) {
            System.out.println(num1 + "Es mayor");
        }
        if (num2>num1){
            System.out.println(num2 + "Es mayor");
        }else if (num1 == num2){
            System.out.println(num1 + " y " + num2 + "Son iguales");
        }
    }
}
