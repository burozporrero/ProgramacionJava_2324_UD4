package EjerciciosVectores.soluciones;

public class TablasDeMultiplicar {
    public static void main(String[] args) {
        int[][] tablas = new int[10][10];
        for (int a = 0; a < tablas.length; a++){
            for (int b = 0; b < tablas[a].length; b++){
                tablas[a][b] = (a + 1) * (b + 1);
            }
        }
        for (int a = 0; a < tablas.length; a++){
            System.out.println("Tabla del " + (a + 1) + ":");
            for (int b = 0; b < tablas[a].length; b++){
                System.out.println((a + 1) + " x " + (b + 1) + " = " + tablas[a][b]);
            }
            System.out.println();
        }
    }
}
