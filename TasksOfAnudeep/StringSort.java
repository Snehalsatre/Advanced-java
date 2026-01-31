package TasksOfAnudeep;
import java.util.Arrays;
public class StringSort {
    public static void main(String[] args) {
      
        String[] arr1 = {"Banana", "Apple", "Dragonfruit", "Cherry", "Elderberry"};
        
       
        String[] arr2 = arr1.clone();

        System.out.println("Original Array: " + Arrays.toString(arr1));

       
        bubbleSort(arr1);
        System.out.println("Sorted (Bubble Sort): " + Arrays.toString(arr1));

       
        Arrays.sort(arr2);
        System.out.println("Sorted (Arrays.sort): " + Arrays.toString(arr2));
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                  
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}