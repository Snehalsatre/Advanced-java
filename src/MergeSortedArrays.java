import java.util.InputMismatchException;
import java.util.Scanner;

public class MergeSortedArrays {

   
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

      
        if (nums1 == null || nums2 == null) {
            throw new IllegalArgumentException("Arrays cannot be null.");
        }

        if (m < 0 || n < 0 || nums1.length < m + n) {
            throw new IllegalArgumentException("Invalid array sizes.");
        }

        int i = m - 1;      
        int j = n - 1;      
        int k = m + n - 1;  

        
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter number of elements in nums1 (m): ");
            int m = sc.nextInt();

            System.out.print("Enter number of elements in nums2 (n): ");
            int n = sc.nextInt();

            if (m < 0 || n < 0) {
                System.out.println("Sizes must be non-negative.");
                return;
            }

            int[] nums1 = new int[m + n];
            int[] nums2 = new int[n];

            System.out.println("Enter sorted elements of nums1:");
            for (int i = 0; i < m; i++) {
                nums1[i] = sc.nextInt();
            }

            System.out.println("Enter sorted elements of nums2:");
            for (int i = 0; i < n; i++) {
                nums2[i] = sc.nextInt();
            }

            merge(nums1, m, nums2, n);

            System.out.println("Merged Sorted Array:");
            for (int num : nums1) {
                System.out.print(num + " ");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
