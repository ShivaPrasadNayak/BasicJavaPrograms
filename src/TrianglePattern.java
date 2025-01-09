import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) { // for rows
            // Inner loop for stars
            for (int j = 1; j <= i; j++) { // for columns
                System.out.print( j +" ");
            }
            System.out.println();  // Move to the next line
        }
    }
}
// 1st iteration i = 1, j = 1, print 1 star
// 2nd iteration i = 2, j = 1, print 1 star
// 2nd iteration i = 2, j = 2, print 2 stars