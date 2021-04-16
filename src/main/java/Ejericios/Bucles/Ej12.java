package Ejericios.Bucles;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {


            Integer n1 = 0;
            Integer n2 = 1;
            Integer aux;
            Integer limite = 51;

            System.out.println(n1);
            System.out.println(n2);

            while (n2 + n1 <= limite) {
                aux = n1;
                n1 = n2;
                n2 = aux + n1;

                System.out.println(n2);
            }
        }
    }