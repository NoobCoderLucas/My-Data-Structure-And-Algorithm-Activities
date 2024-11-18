import java.util.Scanner;

public class QuickSort {
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
        
        // Call the quick sort method to sort the array
        quickSort(array, 0, n - 1);
        
        // Output the sorted array
        System.out.print("Sorted array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
    
    // Method to perform quick sort on the given array
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(array, low, high);
            
            // Recursively sort the elements before and after partition
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }
    
    // Method to partition the array
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choosing the last element as pivot
        int i = low - 1; // Index of smaller element
        
        // Rearrange the array based on the pivot
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++; // Increment index of smaller element
                swap(array, i, j); // Swap current element with the smaller element
            }
        }
        // Swap the pivot element to its correct position
        swap(array, i + 1, high);
        return i + 1; // Return the pivot index
    }
    
    // Method to swap two elements in the array
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
