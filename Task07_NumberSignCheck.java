import java.util.Scanner;

public class Task07_NumberSignCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ədəd daxil edin: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " müsbətdir.");
        } else if (number < 0) {
            System.out.println(number + " mənfidir.");
        } else {
            System.out.println(number + " sıfırdır.");
        }

        scanner.close();
    }
}
