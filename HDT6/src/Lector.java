

import java.io.*;
import java.util.*;
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
                System.out.println(lines);
                listaDeCartas[contador] = lines;
                seguir = true;
                contador++;
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return  listaDeCartas;
    }

}
