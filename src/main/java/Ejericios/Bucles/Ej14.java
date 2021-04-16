package Ejericios.Bucles;

import java.util.Scanner;


//Por revisar


public class Ej14 {
    public static void main(String[] args) {
        System.out.println("Escribe un numero positivo");
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        if (n>0){

        int resultado = 1;

        int i = 1;
        while ( i <= n ) {
            resultado *= i;
            i++;
        }

            for (int x = 1; x <= n; i++) {
                resultado *= x;
            }

        System.out.println(resultado);
    }else {
            System.out.println("Error");
        }
    }
}
