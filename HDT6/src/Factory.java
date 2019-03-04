/*Sara Zavala 18893
Hoja de Trabajo 6
03 de Marzo de 2019
Estructura de Datos
 */
import java.io.*;
import java.util.*;
import java.util.Collections.*;


public class Factory<k,v> {
    public Map<k,v> getMap(String tipoMapa){

        if (tipoMapa== null){
            return  null;
        }

        else if (tipoMapa.equalsIgnoreCase("Hashmap")){
            return  new HashMap<k,v>();
        }

        else if (tipoMapa.equalsIgnoreCase("TreeMap")){
            return new TreeMap<k,v>();
        }

        else if (tipoMapa.equalsIgnoreCase("")){
            return new LinkedHashMap<k,v>();
        }

        return null;
    }

/*
Referencias
Tutorialspoint. Design Pattern - Factory Pattern.
https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
https://www.tutorialspoint.com/java/java_collections.htm
 */

}
