package Activity8;
import java.util.Scanner;
public class TestAverage {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        //Variables
        int numStudents;
        int numTest;
        int testScore;
        double average;

        //Prompts user for number of students
        System.out.println("Enter Number of Students: ");
        numStudents = Integer.parseInt(input.nextLine());

        //Prompts user for number of tests per student
        System.out.println("Enter Number of tests per student: ");
        numTest = Integer.parseInt(input.nextLine());

        //Prints number of tests
        for (int i = 1; i <= numStudents; i++) {
            testScore = 0;
            System.out.printf("Student number %d\n", i);
            System.out.println("-".repeat(14));
            //Averages test scores
            for (int j = 0; j < numTest; j++) {
                System.out.printf("Enter test score: ");
                average = Integer.parseInt(input.nextLine());
                testScore += average;
            }
            //Prints test average
            System.out.printf("The average test score is " + "%d\n", i, testScore);
        }
    }
}

