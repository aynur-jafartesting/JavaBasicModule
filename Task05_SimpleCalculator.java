import java.util.Scanner;

public class Task05_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        double num1 = scanner.nextDouble();

        System.out.print("İkinci ədədi daxil edin: ");
        double num2 = scanner.nextDouble();

        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

        scanner.close();
    }
}
