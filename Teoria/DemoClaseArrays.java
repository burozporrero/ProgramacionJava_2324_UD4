package Teoria;

import java.util.Arrays;

public class DemoClaseArrays {
    public static void main(String[] args) {

        // EJERCICIO 1: toString
        String[] mat1 = {"uno", "dos", "tres", "cuatro", "cinco"};
        System.out.println("mat1 conté els valors >>> " + Arrays.toString(mat1));



        // EJERCICIO 2: copyOf
        String[] mat2 = {"uno", "tres", "cuatro", "dos", "cinco"};
        String[] copia2 = Arrays.copyOf(mat2, 8); // afegirà 3 nuls fins a tindre 8 elements de tipus String
        System.out.println("valors de copia2 >>> " + Arrays.toString(copia2));

        copia2 = Arrays.copyOf(copia2, 3); // elimina els elements des de l’índex 3 fins al final
        System.out.println("valors de copia2 >>> " + Arrays.toString(copia2));



        // EJERCICIO 3:
        String[] mat3 = {"uno", "tres", "cuatro", "dos", "cinco"};
        String[] copia3 = Arrays.copyOfRange(mat3, 2,4);
        System.out.println("valors de copia3 >>> " + Arrays.toString(copia3));
        copia3 = Arrays.copyOfRange(mat3, 2,5);
        System.out.println("valors de copia3 >>> " + Arrays.toString(copia3));
        copia3 = Arrays.copyOfRange(mat3, 2,7);
        System.out.println("valors de copia3 >>> " + Arrays.toString(copia3));



        // EJERCICIO 4:
        String[] v1 = {"uno", "dos", "tres", "cuatro", "cinco"};
        String[] v2 = {"uno", "dos", "tres", "cuatro", "cinco"};
        String[] v3 = {"uno", "tres", "cuatro", "dos", "cinco"};
        System.out.println("v1.equals(v2) >>> " + v1.equals(v2)); // és false, són objectes diferents
        System.out.println("Arrays.equals(v1, v2) >>> " + Arrays.equals(v1, v2)); // és true, les matrius tenen
        // els mateixos objectes i en les mateixes posicions
        System.out.println("Arrays.equals(v1, v2) >>> " + Arrays.equals(v1, v3)); // és false, les matrius tenen
        // els mateixos objectes, però en posicions diferents
        // Visualitza v1.equals



        // EJERCICIO 5:
        int[] matriu = {3, 5, -9, 48, -54, 26, -47, 0, 1, -21, 14, -15, 37, 19, 11, -2, 13, 46, 21};
        System.out.println(Arrays.toString(matriu)); // mostra els enters de la matriu
        Arrays.sort(matriu); // ordena els enters de la matriu
        System.out.println(Arrays.toString(matriu));

        // EJERCICIO 6:
        int[] vector = {3, 5, -9, 48, -54, 26, -47, 0, 1, -21, 14, -15, 37, 19, 11, -2, 13, 46, 21};
        System.out.println(Arrays.toString(vector)); // mostra els enters de la matriu
        Arrays.sort(vector, 5, 14); // ordena els enters de la matriu
        System.out.println(Arrays.toString(vector));
    }
}
