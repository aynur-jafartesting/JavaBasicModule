import java.util.Scanner;

public class LoopsTask6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {

            System.out.print("Eded daxil edin (bitirmek ucun 0): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number < 0) {
                continue;
            }

            count++;
            sum += number;
        }

        double average = count > 0 ? (double) sum / count : 0;

        System.out.println("Say: " + count);
        System.out.println("Cem: " + sum);
        System.out.println("Ortalama: " + average);
    }
}
