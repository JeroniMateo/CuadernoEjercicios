package Ejericios.Funciones;

public class Ej21 {

        public static void esPrimo(int numero)
        {
            Boolean esPrimoActual = true;
            if(numero<2)
            {
                esPrimoActual = false;
            }
            else
            {
                for(int x=2; x*x<=numero; x++)
                {
                    if( numero%x==0 ){esPrimoActual = false;break;}
                }
            }
            System.out.println(esPrimoActual);
        }
    }

