import java.util.Scanner;

public class ArraysTask5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {12, 25, 8, 44, 19, 60};

        System.out.print("Eded daxil edin: ");
        int target = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {
                System.out.println("Tapildi. Index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Tapilmadi");
        }
    }
}
