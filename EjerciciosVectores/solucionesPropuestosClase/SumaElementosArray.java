package EjerciciosVectores.solucionesPropuestosClase;

/**
 * @author Hugo R.
 */
public class SumaElementosArray {
    public static void main(String[] args) {

        int[] matriz = {5, 10, 15, 20, 25};
        int suma = 0;

        for (int j : matriz) {
            suma += j;
        }

        /* Se muestran las alternativas con for y con foreach
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i];
        }
         */
        System.out.println("La suma de los elementos es: " + suma);
    }
}
