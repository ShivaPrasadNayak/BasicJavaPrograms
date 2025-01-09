import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        // Upper Part of Diamond
        for (int i = 1; i <= rows; i++) { // for rows
            // Inner loop for space
            for (int j = rows; j > i; j--) { // for columns
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        //lower part of diamond
        for (int i = rows-1; i >= 1; i--) { // for rows
            // Inner loop for space
            for (int j = rows; j > i; j--) { // for columns
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
