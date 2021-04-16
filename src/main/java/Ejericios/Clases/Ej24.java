package Ejericios.Clases;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej24 {
    public static void main(String[] args) {

        //Creamos el patron del DNI COn la letra que sera introducido por teclado
        String dniIntroducido = null;
        Scanner scanner = new Scanner(System.in);
        Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
        System.out.print("Introduce un DNI correcto: ");
        dniIntroducido = scanner.nextLine();
        Matcher mat = patron.matcher(dniIntroducido);


        //Acto seguido pedimos al usuario que lo introduzca pero en esta caso sin la letra
        System.out.println("Escribe tu dni sin letra");
        Scanner scanner1 = new Scanner(System.in);
        String dniNum = scanner1.nextLine();


        //Comprobamos si el DNI es correcto y en caso que lo sea sera validado
        while(!mat.matches()){
            System.out.println("El DNI introducido es incorrecto, por favor introduzca un DNI válido.");
            System.out.print("Introduce un DNI correcto: ");
            dniIntroducido = scanner.nextLine();
            mat = patron.matcher(dniIntroducido);
            System.out.println("Escribe tu dni sin letra");
            dniNum = scanner1.nextLine();
        }

        //Imprimimos su validación y devolvemos el DNI numérico
        System.out.println("El DNI " + dniIntroducido + " es válido.");
        System.out.println(dniNum);
    }
}





