/*Sara Zavala 18893
Hoja de Trabajo 6
03 de Marzo de 2019
Estructura de Datos
 */

import java.util.Map;

public class Usuario<E> {
    private int cantidadCartas;
    private Map cartas;
    Cartas[] cartitas = new Cartas[8861];


    //Constructor
    public Usuario(){
        for (int i = 0; i < 8861 ; i++) {
            cartitas[i] = new Cartas();
        }
    }

    public String mostrarCartas(){
        String cartas = "";
        for (int i = 0; i < this.cartas.size() ; i++) {
            cartas += "Nombre: " +  cartitas[i].getKey() + " - " + "Tipo: " + cartitas[i].getValue() + "\n";
        }
        cartas += "\nEl Usuario tiene: " + this.cantidadCartas + " cartas";
        return cartas;
    }

    public void agregarCartas(Map cartas){
        this.cartas = cartas;
        int contador = 0;
        int contador2 = 0;
        for(Object keys : cartas.keySet()){
            cartitas[contador].setKey((String) keys);
            contador++;
        }

        for(Object values: cartas.values()){
            cartitas[contador2].setValue((String) values);
            contador2++;
        }

        this.cantidadCartas = cartas.size();
    }

    public void setCantidadCartas(){

    }

    public int getCantidadCartas(){
        return cantidadCartas;
    }

    public String mostrarTipoCarta(String nombre) {
        return (String) cartas.get(nombre);
    }



}