import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        // Get user input for an array and a target value
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter the target value to search: ");
        int target = scan.nextInt();

        // Perform linear search for the target value
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }

        scan.close();
    }

    // Method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }
}
