package Activity15;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class ArrayFromInput {
    //Array with integers
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Prompt user input
        System.out.println("How many numbers do you want to enter?");
        int num = input.nextInt();

        int array[] = new int[num];

        System.out.println("Enter the " + num + " numbers now.");

        for (int i = 0 ; i < array.length; i++ ) {
            array[i] = input.nextInt();
        }

        //Print header and calls array list
        System.out.println("These are the numbers you have entered.");
        printArray(array);

        input.close();

    }

    //Prints the elements in an array
    public static void printArray(int arr[]){

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Array with strings
    public static void string(String[] args) {
        List<String> list = new ArrayList<String>();
        Scanner stdin = new Scanner(System.in);

        do {
            System.out.println("Current list is " + list);
            System.out.println("Add more? (y/n)");
            if (stdin.next().startsWith("y")) {
                System.out.println("Enter : ");
                list.add(stdin.next());
            } else {
                break;
            }
        } while (true);
        stdin.close();
        System.out.println("List is " + list);
        String[] arr = list.toArray(new String[0]);
        System.out.println("Array is " + Arrays.toString(arr));
    }
}
