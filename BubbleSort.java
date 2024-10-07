import java.util.Scanner;
public class BubbleSort{
    public static void main (String args []){
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter a size of the array: ");
        int size = scan.nextInt();

        int arr [] = new int [size];

        for (int i = 0; i<arr.length; i++){
            System.out.print("Enter element: ");
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i<arr.length;i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr [i] > arr[j]){
                    int langga = arr [i];
                    arr[i] = arr[j];
                    arr[j] = langga;
                }
            }
        }
        System.out.print("Sorted array in acsending order: ");
        for (int i = 0; i < arr.length; i++ ){
            System.out.print( arr[i]+ " ");
        }

        for (int i = 0; i<arr.length;i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr [i] < arr[j]){
                    int langga = arr [i];
                    arr[i] = arr[j];
                    arr[j] = langga;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted array in descending order: ");
        for (int i = 0; i < arr.length; i++ ){
            System.out.print( arr[i]+ " ");
        }

    }
}