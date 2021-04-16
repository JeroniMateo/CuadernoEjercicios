package Ejericios.Arrays;

public class Ej19 {
    public static void main(String[] args) {

        //Creamos los 2 vectores
        int[] v1 = {5, 8, 9};
        int[] v2 = {7, 9, 2};

        //2 vectores solo se suman si tienen la misma longitud sino no sda un error
        if (v1.length != v2.length)
            throw new IllegalStateException("Error: Los arreglos son de diferente tamaño.");

        //Creamos el 3er array
        int v3[] = new int[v1.length];

        //Realizamos la suma de ambos arrays
        int total = 0;
        for (int x = 0; x < v3.length; x++) {
            v3[x] = v1[x] + v2[x];
            total += v3[x];
            System.out.print("[" + v3[x] + "]");
        }

    }
}
