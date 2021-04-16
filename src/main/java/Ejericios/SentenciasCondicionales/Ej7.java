package Ejericios.SentenciasCondicionales;

import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {

        System.out.println("Escribe un numero");
        Scanner scanner = new Scanner(System.in);
        Integer num1 = scanner.nextInt();

        System.out.println("Escribe un numero");
        Scanner scanner1 = new Scanner(System.in);
        Integer num2 = scanner1.nextInt();

        System.out.println(" S= Suma " +
                " R = Resta " +
                " M= Multiplicacion " +
                " D = Division ");
        Scanner sc = new Scanner(System.in);
        String Operacion = sc.nextLine();

        if (Operacion =="S") {
            System.out.println(num1 + num2);
        }
        if (Operacion == "R") {
            System.out.println(num1 - num2);
        }
        if (Operacion == "M") {
            System.out.println(num1 * num2);
        }if (Operacion == "D"){
            System.out.println(num1/num2);
        }

    }
}