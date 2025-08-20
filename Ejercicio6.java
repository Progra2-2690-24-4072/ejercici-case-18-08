
package ejercicios;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        HashMap<String, String> usuarios = new HashMap<>();
        usuarios.put("admin", "1234");
        usuarios.put("juan", "abcd");

        Scanner sc = new Scanner(System.in);
        int intentos = 3;
        boolean acceso = false;

        while (intentos > 0 && !acceso) {
            String u = sc.nextLine();
            String p = sc.nextLine();
            if (usuarios.containsKey(u) && usuarios.get(u).equals(p)) acceso = true;
            else intentos--;
        }
        System.out.println(acceso ? "Acceso permitido" : "Acceso denegado");
    }
}