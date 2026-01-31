package TasksOfAnudeep;
import java.util.Arrays;
import java.util.Random;

public class SortPerformance {

    public static void main(String[] args) {
        int size = 1000;
        int[] original = new int[size];
        Random random = new Random();

       
        for (int i = 0; i < size; i++) {
            original[i] = random.nextInt(10000);
        }

       
        int[] arrBubble = original.clone();
        int[] arrSelection = original.clone();
        int[] arrInsertion = original.clone();

       
        long startBubble = System.nanoTime();
        bubbleSort(arrBubble);
        long bubbleTime = System.nanoTime() - startBubble;

        
        long startSelection = System.nanoTime();
        selectionSort(arrSelection);
        long selectionTime = System.nanoTime() - startSelection;

      
        long startInsertion = System.nanoTime();
        insertionSort(arrInsertion);
        long insertionTime = System.nanoTime() - startInsertion;

        
        System.out.println("--- Sort Performance for " + size + " elements ---");
        System.out.println("Bubble Sort:    " + bubbleTime + " ns (" + (bubbleTime / 1000000.0) + " ms)");
        System.out.println("Selection Sort: " + selectionTime + " ns (" + (selectionTime / 1000000.0) + " ms)");
        System.out.println("Insertion Sort: " + insertionTime + " ns (" + (insertionTime / 1000000.0) + " ms)");
    }

  
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

   
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

   
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
