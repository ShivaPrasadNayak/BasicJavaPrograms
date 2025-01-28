import java.util.Scanner;

public class ArrayExample {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[4][4];

        System.out.println("Enter elements of 4x4 array: ");
        // Input elements of the array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Display the array
        System.out.println("The 4x4 array is: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //calculate sum of each row
        int sum ;
        for (int i = 0; i < 4; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of elements of row " + i + " = " + sum);
        }
    }
}