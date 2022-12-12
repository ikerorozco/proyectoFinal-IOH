/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treemap;

import java.util.TreeMap;

/**
 *
 * @author ikero
 */
public class TreeMapArbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TreeMap treeMap = new TreeMap();
        treeMap.put(1, "Iker");
        treeMap.put(5, "Eve");
        treeMap.put(3, "Isa");
        treeMap.put(7, "Rodrigo");
        System.out.println(treeMap);
        System.out.println("Hay un elemento en el lugar 1 :"+treeMap.ceilingEntry(1));
        System.out.println("Hay un elemento en el lugar 3 :"+treeMap.ceilingEntry(3));
        System.out.println("Hay un elemento en el lugar 5 :"+treeMap.ceilingEntry(5));
        System.out.println("Hay un elemento en el lugar 7 :"+treeMap.ceilingEntry(7));
        System.out.println("Hay un elemento en el lugar 9 :"+treeMap.ceilingEntry(9));
        boolean respuesta = treeMap.containsKey(1);
        System.out.println("Hay un elemento en el lugar 1? "+respuesta);
        respuesta = treeMap.containsKey(9);
        System.out.println("Hay un elemento en el lugar 9? "+respuesta);
        respuesta = treeMap.containsValue("Iker");
        System.out.println("Hay un elemento con el nombre Iker? "+respuesta);
        respuesta = treeMap.containsValue("Pepe");
        System.out.println("Hay un elemento con el nombre Pepe? "+respuesta);
        treeMap.remove(7);
        System.out.println("Se ha removido el valor de Rodrigo");
        respuesta = treeMap.containsValue("Rodrigo");
        System.out.println("Hay un elemento con el nombre Rodrdrigo? "+respuesta);
        treeMap.replace(1, "Andy");
        System.out.println("El nuevo nombre de Iker es -> Andy");
        System.out.println(treeMap);
        System.out.println(treeMap.values());
        
        
    }
    
}
