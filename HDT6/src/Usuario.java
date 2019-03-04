/*Sara Zavala 18893
Hoja de Trabajo 6
03 de Marzo de 2019
Estructura de Datos
 */
// Referencia: Codigo recuperado de: https://stackoverflow.com/questions/29567575/sort-map-by-value-using-lambdas-and-streams

//Esta clase es para crear un objeto que contega objetos tipo Cartas
//y para manejarlas mediante un map
import java.util.Map;

public class Usuario<E> {
    private int cantidadCartas;
    private Map cartas;
    Cartas[] cartitas = new Cartas[8861];
    private int monstruos;
    private int hechizos;
    private int trampa;


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

    public void mostrarCartasOrdenadas(){
        cartas.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue())
                .limit(8861)
                .forEach(System.out::println); // or any other terminal method
    }

    public void agregarCartas(Map cartas){
        this.monstruos = 0;
        this.trampa = 0;
        this.hechizos = 0;
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
            if(values.toString().equals("Monstruo")){
                monstruos++;
            }else if(values.toString().equals("Hechizo")){
                hechizos++;
            }else if(values.toString().equals("Trampa")){
                trampa++;
            }
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

    public String getCantidadTiposCartas(){
        return hechizos + " Hehizos\n" +  monstruos + " Monstruos\n" + trampa + " Trampas";
    }


}