package Ejericios.Bucles;

import java.util.Scanner;

//Por Revisar

public class Ej13 {
    public static void main(String[] args) {
       System.out.println("Escribe un numero positivo");
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        System.out.println("Escribe un numero positivo");
        Scanner scanner1 = new Scanner(System.in);
        Integer m = scanner1.nextInt();



        int resultado = 1;

        for (int i = 1; i < m; i++) {
           
            resultado= n*n;


        }
        System.out.println(resultado);

    }
}
