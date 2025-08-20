package ejercicios;

import java.util.ArrayList;

public class Ejercicio1 {

    public static void main(String[] args) {
        ArrayList<String> companeros = new ArrayList<>();
        companeros.add("Juan");
        companeros.add("Paco");
        companeros.add("jos");
        companeros.add("Marta");
        companeros.add("amparo");
        companeros.add("Marcela");

        for (String nombre : companeros) {
            System.out.println(nombre);
        }
    
    }
}
