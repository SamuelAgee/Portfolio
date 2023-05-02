package Activity16;
import java.util.Scanner;
public class ArrayDemo1 {
    public static void main(String[] args) {
        // Scanner class
        Scanner scanner = new Scanner(System.in);

        int totalTestCases, eachTestCaseValues;

        // Takes TestCases as integer number
        totalTestCases = scanner.nextInt();

        // Makes array as new values for total testCases
        int[][] arrayMain = new int[totalTestCases][];

        // For loop takes input of values in each TestCase
        for (int i = 0; i < arrayMain.length; i++) {
            eachTestCaseValues = scanner.nextInt();
            arrayMain[i] = new int[eachTestCaseValues];
            for (int j = 0; j < arrayMain[i].length; j++) {
                arrayMain[i][j] = scanner.nextInt();
            }
        }


        // For loop starts returning values
        for (int i = 0; i < arrayMain.length; i++) {

            // Initializes number of even & odd numbers to zero
            int nEvenNumbers = 0, nOddNumbers = 0;

            // Prints TestCase number with total number of its arguments
            System.out.println("TestCase " + i + " with "
                    + arrayMain[i].length
                    + " values:");
            for (int j = 0; j < arrayMain[i].length; j++) {
                System.out.print(arrayMain[i][j] + " ");

                // Even and odd counter updated
                if (arrayMain[i][j] % 2 == 0) {
                    nEvenNumbers++;
                } else {
                    nOddNumbers++;
                }
            }
            System.out.println();

            // Prints total numbers of even and odd
            System.out.println(
                    "Total Even numbers: " + nEvenNumbers
                            + ", Total Odd numbers: " + nOddNumbers);
        }
    }
}