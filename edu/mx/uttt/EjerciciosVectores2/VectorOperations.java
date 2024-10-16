package EjerciciosVectores2;

public class VectorOperations {
    
        // Suma de Vectores
        public static int[] sumaVectores(int[] vec1, int[] vec2) {
            if (vec1.length != vec2.length) return null;
            int[] resultado = new int[vec1.length];
            for (int i = 0; i < vec1.length; i++) {
                resultado[i] = vec1[i] + vec2[i];
            }
            return resultado;
        }
    
        // Producto Escalar
        public static int productoEscalar(int[] vec1, int[] vec2) {
            if (vec1.length != vec2.length) return -1;
            int resultado = 0;
            for (int i = 0; i < vec1.length; i++) {
                resultado += vec1[i] * vec2[i];
            }
            return resultado;
        }
    
        // Inverso del Vector
        public static int[] vectorInverso(int[] vec) {
            int[] resultado = new int[vec.length];
            for (int i = 0; i < vec.length; i++) {
                resultado[vec.length - 1 - i] = vec[i];
            }
            return resultado;
        }
    
        // Multiplicación de Escalar por un Vector
        public static int[] multiplicacionEscalar(int escalar, int[] vec) {
            int[] resultado = new int[vec.length];
            for (int i = 0; i < vec.length; i++) {
                resultado[i] = escalar * vec[i];
            }
            return resultado;
        }
    
        // Valor Máximo y Mínimo
        public static int[] maximoMinimo(int[] vec) {
            int max = vec[0];
            int min = vec[0];
            for (int val : vec) {
                if (val > max) max = val;
                if (val < min) min = val;
            }
            return new int[]{max, min};
        }
    
        // Eliminar Duplicados
        public static int[] sinDuplicados(int[] vec) {
            return java.util.Arrays.stream(vec).distinct().toArray();
        }
    
        // Intercambiar Elementos
        public static void intercambio(int[] vec, int index1, int index2) {
            int temp = vec[index1];
            vec[index1] = vec[index2];
            vec[index2] = temp;
        }
    
        // Encontrar Números Primos
        public static int[] numerosPrimos(int[] vec) {
            return java.util.Arrays.stream(vec)
                    .filter(VectorOperations::esPrimo)
                    .toArray();
        }
    
        private static boolean esPrimo(int num) {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
    
        // Encontrar Pares
        public static int[] numerosPares(int[] vec) {
            return java.util.Arrays.stream(vec)
                    .filter(n -> n % 2 == 0)
                    .toArray();
        }
    
        // Encontrar Impares
        public static int[] numerosImpares(int[] vec) {
            return java.util.Arrays.stream(vec)
                    .filter(n -> n % 2 != 0)
                    .toArray();
        }
    }