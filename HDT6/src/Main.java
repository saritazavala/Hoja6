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

        3. Agregar a la lista la baraja entera y puedo separara por keys y values

        3.1 no se si es mas facil meter  y splitearlo hasta el signo de la barrita |

         */

public class Main {
    public static void main(String[] args){
        Factory fac = new Factory<>();
        boolean seguir = false;
        boolean seguirx2 = false;
        Map<String,String> todasLasCartasMapa = null;
        Map<String,String> cartasDelMen = null;
        ArrayList<String> ListaDeCartas = new ArrayList<String>();

        Scanner teclado = new Scanner(System.in);

        

        if (seguir==true){


            System.out.println("Ingrese el tipo de Mapa que desea: ");
            System.out.println("1. HashMap");
            System.out.println("2.TreeMap");
            System.out.println("3. LinkedHashMap");

            int eleccion = teclado.nextInt();
            teclado.nextLine();


            if (eleccion == 1){
                todasLasCartasMapa = fac.getMap("Hashmap");
                cartasDelMen = fac.getMap("Hashmap");
                System.out.println(ListaDeCartas);

                seguirx2 = true;
            }

            else if(eleccion==2){
                todasLasCartasMapa = fac.getMap("TreeMap");
                cartasDelMen = fac.getMap("TreeMap");
                seguirx2 = true;
            }

            else if(eleccion==3){
                todasLasCartasMapa = fac.getMap("Linked");
                cartasDelMen = fac.getMap("Linked");
                seguirx2 = true;

            }


        if (seguirx2==true){
            System.out.println("1. Agregar carta nueva a tu baraja (usuario)");
            System.out.println("2. Mostrar el tipo de una carta específica");
            System.out.println("3. Mostrar el nombre, tipo y cantidad de cada carta que el usuario tiene en su colección.");
            System.out.println("4. Mostrar el nombre, tipo y cantidad de cada carta que el usuario tiene en su colección, ordenadas por tipo.");
            System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes.");
            System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.");

            int opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion==1){
                System.out.println(todasLasCartasMapa);
                System.out.println("yey");
            }

        }

        }

    }

}

/*
Referencias:
Leer el documento linea por linea:
https://es.stackoverflow.com/questions/71250/leer-varias-lineas-de-un-archivo-de-texto-java

Codigo para hacer el split
https://www.tutorialspoint.com/java/java_string_split.htm
https://es.stackoverflow.com/questions/45846/c%C3%B3mo-separar-un-string-en-java-c%C3%B3mo-utilizar-split
https://www.geeksforgeeks.org/split-string-java-examples/

 */
