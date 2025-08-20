
package ejercicios;
import java.util.ArrayList;
import java.util.Random;

class Moneda {
    String valor, lado;
    Moneda(String v, String l) { valor = v; lado = l; }
    public String toString() { return valor + " - " + lado; }
}
