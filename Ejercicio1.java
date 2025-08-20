package ejercicios;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> companeros = new ArrayList<>();
        companeros.add("Ana");
        companeros.add("Luis");
        companeros.add("Carlos");
        companeros.add("Marta");
        companeros.add("Sofia");
        companeros.add("Javier");

        for (String nombre : companeros) {
            System.out.println(nombre);
        }
    }
}
