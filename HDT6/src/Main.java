/*Sara Zavala 18893
Hoja de Trabajo 6
03 de Marzo de 2019
Estructura de Datos
 */

import java.io.*;
import java.util.*;
import java.util.Scanner;


 /* Es como en python? Habian Diccionarios tambien con keys y "definiciones"
        Can relate them.

        1. Leer el archivo.
        NOMBRE|TIPO DE CARTA

        Debo Leer por linea por linea

        2. Crear listas
        Splitear con el Signo | que los separa

        3. Agregar a la lista la baraja entera y puedo separar en los keys y valores

         */

public class Main {
    public static void main(String[] args){
        Factory fac = new Factory();
        boolean seguir = false;
        Map<String,String> todasLasCartas = null;
        Map<String,String> cartasDelMen = null;

        ArrayList<String> cartasGuapas = new ArrayList<String>();
        Scanner teclado = new Scanner(System.in);




        File file = new File("cards_desc.txt");
        FileReader fileR = null;
        BufferedReader file2 = null;

        try {
            fileR = new FileReader(file);
            file2 = new BufferedReader(fileR);


        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo "+file.getName());
        }

        try {
            String lines = "";
            while( ( lines = file2.readLine()) != null) {
                System.out.println(lines);
                seguir = true;


            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (seguir==true){


            System.out.println("Ingrese el tipo de Mapa que desea: ");
            System.out.println("1. HashMap");
            System.out.println("2.TreeMap");
            System.out.println("3. LinkedHashMap");

            int eleccion = teclado.nextInt();
            teclado.nextLine();


            if (eleccion == 1){
                todasLasCartas = fac.getMap("Hashmap");
                cartasDelMen = fac.getMap("Hashmap");
                System.out.println("siiiu");
            }

            else if(eleccion==2){
                todasLasCartas = fac.getMap("TreeMap");
                cartasDelMen = fac.getMap("TreeMap");
            }

            else if(eleccion==3){
                todasLasCartas = fac.getMap("Linked");
                cartasDelMen = fac.getMap("Linked");

            }



        }






    }

}

/*
Referencias:
Leer el documento linea por linea:
https://es.stackoverflow.com/questions/71250/leer-varias-lineas-de-un-archivo-de-texto-java


 */
