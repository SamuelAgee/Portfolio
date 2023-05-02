package Activity16;

public class ArrayDemo3 {
    public static void main(String[] args)
    {
        // Integer 2D array named array1
        int[][] array1 = { {1, 2, 3},
                {4, 5, 6} };

        // Integer 2D array named array2
        int[][] array2 = { {1, 2},
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
    }
}
