package Ejericios.SentenciasCondicionales;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {

        //Hacemos que el usuario nos diga su peso y altura
        System.out.println("Escrbie tu peso");
        Scanner scanner = new Scanner(System.in);
        Double peso = scanner.nextDouble();

        System.out.println("Escribe tu altura");
        Scanner scanner1 = new Scanner(System.in);
        Double altura = scanner1.nextDouble();

        //Calculamos su masa corporal
        Double IMC = peso /Math.pow(altura,2);


        //Dependiendo de su masa corporal nos da como resultado un estado u otro
        if (IMC <16){
            System.out.println("Criterio de ingreso en hospital");
        }if(IMC >16 && IMC < 17){
            System.out.println("Infrapeso");
        }if (IMC >17 && IMC < 18){
            System.out.println("Bajo peso");
        }if (IMC >18 && IMC < 25){
            System.out.println("Peso Normal");
        }if (IMC >25 && IMC < 30){
            System.out.println("Sobrepeso");
        }if (IMC >30 && IMC < 35){
            System.out.println("Sobrepeso cronico");
        }if (IMC >35 && IMC < 40){
            System.out.println("Obesidad premorbida");
        }else if (IMC >40){
            System.out.println("Obsidad morbida");
        }

    }
}
