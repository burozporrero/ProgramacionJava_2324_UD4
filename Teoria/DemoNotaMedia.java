package Teoria;

import java.util.Locale;
import java.util.Scanner;

public class DemoNotaMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notes = new double[7];

        System.out.println("Nota mitjana\nEntra les notes");
        for (int i = 0; i < 7; i++) {
            System.out.print("Nota de l'examen nº " + (i + 1) + ": ");
            notes[i] = sc.nextDouble();
        }

        System.out.println("Les teues notes són: ");

        double suma = 0;
        for (double note : notes) {
            System.out.print(note + " ");
            suma += note;
        }
        System.out.println("\nLa mitjana és " + suma / notes.length);
    }
}
