import java.util.Arrays;
import java.util.Scanner;

public class SortAndCalculateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArray = getArrayInput(scanner);

        Arrays.sort(myArray);

        int sum = calculateSum(myArray);
        double average = calculateAverage(myArray);

        System.out.println("Sorted array: " + Arrays.toString(myArray));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }

    private static int[] getArrayInput(Scanner scanner) {
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    private static double calculateAverage(int[] array) {
        int sum = calculateSum(array);
        return (double) sum / array.length;
    }
}