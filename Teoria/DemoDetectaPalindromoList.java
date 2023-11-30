package Teoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoDetectaPalindromoList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String phrase;
        List<String> palindromesList;

        System.out.println("Introduzca una frase para detectar si contiene algún palíndromo: ");
        phrase = sc.nextLine();

        palindromesList = buscaPalindromos(phrase);
        if (palindromesList != null) {
            System.out.println("La frase introducida contiene los siguientes palíndromos: ");
            for(String word : palindromesList){
                System.out.println(word);
            }
        } else {
            System.out.println("La frase introducida no contiene palíndromos.");
        }
        System.exit(0);
    }

    public static List<String> buscaPalindromos(String phrase) {

        final String EMPTY = " ";

        if (phrase == null || phrase.isBlank()) {
            return null;
        }

        String[] wordsArray = phrase.split(EMPTY);

        // Queremos guardar cada palabra, en otro array para seguir manteniendo cada palabra por separado
        // ¿De qué tamaño declaro el array? No puedo declarar el array sin darle un tamaño
        // String[] palindromes = null;
        List<String> palindromesList = new ArrayList<String>();
        for (String word : wordsArray) {
            if (isPalindrome(word)) {
                // A palindromes no le puedo ir añadiendo elementos
                // palindromes.add(word);
                palindromesList.add(word);
            }
        }

        return !palindromesList.isEmpty() ? palindromesList : null;
    }

    public static boolean isPalindrome(String word) {
        if (word == null || word.isBlank()) {
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