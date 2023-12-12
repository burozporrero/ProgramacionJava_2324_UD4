package EjerciciosVectores.soluciones;

import java.util.Scanner;

/**
 * @author Fernando F.
 */
public class Cantantes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MAX_SIZE = 10;
        final String FIN = "fin";

        String[] cantantes = new String[MAX_SIZE];
        int index = 0;

        System.out.println("Introduce hasta 10 cantantes que te gusten mucho. Si deseas terminar antes escribe " +
                "'fin'.");
        while (index < MAX_SIZE) {
            System.out.println("Número " + (index + 1) + ": ");
            String texto = sc.nextLine();

            if (texto.equalsIgnoreCase(FIN)) {
                break;
            }
            // si entramos en el if, saldremos con break, con lo cual, esto no es necesario que esté en un else
            cantantes[index] = texto;
            index++;
        }

        // esta comprobación de index es para no imprimir si el usuario no ha llegado a introducir ningún cantante
        if(index != 0) {
            System.out.print("Estos son tus grupos favoritos: ");
            for (int i = 0; i < index; i++) {
                System.out.print(cantantes[i].toUpperCase() + ", ");
            }
        }
        sc.close();
    }
}
