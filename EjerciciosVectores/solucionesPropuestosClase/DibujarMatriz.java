package EjerciciosVectores.solucionesPropuestosClase;

import java.util.Scanner;

/**
 * Ejercicio de dibujar una matriz pero con ligeras modificaciones sobre el enunciado.
 * Aquí se pide al usuario tanto el número de filas, como de columnas y los valores en lugar de
 * introducirlos random
 *
 * @author Vicent P.
 */
public class DibujarMatriz {
    public static void main (String[] args){
        crearArray();
    }

    public static void crearArray(){
        System.out.println("**CREAR UNA ARRAY BIDIMENSIONAL**");
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el n de columnas: ");
        int nColumn = sc.nextInt();
        System.out.println("Introduce el n de filas: ");
        int nFilas = sc.nextInt();

        int[][] array = new int[nColumn] [nFilas];

        for (int i = 0; i < nColumn; i++){
            for (int j = 0; j < nFilas; j++) {
                System.out.printf("Introduce el n que quieres guardar en la posicion %d - %d: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n\tMostrando matriz...\n");
        for (int i = 0; i < nColumn; i++){
            for (int j = 0; j < nFilas; j++){
                System.out.print("\t\t" + array[i][j]);
            }
            System.out.print("\n");
        }

        sc.close();
    }
}
