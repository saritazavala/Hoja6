/*Sara Zavala 18893
Hoja de Trabajo 6
03 de Marzo de 2019
Estructura de Datos
 */

import sun.security.smartcardio.SunPCSC;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] Archivo = Lector.leerArchivo();
        String[] comparador = new String[2];
        Cartas[] cartas = new Cartas[Archivo.length];
        Factory<String,String> fac = new Factory<>();
        Map<String,String> cartasUsuario = null;

        for (int i = 0; i <cartas.length ; i++) {
            cartas[i] = new Cartas();

        }


        for (int i = 0; i <Archivo.length ; i++) {
            comparador = Archivo[i].split("\\|");
            cartas[i].setKey(comparador[0]);
            cartas[i].setValue(comparador[1]);

        }

        System.out.println("Ingrese el tipo de Map que desea");
        System.out.println("1. Hashmap");
        System.out.println("2. Treemap");
        System.out.println("3. Linked");

        String opcion = teclado.nextLine();

        if(opcion.equals(1)){
            cartasUsuario = fac.getMap("Hashmap");
        }

        else if(opcion.equals(2)){
            cartasUsuario = fac.getMap("TreeMap");
        }
        else if (opcion.equals(3)){
            cartasUsuario = fac.getMap("Linked");
        }
        else{
            return;
        }








        for (int i = 0; i <cartas.length ; i++) {
            System.out.println(cartas[i].getKey()+"-"+cartas[i].getValue());
        }

        System.out.println("Existen"+cartas.length+ "cartas");




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
