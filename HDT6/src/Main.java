/*Sara Zavala 18893
Hoja de Trabajo 6
03 de Marzo de 2019
Estructura de Datos
 */
//Referencias hasta abajo

import java.util.Scanner;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        //Se crean nuestras variables
        //Maps, Arrays, cartas, Usuario, Scanner
        String[] archivo = Lector.leerArchivo();
        String[] comparador = new String[2];
        Factory<String, String> factory = new Factory<>();
        Map<String, String> cartasUsuario = null;
        Scanner leer = new Scanner(System.in);
        Cartas[] cartas = new Cartas[archivo.length];
        Usuario<Cartas> usuario = new Usuario<>();
        Map<String,String> cartasTotal;

        //For para la lista de cartas con objeto Cartas
        for (int i = 0; i < cartas.length; i++) {
            cartas[i] = new Cartas();
        }
        //Con esto se splitean las cartas y se separan en valores y keys
        for (int i = 0; i < archivo.length ; i++) {
            comparador = archivo[i].split("\\|");
            cartas[i].setKey(comparador[0]);
            cartas[i].setValue(comparador[1]);
        }

        //Se crea el primer menu para elegir el Map
        System.out.println("Seleccione el Map deseado: ");
        System.out.println("1.HashMap");
        System.out.println("2.TreeMap");
        System.out.println("3.LinkedMap");
        String mapaSeleccionado = leer.nextLine();
        //Se llama a nuestro factory para cada caso de Map
        if(mapaSeleccionado.equals("1")){
            cartasUsuario = factory.getMap("HashMap");
            cartasTotal = factory.getMap("HashMap");
        }else if(mapaSeleccionado.equals("2")){
            cartasUsuario = factory.getMap("TreeMap");
            cartasTotal = factory.getMap("TreeMap");
        }else if(mapaSeleccionado.equals("3")){
            cartasUsuario = factory.getMap("Linked");
            cartasTotal = factory.getMap("Linked");
        }else{
            return;
        }

        for (int i = 0; i < archivo.length; i++) {
            cartasTotal.put(cartas[i].getKey(), cartas[i].getValue());
            //Se le van a agregando  al usuario cartas
        }

        while (true) {
            //Menu 2 para las opciones
            System.out.println("1.Ingresar una carta");
            System.out.println("2.Mostrar el tipo de carta");
            System.out.println("3.Mostrar el nombre, tipo y cantidad de cada carta que el usuario tiene en su colección");
            System.out.println("4.Mostrar el nombre, tipo y cantidad de cada carta que el usuario tiene en su colección, ordenadas por tipo");
            System.out.println("5.Mostrar el nombre y tipo de todas las cartas existentes.");
            System.out.println("6.Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo");
            System.out.println("7. Mostar elementos para profiler");
            System.out.println("8. Salir");




            try {


                String seleccion = leer.nextLine();
                boolean existe = false;
                //Booleano para ciclo

                //Si la opcion es la 1
                if (seleccion.equals("1")) {
                    System.out.println("Ingrese la carta");
                    String ingreso = leer.nextLine();
                    for (int i = 0; i < cartas.length; i++) {
                        if (cartas[i].getKey().equals(ingreso)) {
                            existe = true;
                            cartasUsuario.put(cartas[i].getKey(), cartas[i].getValue());
                            usuario.agregarCartas(cartasUsuario);
                            usuario.agregarCartas(cartas[i]);
                            break;
                        }
                    }
                    if (existe == false) {
                        System.out.println("La carta no existe, no puede ser agregada");
                    }
                }


                //Si la opcion es la 2
                else if (seleccion.equals("2")) {
                    System.out.println("Ingrese la carta que desea saber el tipo: ");
                    String carta = leer.nextLine();
                    System.out.println(usuario.mostrarTipoCarta(carta));
                }
                //Si la opcion es la 3
                else if (seleccion.equals("3")) {

                    System.out.println(usuario.mostrarCartas());
                    System.out.println(usuario.getCantidadTiposCartas());
                    System.out.println(usuario.cartasRepetidasToString());

                }
                //Si la opcion es la 4
                else if (seleccion.equals("4")) {
                    System.out.println("El usuario tiene: " + "" + usuario.getCantidadCartas() + "cartas en el Map del usuario");
                    usuario.mostrarCartasOrdenadas();
                    System.out.println(usuario.getCantidadTiposCartas());
                    System.out.println(usuario.cartasRepetidasToString());

                }

                //Si la opcion es la 5
                else if (seleccion.equals("5")) {
                    for (Cartas carta : cartas) {
                        System.out.println(carta.getKey() + " - " + carta.getValue());
                    }
                    System.out.println("Existen: " + cartas.length + "cartas");
                }
                //Si la opcion es la 6
                else if (seleccion.equals("6")) {
                    cartasTotal.entrySet().stream()
                            .sorted(Map.Entry.comparingByValue())
                            .limit(8861)
                            .forEach(System.out::println);
                    System.out.println("Existen: " + cartas.length + " Cartas");
                }
                //Si la opcion es la 7
                else if (seleccion.equals("7")) {
                    MostrarElementosProfiler.mostrarElementos(cartasTotal);
                }
                //Si la opcion es la 8
                else if (seleccion.equals("8")) {
                    break; //Salir
                }
            }catch (Exception e){
                System.out.println("Ingrese una opcion disponible");
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
https://geekytheory.com/como-leer-un-fichero-en-java
 */
