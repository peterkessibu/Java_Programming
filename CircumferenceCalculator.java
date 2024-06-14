import java.util.Scanner;

public class CircumferenceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;

        System.out.printf("The circumference of the circle is: %.4f%n", circumference);
    }
}
//Calculatinng the circumference of a circle in 4 decimal places