import java.util.Scanner;

public class ArraysTask6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ". ededi daxil edin: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nTers sira:");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
