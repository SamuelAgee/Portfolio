package Activity9;
import java.util.Scanner;
import java.util.Random;
public class ESP {
    public static void main (String [] args) {
        // Variables
        int	randomNumber,
                total = 1,   // Since there will always be one try
                userChoice;
        String color = "";

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Create a Random object
        Random randy = new Random();

        System.out.println("The computer will test your ESP skills by randomly generating one of the following five colors: \n"
                + "Red = 1, Green = 2, Blue = 3, Orange = 4, Yellow = 5.\n"
                + "Try to guess which color the computer is thinking of by entering the corresponding number. Good luck!");

        // Loop 10 times
        for(int i = 1; i <= 10; i++)
        {

            // Create a random variable with the Random object
            randomNumber = randy.nextInt(5);

            // Prompt user for color choice
            System.out.println("Enter the number of your color choice:");
            userChoice = input.nextInt();

            switch (randomNumber)
            {
                case 1:
                {
                    color = "Red";
                    break;
                }
                case 2:
                {
                    color = "Green";
                    break;
                }
                case 3:
                {
                    color = "Blue";
                    break;
                }
                case 4:
                {
                    color = "Orange";
                    break;
                }
                case 5:
                {
                    color = "Yellow";
                    break;
                }
                default:
                    System.out.println("Enter a number between 1 and 5.");
            }

            // Create conditional statements to advance total correct guess count
            if (userChoice == randomNumber)
            {
                System.out.println("Correct!");
                total += 1;
            }
            else
            {
                System.out.println("The correct answer was " + color
                        + ", try again!");
            }
        }

        System.out.println("After 10 tries, you got the color correct " + total + " times.");
    }
}

