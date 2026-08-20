import java.util.Scanner;

public class Task07_FindMaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        int a = scanner.nextInt();

        System.out.print("İkinci ədədi daxil edin: ");
        int b = scanner.nextInt();

        System.out.print("Üçüncü ədədi daxil edin: ");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("Üçü də bərabərdir: " + a);
        } else if (a >= b && a >= c) {
            System.out.println("Ən böyük ədəd: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Ən böyük ədəd: " + b);
        } else {
            System.out.println("Ən böyük ədəd: " + c);
        }

        scanner.close();
    }
}