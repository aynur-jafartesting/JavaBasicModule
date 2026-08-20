import java.util.Scanner;

public class Task05_RectangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Düzbucaqlının enini daxil edin: ");
        double width = scanner.nextDouble();

        System.out.print("Düzbucaqlının uzunluğunu daxil edin: ");
        double length = scanner.nextDouble();

        double area = width * length;
        double perimeter = 2 * (width + length);

        System.out.println();
        System.out.println("Sahə = " + area);
        System.out.println("Perimetr = " + perimeter);

        scanner.close();
    }
}
