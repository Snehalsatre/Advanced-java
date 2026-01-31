package StreamAPI;
public class InsertionSortExample {

    /**
     * Sorts an array of integers using the Insertion Sort algorithm.
     * @param arr The array to be sorted.
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        // Start from the second element (index 1) as the first is considered sorted
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than the key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // Place the key in its correct position in the sorted subarray
            arr[j + 1] = key;
        }
    }

    /**
     * Utility method to print the array elements.
     * @param arr The array to be printed.
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the insertion sort implementation
    public static void main(String[] args) {
        int[] data = { 12, 11, 13, 5, 6 };
        System.out.println("Original array:");
        printArray(data);

        insertionSort(data);

        System.out.println("Sorted array:");
        printArray(data);
    }
}
