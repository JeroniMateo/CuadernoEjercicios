package Ejericios.VariablesOperadores;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {


        //Hacemos que el usuario nos diga su peso y altura
        System.out.println("Escribe tu peso");
        Scanner scanner = new Scanner(System.in);
        Double peso = scanner.nextDouble();

        System.out.println("Escribe tu altura");
        Scanner scanner1 = new Scanner(System.in);
        Double altura = scanner1.nextDouble();

        //Calculamos su masa corporal
        Double IMS= peso/Math.pow(altura,2);

        System.out.println("Su masa Corporal es " + IMS);
    }
}
