/*Sara Zavala 18893
Hoja de Trabajo 6
03 de Marzo de 2019
Estructura de Datos
 */

import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
//Objeto Cartas
//Se crean los sets y gets para las llaves y valores que este tendrá
public class Cartas {

    //Atributo
    private String key;
    private String value;
    private int quantity;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
