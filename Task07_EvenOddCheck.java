import java.util.Scanner;

public class Task07_EvenOddCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ədəd daxil edin: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " cütdür.");
        } else {
            System.out.println(number + " təkdir.");
        }

        scanner.close();
    }
}
