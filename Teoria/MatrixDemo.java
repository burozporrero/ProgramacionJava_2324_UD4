package Teoria;

public class MatrixDemo {
    public static void main (String[] args){
        demo1();
    }

    /**
     * Ejemplo de Crear, inicializar y acceder a una matriz
     */
    public static void demo1(){
        String[][] demo = new String[10][10];

        for (int fila = 0 ; fila < demo.length ; fila++){
            for (int columna = 0 ; columna < demo[fila].length ; columna++){
                demo[fila][columna] = "[" + fila + "][" + columna + "]";
                System.out.print(demo[fila][columna] + "\t");
            }
            System.out.print("\n");
        }
    }
}
