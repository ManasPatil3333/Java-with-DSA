import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be search : ");
        int choice = sc.nextInt();
        int count = 0;
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] == choice) {
                System.out.printf("The index of %d in array is %d.",choice,i);
            }
            if (numbers[i] != choice) {
                count++;
            }
        }
        if (count == numbers.length) {
            System.out.println("The element to be search in array is not present!");
        }
        */
        /* 
        System.out.print("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int column = sc.nextInt();
        int matrix[][] = new int[row][column];
        for (int i=0; i<row; i++) {
            for (int j=0; j<column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        } 
        for (int i=0; i<row; i++) {
            for (int j=0; j<column; j++) {
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        } 
        System.out.print("Enter the element to find in array : ");
        int choice = sc.nextInt();
        int count = 0;
        for (int i=0; i<row; i++) {
            for (int j=0; j<column; j++) {
                if (matrix[i][j] == choice) {
                    System.out.printf("The index of %d in array is (%d,%d).\n",choice,i,j);
                }
                if (matrix[i][j] != choice) {
                    count++;
                }
            }
            if (count == matrix.length) {
                System.out.println("The element to be search in array is not present!");
            }
        }
        */
    }
}
