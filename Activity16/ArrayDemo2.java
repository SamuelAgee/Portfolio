package Activity16;
import java.util.Scanner;
public class ArrayDemo2 {
    public static void main(String[] args)
    {
        // Integer array named array1
        int[][] array1 = { {1, 2, 3},
                {4, 5, 6} };

        // Integer array named array2
        int[][] array2 = { {1, 2},
                {3},
                {4, 5, 6} };

        // Integer array named array3
        int[][] array3 = { {1, 2, 3},
                {4, 5, 6} };

        // Integer array named array4
        int[][] array4 = { {1, 2},
                {3},
                {4, 5, 6} };

        //for each --> going the array1
        for (int[] row : array1)
        {
            for (int column : row)
            {
                System.out.printf("%d ", column);
            }
            System.out.println();
        }
        System.out.println();

        //for each --> going the array2
        for (int[] row : array2)
        {
            for (int column : row)
            {
                System.out.printf("%d ", column);
            }
            System.out.println();
        }
        //for each --> going the array3
        for (int[] row : array3)
        {
            for (int column : row)
            {
                System.out.printf("%d ", column);
            }
            System.out.println();
        }
        System.out.println();

        //for each --> going the array4
        for (int[] row : array4)
        {
            for (int column : row)
            {
                System.out.printf("%d ", column);
            }
            System.out.println();
        }
    }
}
