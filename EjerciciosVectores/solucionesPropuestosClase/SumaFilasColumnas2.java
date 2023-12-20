package EjerciciosVectores.solucionesPropuestosClase;


/**
 * @author Daviv G. y Sergio R.
 */
public class SumaFilasColumnas2 {
        public static void main(String[] args) {

            final int FILAS = 4;
            final int COLUMNAS = 5;

            int[][] numero = new int[FILAS][COLUMNAS];
            int suma;
            int sumaTotal = 0;

            System.out.println("Generación de 20 números (entre 0 y 9) de forma aleatoria");

            for (int i = 0; i < FILAS; i++) {
                suma = 0;
                for (int j = 0; j < COLUMNAS; j++) {
                    numero[i][j] = (int) (Math.random() * 10);
                    System.out.print(numero[i][j] + "\t");
                    suma += numero[i][j];
                }
                System.out.println("S: " + suma);
            }

            for (int j = 0; j < COLUMNAS; j++) {
                suma = 0;
                for (int i = 0; i < FILAS; i++) {
                    suma += numero[i][j];
                }
                System.out.print(suma + "\t");
                sumaTotal += suma;
            }

            System.out.print("T: " + sumaTotal);
            System.out.println();
        }
}
