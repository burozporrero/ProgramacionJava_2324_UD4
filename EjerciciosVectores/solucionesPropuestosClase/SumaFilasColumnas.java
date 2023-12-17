package EjerciciosVectores.solucionesPropuestosClase;

/**
 * @author Vicent P.
 */
public class SumaFilasColumnas {
    public static void main(String[] args) {
        System.out.println("**Suma filas y columnas**");

        int[][] array = new int[4][5];
        int[] rows = new int[4];
        int[] columns = new int[5];

        fillArray(array);
        addRows(array, rows);
        addColumns(array, columns);
        int all = addAll(rows);
        showArray(array, rows, columns, all);
    }
    public static void fillArray(int[][] array){
        for(int i = 0; i < array.length;i++) {
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = (int) Math.round(Math.random() * 9);
            }
        }
    }
    public static void addRows(int[][] array, int[] rows){
        for(int i = 0; i < array.length;i++) {
            for(int j = 0; j < array[i].length; j++){
                rows[i] += array[i][j];
            }
        }
    }
    public static void addColumns(int[][] array, int[] columns){
        for (int[] ints : array) {
            for (int i = 0; i < ints.length; i++) {
                columns[i] += ints[i];
            }
        }
    }
    public static int addAll(int[] rows){
        int allRows = 0;

        for (int row : rows) {
            allRows += row;
        }
        return allRows;
    }
    public static void showArray(int[][] array, int[] rows, int[] columns, int all){
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("\t" + array[i][j]);
            }
            System.out.print("\t\t" + rows[i]);
            System.out.print("\n");
        }
        System.out.print("\n");
        for(int n : columns) {
            System.out.print("\t" + n);
        }
        System.out.print("\t\t" + all);
    }
}
