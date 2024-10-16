package MetodosOrdenamiento;

public class Sort {
    private int[] arr;
    private int tamanio;

    public Sort(int tamanio) {
        if (tamanio >= 2) {
            this.tamanio = tamanio;
            arr = new int[this.tamanio];
        } else {
            this.tamanio = 2;
            arr = new int[this.tamanio];
        }
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        if (arr.length == this.arr.length) {
            for (int i = 0; i < this.tamanio; i++) {
                this.arr[i] = arr[i];
            }
        }
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        if (tamanio >= 2) {
            this.tamanio = tamanio;
        }
    }

    // Método de ordenamiento Burbuja Ascendente
    public void burbleAsc() {
        boolean swapped;
        for (int i = 0; i < tamanio - 1; i++) {
            swapped = false;
            for (int j = 0; j < tamanio - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // Método de ordenamiento Burbuja Descendente
    public void burbleDesc() {
        boolean swapped;
        for (int i = 0; i < tamanio - 1; i++) {
            swapped = false;
            for (int j = 0; j < tamanio - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // Método para imprimir los elementos del arreglo en una sola línea
    public void imprimir() {
        int i = 0;
        while (i < arr.length) {
            System.out.print("| " + arr[i]);
            i++;
        }
        System.out.println();
    }

    // Método de ordenamiento por Selección
    public void selectionSort() {
        for (int i = 0; i < tamanio - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Método alternativo para imprimir en múltiples líneas
    public void imprimir2() {
        for (int item : arr) {
            System.out.println("| " + item);
        }
    }

    // Método principal para pruebas
    public static void main(String[] args) {
        Sort sort = new Sort(5);
        int[] arreglo = {34, 7, 23, 32, 5};
        sort.setArr(arreglo);

        System.out.println("Arreglo original:");
        sort.imprimir();

        System.out.println("\nOrdenamiento Burbuja Ascendente:");
        sort.burbleAsc();
        sort.imprimir();

        System.out.println("\nOrdenamiento Burbuja Descendente:");
        sort.burbleDesc();
        sort.imprimir();

        System.out.println("\nOrdenamiento por Selección:");
        sort.selectionSort();
        sort.imprimir();
    }
}
