package Teoria;

public class DemoCopiaArrays {
    public static void main (String[] args){

        String[] demo = {"uno", "dos", "tres", "cuatro", "cinco"};

        System.out.print("Inicio: \t\t");
        for (String s : demo) {
            System.out.print("[" + s + "] ");
        }
        System.out.print("\n");

        String[] demoCopia = new String[demo.length];
        System.arraycopy(demo,0,demoCopia, 0,demo.length);

        // Llamo al método que modifica el array, pero no recojo el return de ese método
        comprobacionMutabilidad(demoCopia);

        // Aunque no he recogido su resultado, el array original se ha modificado
        System.out.print("Fin Demo: \t\t");
        for (String s : demo) {
            System.out.print("[" + s + "] ");
        }
        System.out.print("\nFin DemoCopia: \t");
        for (String s : demoCopia) {
            System.out.print("[" + s + "] ");
        }
    }

    public static String[] comprobacionMutabilidad(String[] array){

        array[array.length - 1] = "error";

        System.out.print("Método: \t\t");
        for (String s : array) {
            System.out.print("[" + s + "] ");
        }
        System.out.print("\n");
        return array;
    }
}
