import java.util.*;

public class TwoD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][4];

        System.out.println("Enter the values:");

        for (int row = 0; row < arr.length; row++) {
            System.out.println("Enter 4 values for row " + (row + 1));
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        System.out.println("The 2D array is:");

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}