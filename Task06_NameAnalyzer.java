import java.util.Scanner;

public class Task06_NameAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı daxil edin: ");
        String firstName = scanner.nextLine();

        System.out.print("Soyadınızı daxil edin: ");
        String lastName = scanner.nextLine();

        String fullName = firstName + " " + lastName;
        String initials = firstName.charAt(0) + "." + lastName.charAt(0) + ".";

        System.out.println();
        System.out.println("Tam ad: " + fullName);
        System.out.println("Tam adın uzunluğu: " + fullName.length());
        System.out.println("Böyük hərflərlə: " + fullName.toUpperCase());
        System.out.println("İnisiallar: " + initials);

        scanner.close();
    }
}
