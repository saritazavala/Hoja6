/*Sara Zavala 18893
Hoja de Trabajo 6
03 de Marzo de 2019
Estructura de Datos
 */

import java.io.*;
import java.util.*;


 /* Es como en python? Habian Diccionarios tambien con keys y "definiciones"
        Can relate them.

        1. Leer el archivo.
        NOMBRE|TIPO DE CARTA

        Debo Leer por linea por linea

        2. Crear listas
         */

public class Main {
    public static void main(String[] args){
        boolean seguir = false;

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
                //System.out.println(lines);
                seguir = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        while (seguir){
            System.out.println("siu");
        }






    }

}

/*
Referencias:
Leer el documento linea por linea:
https://es.stackoverflow.com/questions/71250/leer-varias-lineas-de-un-archivo-de-texto-java


 */
