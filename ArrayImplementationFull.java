import java.util.Scanner; 

public class ArrayImplementationFull { 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in); 
        
        // Prompt user for the number of elements in the array
        System.out.print("Enter the number of elements: "); 
        int n = scan.nextInt(); 
        
        int[] array = new int[n]; 
        
        // Prompt user to input the elements of the array
        System.out.println("Enter " + n + " integers:"); 
        for (int i = 0; i < n; i++) { 
            array[i] = scan.nextInt(); 
        }
        
        // Display a message before printing the array
        System.out.println("You entered:"); 
        for (int i = 0; i < n; i++) { 
            System.out.print(array[i] + " "); 
        }
        
        scan.close(); 
    }
}
