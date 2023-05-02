package Activity14;
import java.util.Scanner;

public class Overloaded {
    // Four instance variables – area, length, width and height (each of type double)
    private double area, length, width, height;

    // Scanner initialized
    private Scanner input = new Scanner(System.in);

    // Default constructor – initialize all four instance variables to 1
    public Overloaded() {
        this.area = this.length = this.width = this.height = 1;
    }

    // Constructor with four parameters
    public Overloaded(double area, double length, double width, double height) {
        this.area = area;
        this.length = length;
        this.width = width;
        this.height = height;
    }
    // Constructor with one parameter
    public Overloaded(double area) {
        this.area = area;
    }

    // Copy constructor – copy Box
    public Overloaded(Overloaded b) {
        this(b.area,b.length, b.width, b.height);
    }

    // inputArea, inputWidth, inputLength, and inputHeight methods that set the instance
    // variables based on user input have no parameters and do not return a value.
    public void inputWidth() {
        this.width = input.nextDouble();
    }

    public void inputLength() {
        this.length = input.nextDouble();
    }

    public void inputHeight() {
        this.height = input.nextDouble();
    }

    public void inputArea() {
        this.area = input.nextDouble();
    }

    // a displayDimensions method that displays the length X Width X height
    // (separated by “X”) and does not return a value.
    public void displayDimensions() {
        System.out.printf("Area: " + area + "Length: " +length + "Width: " + width + "Height: " + height);
    }

    // a calcVolume method that has no parameters and calculates the volume of the
    // box
    public double calcVolume() {
        return length * width * height;
    }
}
