package Teoria;

import java.util.Random;

public class ArraysDemo {

    public static void main (String[] args){
        //demo1();
        demo2();
    }

    /**
     * Ejemplo de Crear, inicializar y acceder a un array
     * Error: ArrayIndexOutOfBoundsException
     */
    public static void demo1(){
        int[] demo = new int[10];

        for (int i = 0 ; i < 10 ; i++){
            demo[i] = i;
        }

        for (int i = 0 ; i < 10 ; i++){
            System.out.print(i < 9 ? demo[i]  + "," : demo[i]  + "\n");
        }

        System.out.println("Longitud del array: " + demo.length);

        // Probando ArrayIndexOutOfBoundsException
        for (int i = 0 ; i <= demo.length ; i++){
            System.out.print(i < 9 ? demo[i]  + "," : demo[i]  + "\n");
        }
    }

    /**
     * Ejemplo de ForEach y de clase Random
     */
    public static void demo2(){

        String[] demo = {"uno", "dos", "tres", "cuatro", "cinco"};
        for (String s : demo) {
            System.out.println(s);
        }

        int[] demoInt = new int[100];
        Random random = new Random();

        // En este caso no puedo utilizar ForEach ya que no tengo el índice para acceder
        /*
        for (int elemento : demoInt){
            demoInt[i] = random.nextInt(1000, 2000);
            System.out.println(" [" + i + "] ");
        }
         */
        // Es necesario acceder con bucle clásico
        for (int i = 0 ; i < demoInt.length ; i++){
            demoInt[i] = random.nextInt(1000, 2000);
            System.out.println(" [" + i + "] ");
        }
    }
}
