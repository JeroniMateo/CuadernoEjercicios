package Ejericios.VariablesOperadores;

public class Ej3 {

    public static void main(String[] args) {

        //Creamos las variables de la esfera
        Double radio =3.5;
        Double pi= Math.PI;

        //Calculamos el volumen y la superficie de la esfera
        Double Volumen= (4/3)*pi*Math.pow(radio,3);
        Double Superficie=4*pi*Math.pow(radio,2);

      //Finalmente lo imprimimos por pantalla
        System.out.println("El volumen de la esfera es " + Volumen);
        System.out.println("La superficie de la esfera es " + Superficie);
    }
}
