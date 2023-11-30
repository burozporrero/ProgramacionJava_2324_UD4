package EjerciciosVectores.solucionesPropuestosClase;

import java.util.Scanner;

/**
 * @author Hugo R.
 */
public class BuscaMaximoArray {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int[] matriz = new int[4];
        int maximo = matriz[0];

        //Pedir al usuario los valores
        for (int i = 0; i< matriz.length; i++) {
            System.out.println("Introduce el valor para la posición " + i + " : ");
            matriz[i] = scn.nextInt();
        }

        // Encontrar el elemento máximo
        for (int j : matriz) {
            if (j > maximo) {
                maximo = j;
            }
        }
        System.out.println("El elemento máximo es: " + maximo);
    }
}
