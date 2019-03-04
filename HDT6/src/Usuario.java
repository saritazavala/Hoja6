/*Sara Zavala 18893
Hoja de Trabajo 6
03 de Marzo de 2019
Estructura de Datos
 */

import java.io.*;
import java.util.*;
public class Usuario<E> {

    private  Map cartas;

    //ATRIBUTO
    private int cantidadDeCartas;

    //METODOS PARA EL USUARIO


    public String mostrarCartas(){
        return "";
    }


    public void AgregarCartas(Map cartas){
        cartas = this.cartas;

    }

    public void setCantidadDeCartas(){

    }

    public int getCantidadCartas(){
    return 0;
    }

    public String mostrarTipoCarta(String nombre) {
        return (String) cartas.get(nombre);
    }



}
