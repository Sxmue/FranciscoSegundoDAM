package prueba.Inicial;

import java.util.Scanner;

public class NumerosPrimos {

    //Contador usado para contar divisores
    private int contador = 0;

    //Contador para saber cuantos numeros primos llevamos
    private int contadorPrim = 0;

    //Variable que almacena el principio del intervalo
    private int start;

    //Variable que almacena el final del intervalo
    private int fin;


    //Metodo que se encarga de comprobar los divisores de cada numero del intervalo
    public void division(int x) {
        //Variable auxiliar para las comprobaciones
        int auxiliar = 0;
        for (auxiliar = fin; auxiliar >= 1; auxiliar--) {
            if (x % auxiliar == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println(x);
            contadorPrim++;
        }
        contador = 0;
    }


    //Metodo que recorre el intervalo y finaliza el programa en caso de querer terminar
    public void recorrido() {
            System.out.println("Buscando primos...");
            for (int x = start; x <= fin; x++) {
                division(x);
            }

            System.out.println("Se han encontrado " + contadorPrim + " numeros primos en el intervalo");


    }


    //Metodo que se encarga de pedir el intervalo al usuario
    public void start() {
        try (Scanner sc = new Scanner(System.in)) {
            start = 1;
            while( start > 0) {
                    System.out.println("Escriba el numero inicial (Pulsa 0 para salir):");
                    start = sc.nextInt();

                if(start==0) {
                    System.out.println("Fin del programa");
                }else {

                    System.out.println("Escriba el numero final:");
                    fin = sc.nextInt();
                    recorrido();
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}



