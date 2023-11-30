package Teoria;

public class DemoMutables {

    public static void main (String[] args){

        String[] demo = {"uno", "dos", "tres", "cuatro", "cinco"};

        System.out.print("Inicio: ");
        for (String s : demo) {
            System.out.print("[" + s + "] ");
        }
        System.out.print("\n");

        // Llamo al método que modifica el array, pero no recojo el return de ese método
        comprobacionMutabilidad(demo);

        // Aunque no he recogido su resultado, el array original se ha modificado
        System.out.print("Fin: \t");
        for (String s : demo) {
            System.out.print("[" + s + "] ");
        }
    }

    public static String[] comprobacionMutabilidad(String[] array){

        array[array.length - 1] = "error";

        System.out.print("Método: ");
        for (String s : array) {
            System.out.print("[" + s + "] ");
        }
        System.out.print("\n");
        return array;
    }
}
