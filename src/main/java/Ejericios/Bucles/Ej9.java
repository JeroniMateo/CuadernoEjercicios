package Ejericios.Bucles;

import java.util.Scanner;

public class Ej9 {

    public static void main(String[] args) {
        System.out.println("Escribe un numero");
        Scanner scanner = new Scanner(System.in);
        Integer num1 = scanner.nextInt();

                int resultado = 1;
                for (int i = 1; i <= num1; i++) {
                    resultado *= i;
                }
                System.out.println("El factorial de " + num1+ " es " + resultado);

        }
}

