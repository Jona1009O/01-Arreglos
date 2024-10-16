package EjerciciosVectores;

public class MultiplicacionEscalar {
    public static int[] multiplicar(int escalar, int[] vec) {
        int[] resultado = new int[vec.length];
        for (int i = 0; i < vec.length; i++) {
            resultado[i] = escalar * vec[i];
        }
        return resultado;
    }
}
