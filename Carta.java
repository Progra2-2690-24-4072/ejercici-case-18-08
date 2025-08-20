
package ejercicios;
import java.util.ArrayList;
import java.util.Collections;

class Carta {
    String numero, palo;
    Carta(String n, String p) { numero = n; palo = p; }
    public String toString() { return numero + " de " + palo; }
}