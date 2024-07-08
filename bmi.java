import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kilogram(Kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in meters(m): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.3f%n", bmi);
        if (bmi < 18.50) {
            System.out.println("You are Underweight");
        } else if (bmi >= 18.50 && bmi < 25.00) {
            System.out.println("You are Normal");
        } else if (bmi >= 25.00 && bmi < 30.00) {
            System.out.println("You are Overweight");
        } else {
            System.out.println("You are Obese");
        }

        scanner.close();
    }
}
