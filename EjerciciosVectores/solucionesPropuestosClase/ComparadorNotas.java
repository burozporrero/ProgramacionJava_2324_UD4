package EjerciciosVectores.solucionesPropuestosClase;

public class ComparadorNotas {
    public static void main(String[] args) {
        int[][] notas = {
                { 80, 75, 90 }, // Notas del primer estudiante
                { 80, 75, 90 }  // Notas del segundo estudiante
        };

        boolean notasIguales = true;

        for (int i = 0; i < notas[0].length; i++) {
            if (notas[0][i] != notas[1][i]) {
                notasIguales = false;
                break;
            }
        }

        if (notasIguales) {
            System.out.println("Las notas son iguales");
        } else {
            System.out.println("Las notas son diferentes");
        }
    }
}
