package ejemplos;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        /* Declaración de un Map (un HashMap) con clave "Integer" y Valor "String".
        //Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados
        //como clave son los objetos predefinidos de Java como String, Integer, Double ...
        //!!!!CUIDADO los Map no permiten datos atómicos
        Map<Integer, String> nombreMap = new HashMap<Integer, String>();
        nombreMap.size(); // Devuelve el numero de elementos del Map
        nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
        nombreMap.put(K clave, V valor); // Añade un elemento al Map
        nombreMap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
        nombreMap.clear(); // Borra todos los componentes del Map
        nombreMap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
        nombreMap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
        nombreMap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
        nombreMap.values(); // Devuelve una "Collection" con los valores del Map
        */

        Map<Integer, String> divisas = new HashMap<>();
        divisas.put(1,"pesos");
        divisas.put(2,"dolares");
        divisas.put(3,"euros");
        divisas.put(4,"bolivares");
        divisas.put(5,"canadolares xd");

        System.out.println("Claves: "+divisas.keySet());
        System.out.println("Valores: "+divisas.values());
        System.out.println("Valor posicion 4: "+divisas.get(4));
        System.out.println(divisas.isEmpty()); //false por que si tenemos datos
        System.out.println("Tamaño: "+divisas.size());
        System.out.println("Esiste valor en la posicion 2: "+divisas.containsKey(2)); //true
        System.out.println("Esiste valor en la posicion 6: "+divisas.containsKey(6)); //false
        System.out.println("Buscar valor: "+divisas.containsValue("yenes")); //false
        System.out.println("Buscar valor: "+divisas.containsValue("euros")); //true




    }
}
