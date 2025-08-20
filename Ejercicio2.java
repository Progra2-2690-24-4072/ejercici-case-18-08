
package ejercicios;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {

    public static void main(String[] args) {
        Random r = new Random();
        int tam = r.nextInt(11) + 10;
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < tam; i++) numeros.add(r.nextInt(101));

        int suma = 0, max = numeros.get(0), min = numeros.get(0);
        for (int n : numeros) {
            suma += n;
            if (n > max) max = n;
            if (n < min) min = n;
        }

        System.out.println("Lista: " + numeros);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + (suma / (double) numeros.size()));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
    
}
