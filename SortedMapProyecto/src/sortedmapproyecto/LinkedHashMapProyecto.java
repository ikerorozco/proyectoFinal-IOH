/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortedmapproyecto;

import java.util.LinkedHashMap;

/**
 *
 * @author ikero
 */
public class LinkedHashMapProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(1, "Iker");
        lhm.put(7, "Eve");
        lhm.put(2, "Isa");
        lhm.put(3, "Rodrigo");
        lhm.put(6, "Saul");
        System.out.println(lhm.values());
        boolean respuesta = lhm.containsKey(1);
        System.out.println("Existe un elemento que tenga como llave el 1? "+respuesta);
        
        respuesta = lhm.containsKey(4);
        System.out.println("Existe un elemento que tenga como llave el 4? "+respuesta);
        
        respuesta = lhm.containsValue("Iker");
        System.out.println("Existe un elemento que tenga Iker como nombre? "+respuesta);
        
        respuesta = lhm.containsValue("Pepe");
        System.out.println("Existe un elemento que tenga Pepe como nombre? "+respuesta);
        
        System.out.println("El valor que esta asociado al numero 1 es: "+lhm.get(1));
        
        System.out.println("El valor que esta asociado al numero 2 es: "+lhm.get(2));
        
        System.out.println("El valor que esta asociado al numero 7 es: "+lhm.get(7));
        
        System.out.println(lhm.keySet());
        
        lhm.remove(3);
        System.out.println("El elemento 3 se ha quitado con exito ");
        
        lhm.replace(1, "Andy");
        System.out.println("El nuevo nombre de Iker es -> Andy");
        
        System.out.println(lhm.values());
        
        
        
        
        
        
        
    }
    
}
