import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();  // Take the size of the array as input

        int[] arr = new int[n];  // Declare an array of size 'n'

        // Prompt the user to input the elements of the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();  // Store each element in the array
        }

        // Call the insertionSort function to sort the array
        insertionSort(arr, n);

        // Display the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Function to perform insertion sort
    public static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // Current element to be placed in the sorted part
            int j = i - 1;

            // Shift elements of the sorted part that are greater than 'key' to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place 'key' in its correct position
            arr[j + 1] = key;
        }
    }
}
