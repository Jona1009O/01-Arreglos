package EjerciciosVectores;

public class VectorInverso {
    public static int[] obtenerInverso(int[] vec) {
        int[] resultado = new int[vec.length];
        for (int i = 0; i < vec.length; i++) {
            resultado[vec.length - 1 - i] = vec[i];
        }
        return resultado;
    }
}
