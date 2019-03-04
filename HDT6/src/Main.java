/*Sara Zavala 18893
Hoja de Trabajo 6
03 de Marzo de 2019
Estructura de Datos
 */



import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        String[] archivo = Lector.leerArchivo();
        String[] comparador = new String[2];
        Factory<String, String> factory = new Factory<>();
        Map<String, String> cartasUsuario = null;
        Scanner leer = new Scanner(System.in);
        Cartas[] cartas = new Cartas[archivo.length];
        Usuario<Cartas> usuario = new Usuario<>();
        Map<String,String> cartasTotal = null;


        for (int i = 0; i < cartas.length; i++) {
            cartas[i] = new Cartas();
        }

        for (int i = 0; i < archivo.length ; i++) {
            comparador = archivo[i].split("\\|");
            cartas[i].setKey(comparador[0]);
            cartas[i].setValue(comparador[1]);
        }

        System.out.println("Seleccione el Map deseado: ");
        System.out.println("1.HashMap");
        System.out.println("2.TreeMap");
        System.out.println("3.LinkedMap");
        String mapaSeleccionado = leer.nextLine();

        if(mapaSeleccionado.equals("1")){
            cartasUsuario = factory.getMap("HashMap");
        }else if(mapaSeleccionado.equals("2")){
            cartasUsuario = factory.getMap("TreeMap");
        }else if(mapaSeleccionado.equals("3")){
            cartasUsuario = factory.getMap("Linked");
        }else{
            return;
        }
        cartasTotal = cartasUsuario;
        for (int i = 0; i < archivo.length; i++) {
            cartasTotal.put(cartas[i].getKey(), cartas[i].getValue());
        }

        while (true) {
            System.out.println("1.Ingresar una carta");
            System.out.println("2.Mostrar el tipo de carta");
            System.out.println("3.Mostrar el nombre, tipo y cantidad de cada carta que el usuario tiene en su colección");
            System.out.println("4.Mostrar el nombre, tipo y cantidad de cada carta que el usuario tiene en su colección, ordenadas por tipo");
            System.out.println("5.Mostrar el nombre y tipo de todas las cartas existentes.");
            System.out.println("6.Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo");
            System.out.println("7. Mostar elementos para profiler");

            String seleccion = leer.nextLine();
            boolean existe = false;

            if (seleccion.equals("1")) {
                System.out.println("Ingrese la carta");
                String ingreso = leer.nextLine();
                for (int i = 0; i < cartas.length; i++) {
                    if (cartas[i].getKey().equals(ingreso)) {
                        existe = true;
                        cartasUsuario.put(cartas[i].getKey(), cartas[i].getValue());
                        usuario.agregarCartas(cartasUsuario);
                    }
                }
                if(existe == false){
                    System.out.println("La carta no existe, no puede ser agregada");
                }
            }
            else if(seleccion.equals("2")){
                System.out.println("Ingrese la carta que desea saber el tipo: ");
                String carta = leer.nextLine();
                System.out.println(usuario.mostrarTipoCarta(carta));
            }

            else if(seleccion.equals("3")){

               System.out.println(usuario.mostrarCartas());
                System.out.println("El usuario tiene: " + usuario.getCantidadCartas() + " cartas");
            }
            else if(seleccion.equals("4")){
                usuario.mostrarCartasOrdenadas();
            }

            else if(seleccion.equals("5")){
                for (int i = 0; i < cartas.length; i++) {
                    System.out.println(cartas[i].getKey() + " - " + cartas[i].getValue());
                }
                System.out.println("Existen: " + cartas.length+"cartas");
            }

            else if(seleccion.equals("6")){
                cartasTotal.entrySet().stream()
                        .sorted(Map.Entry.<String, String>comparingByValue())
                        .limit(8861)
                        .forEach(System.out::println);
                System.out.println("Existen: " + cartas.length + " Cartas");
            }

            else if(seleccion.equals("7")){
                MostrarElementosProfiler.mostrarElementos(cartasTotal);
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
