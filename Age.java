import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age >= 18 && age <= 70) {
            System.out.println("You are old enough to vote!");
        }
        else if (age < 18){
            System.out.println("You are not old enough to vote.");
        }
        else{
            System.out.println("You are a Senior Citizen and not eligible to vote.");
        }
    }
}