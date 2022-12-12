/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap.diccionario;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author ikero
 */
public class HashMapDiccionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String contenido;
        HashMap Diccionario = new HashMap();
        Diccionario.put("Iker", "319162167");
        Diccionario.put("Eve", "34565623");
        Diccionario.put("Isa", "476347980");
        Diccionario.put("Rodrigo", "56425675");
        contenido = (String) Diccionario.get("Iker");
        System.out.println("El valor de Iker es: "+contenido);
        contenido = (String) Diccionario.get("Eve");
        System.out.println("El valor de Eve es: "+contenido);
        contenido = (String) Diccionario.get("Isa");
       System.out.println("El valor de Isa es: "+contenido);
       contenido = (String) Diccionario.get("Rodrigo");
       System.out.println("El valor de Rodrigo es: "+contenido);
        boolean respuesta = Diccionario.containsKey("Iker");
        System.out.println("Existe el elemento Iker en el diccionario? "+respuesta);
        respuesta = Diccionario.containsKey("Pepe");
        System.out.println("Existe el elemento Pepe en el diccionario? "+respuesta);
        Diccionario.remove("Rodrigo");
        System.out.println("Se removio el valor de Rodrigo del Hash Map");
        respuesta = Diccionario.containsKey("Rodrigo");
        System.out.println("Existe el elemento Rodrigo en el diccionario? "+respuesta);
        respuesta = Diccionario.containsValue("56425675");
        System.out.println("Existe el elemento 56425675 en el diccionario? "+respuesta);
        respuesta = Diccionario.containsValue("829405343");
        System.out.println("Existe el elemento 829405343 en el diccionario? "+respuesta);
        Diccionario.replace("Iker", "420273278");
        System.out.println("Se reemplazo el numero de cuenta de Iker por: 420273278");
        System.out.println(Diccionario);
        System.out.println(Diccionario.values());
        System.out.println(Diccionario.keySet());
    }
    
}
