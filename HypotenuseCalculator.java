import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of base: ");
        //takes input
        double base = scanner.nextDouble();
        //read the input by the user in a form of an integer with double as the data type
        System.out.print("Enter the value of height: ");
        double  height = scanner.nextDouble();
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height,2));
        //Calculates the hypotenuse based on the input
        System.out.printf("The hypotenuse is: %.2f%n", hypotenuse);
        //prints out the output
    }
}

//this calculates the hypotenuse of a triange