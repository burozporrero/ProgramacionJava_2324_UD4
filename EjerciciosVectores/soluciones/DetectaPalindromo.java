package EjerciciosVectores.soluciones;

import java.util.Scanner;

public class DetectaPalindromo {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        String word;
        boolean isPalindrome;

        System.out.println("Introduzca una palabra para detectar si es un palíndromo: ");
        word = sc.next();

        isPalindrome = isPalindrome(word);

        System.out.printf("La palabra introducida %s es palíndromo.", (isPalindrome?"sí":"no"));

    }

    public static boolean isPalindrome(String word) {
        if (word.isBlank()) {
            // si la paraula està buida
            return false;
        }
        char[] wordArray = word.toCharArray(); // passa la paraula a una matriu de caràcters
        char[] copyArray = new char[wordArray.length]; // matriu per a una còpia de la paraula al revés
        int index = 0; // índex per a copia
        for (int j = wordArray.length - 1; j >= 0; j--) { // recorre la paraula de dreta (final) a esquerra (inici)
            copyArray[index] = wordArray[j]; // assigna el caràcter de la paraula a copia
            index++;
        }
        for (int j = 0; j < wordArray.length; j++) { // recorre la paraula mentre els caràcters són iguals
            if (wordArray[j] != copyArray[j]) { // si el caràcter de la paraula i de la còpia són diferents
                return false; // no és un palíndrom
            }
        }

        return true; // si recorre tota la paraula, llavors és un palíndrom
    }
}
