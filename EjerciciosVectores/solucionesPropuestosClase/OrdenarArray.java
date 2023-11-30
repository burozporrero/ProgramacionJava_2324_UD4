package EjerciciosVectores.solucionesPropuestosClase;

import java.util.Arrays;

/**
 * @author Julián A.
 */
public class OrdenarArray {
    public static void main(String[] args) {
        String[] array = {"Mediciones", "Longitudes", "patata", "astharot", "Ameba"};
        Arrays.sort(array, String.CASE_INSENSITIVE_ORDER);
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}
