package EjerciciosVectores.solucionesPropuestosClase;

/**
 * @author Vicent P.
 */
public class UbicacionesEdadesNombres {
    static final String[][] CLASS_DAW = {{"Ricardo", "Jesús", "Victor", "Guillem", "Pablo", "Érika", "Filip"},{"Arturo", "Fernando", "Kevin", "Tavi", "Miguel", "Raul", "Hugo R", "Alberto"}, {"Izan", "Jordi", "Hugo B", "Alex", "Vicent"}};
    static final int[][] AGES_DAW= {{20, 20, 19, 19, 27, 17, 19},{31, 29, 24, 21, 19, 19, 20, 19},{18, 20, 18, 23, 18}};

    public static void main(String[] args){

        showYounger();
        showOlder();
    }
    public static void showYounger() {
        int lowAge= 40;
        int[] savePosition = new int [2];
        for (int i = 0; i < AGES_DAW.length; i++) {
            for(int j = 0; j < AGES_DAW[i].length; j++) {
                if (lowAge > AGES_DAW[i][j]){
                    lowAge = AGES_DAW[i][j];
                    savePosition[0] = i;
                    savePosition[1] = j;
                }
            }
        }
        int fila = savePosition[0] + 1;
        int silla = savePosition[1] + 1;
        System.out.printf("La persona menor, se situa en la fila %d silla %d su nombre es %s y tiene %d años\n\n", fila, silla, CLASS_DAW[savePosition[0]][savePosition[1]], lowAge);
    }
    public static void showOlder() {
        int highAge= 0;
        int[] savePosition = new int [2];
        for (int i = 0; i < AGES_DAW.length; i++) {
            for(int j = 0; j < AGES_DAW[i].length; j++) {
                if (highAge < AGES_DAW[i][j]){
                    highAge = AGES_DAW[i][j];
                    savePosition[0] = i;
                    savePosition[1] = j;
                }
            }
        }
        int fila = savePosition[0] + 1;
        int silla = savePosition[1] + 1;
        System.out.printf("La persona mayor, se situa en la fila %d silla %d su nombre es %s y tiene %d años\n", fila, silla, CLASS_DAW[savePosition[0]][savePosition[1]], highAge);
    }
}
