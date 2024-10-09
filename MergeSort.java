import java.util.Scanner;

public class MergeSort {
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
        
        // Call the merge sort method to sort the array
        mergeSort(array, 0, n - 1);
        
        // Output the sorted array
        System.out.print("Sorted array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
    
    // Method to perform merge sort on the given array
    public static void mergeSort(int[] array, int left, int right) {
        // Check if the left index is less than the right index
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Recursively sort the first half
            mergeSort(array, left, mid);
            // Recursively sort the second half
            mergeSort(array, mid + 1, right);
            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }
    
    // Method to merge two sorted halves of the array
    public static void merge(int[] array, int left, int mid, int right) {
        // Calculate sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0; // Initial indexes of the first and second subarrays
        int k = left; // Initial index of the merged subarray
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray if any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray if any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
