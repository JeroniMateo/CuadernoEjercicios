package Ejericios.SentenciasCondicionales;

import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {
    //Pedimos el 1er Valor
        System.out.println("Escribe un numero");
        Scanner scanner = new Scanner(System.in);
        Integer num1 = scanner.nextInt();

        //Pedimos el 2o valor
        System.out.println("Escribe un numero");
        Scanner scanner1 = new Scanner(System.in);
        Integer num2 = scanner1.nextInt();

        //Creamos un menu de opciones
        System.out.println(" 1= Suma " +
                " 2 = Resta " +
                " 3= Multiplicacion " +
                " 4 = Division ");
        Scanner sc = new Scanner(System.in);
        Integer operacion = sc.nextInt();

        //Finalmente ejecutamos la operacion que ha elegido el usuario mediante un switch dependiendo de su elección
        switch (operacion){
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Error");
                break;

        }

    }
}