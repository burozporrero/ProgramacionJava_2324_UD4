package EjerciciosVectores.solucionesPropuestosClase;

/**
 * @author Hugo R.
 */
public class MuestraParesArray {

    public static void main(String[] args) {

        int[] matriz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Números pares en la matriz:");
        for (int j : matriz) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }

        /*
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] % 2 == 0) {
                System.out.print(matriz[i] + " ");
            }
        }
         */
    }
}
