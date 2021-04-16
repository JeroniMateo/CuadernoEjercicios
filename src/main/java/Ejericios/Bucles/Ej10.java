package Ejericios.Bucles;

import java.util.Scanner;

public class Ej10 {

    public static void main(String[] argumentos) {
        System.out.println("Intruduce los grados fahrenheit");
        Scanner scanner = new Scanner(System.in);
        Float fahrenheit = scanner.nextFloat();
        // Calcular
        float celsius = (5f / 9f) * (fahrenheit - 32f);
        System.out.println(celsius);
    }
}