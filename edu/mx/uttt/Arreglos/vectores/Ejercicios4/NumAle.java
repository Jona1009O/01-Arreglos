/*import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NumAle {
    private int[] numbers = new int[30];

    public NumAle() {
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(30) + 1; // Números entre 1 y 30
        }
    }

    public void showAnalysis() {
        Arrays.sort(numbers); // Ordena los números
        System.out.println("Números Generados: " + Arrays.toString(numbers));

        int max = numbers[numbers.length - 1];
        int min = numbers[0];
        System.out.println("Número más alto: " + max);
        System.out.println("Número más bajo: " + min);

        double media = Arrays.stream(numbers).average().orElse(0);
        System.out.println("Media: " + media);

        double mediana = numbers[(numbers.length - 1) / 2] + numbers[numbers.length / 2];
        mediana /= 2.0;
        System.out.println("Mediana: " + mediana);

        int moda = calcularModa(numbers);
        System.out.println("Moda: " + moda);

        // Contar y calcular el porcentaje de cada número del 1 al 10
        for (int i = 1; i <= 10; i++) {
            long count = Arrays.stream(numbers).filter(num -> num == i).count();            
            double porcentaje = (count / 30.0) * 100;
            System.out.printf("Cantidad de %d: %d, Porcentaje: %.1f%%\n", i, count, porcentaje);
        }
    }

    private int calcularModa(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int moda = nums[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                moda = entry.getKey();
            }
        }
        return moda;
    }

    public static void main(String[] args) {
        NumAle numAle = new NumAle();
        numAle.showAnalysis();
    }
}*/