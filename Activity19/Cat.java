package Activity19;

public class Cat extends Inheritance {
    public String catColor = "Grey";    // Cat attribute

    public static void main(String[] args) {

        // Create a myCar object
        Cat myCat = new Cat();

        // Call the noise() method (from the Animal class) on the myCat object
        myCat.noise();

        // Display the value of the species attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCat.animal + " " + myCat.catColor);
    }
}
