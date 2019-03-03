/*Sara Zavala 18893
Hoja de Trabajo 6
03 de Marzo de 2019
Estructura de Datos
 */
import java.io.*;
import java.util.*;
import java.util.Collections.*;

/*
Refenrencias
Tutorialspoint. Design Pattern - Factory Pattern.
https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 */
public class Factory<k,v> {
    public Map getMap(String tipoMapa){

        if (tipoMapa== null){
            return  null;
        }

        if (tipoMapa.equalsIgnoreCase("Hashmap")){
            return  new HashMap<>();
        }

        return null;
    }



}
