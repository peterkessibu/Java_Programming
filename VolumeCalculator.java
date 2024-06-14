import java.util.Scanner;

public class VolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        double volume = (4 * Math.PI * radius * radius * radius) / 3;

        System.out.printf("The volume of the sphere is: %.2f%n", volume);
    }
}
//calculating the volume of a sphere by importing java utilites