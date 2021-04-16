package Ejericios.Funciones;

import java.util.Scanner;

public class Ej22 {
    public static void primos(int num){
        System.out.println ("Introduzca un Numero: ");
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();


        System.out.println();

        int contador=0;
        for (int i = 1 ; i <= n ; i++)
        {
            if (n % i == 0)
            {
                System.out.println (i);
                contador++;
            }
        }
        System.out.println("Hay un total de "+contador+" numeros divisisores");

}
}



