package EjerciciosVectores;

public class Intercambio {
    public static void intercambiar(int[] vec, int index1, int index2) {
        int temp = vec[index1];
        vec[index1] = vec[index2];
        vec[index2] = temp;
    }
}
