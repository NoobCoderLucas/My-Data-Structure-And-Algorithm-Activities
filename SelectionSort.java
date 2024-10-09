import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        
        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        
        // Call the selection sort method to sort the array
        selectionSort(array);
        
        // Output the sorted array
        System.out.println("Sorted array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
    
    // Method to perform selection sort on the given array
    public static void selectionSort(int[] array) {
        int n = array.length;
        // Loop through each element of the array
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the current index is the minimum
            // Find the index of the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
