package Ejericios.Bucles;

import java.util.Scanner;
//Por revisar
public class Ej15 {
    public static void main(String[] args) {
        int adivina=0;
        int num ;
        int vidas=5;

        System.out.println("Escribe un numero");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        while (num != adivina && vidas !=0){

            adivina = (int) (100*Math.random()+1);


            System.out.println("Escribe un numero");
             scanner = new Scanner(System.in);
             num = scanner.nextInt();
             vidas -= 1;

        }
        if (vidas ==0){
            System.out.println("Has perdido, el numero era" + adivina );
        }else if (num ==adivina){
            System.out.println("Ganaste");
        }


    }
}

