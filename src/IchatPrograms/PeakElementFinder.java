package IchatPrograms;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PeakElementFinder {

    public static int findPeakElementIndex(int[] inputArrayNumbers) {

        if (inputArrayNumbers == null || inputArrayNumbers.length == 0) {
            throw new IllegalArgumentException("Array can not be null");
        }

        int leftIndexPointer = 0;
        int rightIndexPointer = inputArrayNumbers.length - 1;


        while (leftIndexPointer < rightIndexPointer) {

            int middleIndexPointer =
                    leftIndexPointer + (rightIndexPointer - leftIndexPointer) / 2;

            if (inputArrayNumbers[middleIndexPointer]
                    < inputArrayNumbers[middleIndexPointer + 1]) {

                leftIndexPointer = middleIndexPointer + 1;
            } else {
                rightIndexPointer = middleIndexPointer;
            }
        }

        return leftIndexPointer;
    }

    public static void main(String[] args) {

        try (Scanner scannerInputObject = new Scanner(System.in)) {

            System.out.print("Enter number of elements: ");
            int arraySizeValue = scannerInputObject.nextInt();

            if (arraySizeValue <= 0) {
                System.out.println("Array size must be > 0.");
                return;
            }

            int[] inputArrayNumbers = new int[arraySizeValue];

            System.out.println("Enter array elements:");
            for (int indexCounter = 0; indexCounter < arraySizeValue; indexCounter++) {
                inputArrayNumbers[indexCounter] = scannerInputObject.nextInt();
            }

            int peakElementIndexValue = findPeakElementIndex(inputArrayNumbers);


            System.out.println("Peak element value: " +
                    inputArrayNumbers[peakElementIndexValue]);
            System.out.println("Peak element index: " + peakElementIndexValue);

        } catch (InputMismatchException exceptionObject) {
            System.out.println("Enter integer values only.");
        } catch (IllegalArgumentException exceptionObject) {
            System.out.println(exceptionObject.getMessage());
        }
    }
}
