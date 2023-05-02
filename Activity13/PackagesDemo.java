package Activity13;

import java.util.Scanner;

public class PackagesDemo {
    public double one, two;
    private double three, four;

    // Scanner initialized
    private Scanner input = new Scanner(System.in);

    // Default constructor – initialize all four instance variables to 1
    public PackagesDemo() {
        this.one = this.two = this.three = this.four = 1;
    }

    // Constructor with four parameters
    public PackagesDemo(double one, double two, double three, double four) {
        this.one = Double.parseDouble("1");
        this.two = Double.parseDouble("2");
        this.three = three;
        this.four = Double.parseDouble("4");
    }
    // Default modifier
    // Will throw error
    public void displayOne() {
        System.out.printf("First value: " + one);
    }

    // Public modifier
    // Will throw error
    public static void displayThree(String[] main){

        // create an object of Data
        PackagesDemo d = new PackagesDemo();

        // access private variable and field from another class
        d.three = Double.parseDouble("3");
    }
    // Protected modifier
    // Will throw error
    public class displayTwo {
        // public variable
        public int two;

        // public method
        public void display() {
            System.out.println("I have " + two + " legs.");
        }
    }
    // Private modifier
    // Will throw error
    static class fourA
    {
        private void display()
        {
            System.out.println("GeeksforGeeks");
        }
    }

    class fourB {
        public static void main(String args[]) {
            fourA obj = new fourA();
            obj.display();
        }
    }
}
