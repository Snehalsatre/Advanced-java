package TasksOfAnudeep;
public class LinearSearch {
    public static void main(String[] args) {
       
        int[] numbers = {12, 45, 7, 23, 56, 89, 3};
        int target = 23;
        
       
        int resultIndex = findElement(numbers, target);
        
        
        if (resultIndex != -1) {
            System.out.println("Element " + target + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + target + " was not found in the array.");
        }
    }

   
    public static int findElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
           
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }
}