package EjerciciosVectores.solucionesPropuestosClase;

public class InvertirArray {
    public static void main(String[] args) {
        pintarArrayInvertido();
    }

    /**
     * @author Julián A.
     */
    public static void pintarArrayInvertido() {
        int[] array = {23, 52, 43, 31, 48};

        for (int j : array) {
            System.out.println(j);
        }

        System.out.println("\n");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
