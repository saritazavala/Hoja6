
/*Sara Zavala 18893
Hoja de Trabajo 6
03 de Marzo de 2019
Estructura de Datos
 */
import java.io.*;
import java.util.*;

//Clase para leer un documento
//Este codigo bue basado en el encontrado en la siguiente pagina web
//https://geekytheory.com/como-leer-un-fichero-en-java
//https://es.stackoverflow.com/questions/71250/leer-varias-lineas-de-un-archivo-de-texto-java
public class Lector {

    public static String[] leerArchivo(){
        boolean seguir;
        String[] listaDeCartas = new String[8861];
        int contador = 0;
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
                listaDeCartas[contador] = lines;
                contador++;
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return  listaDeCartas;
    }

}
