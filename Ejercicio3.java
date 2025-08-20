
package ejercicios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) numeros.add(sc.nextInt());
        Collections.sort(numeros);
        System.out.println(numeros);
    }
}