import java.util.Scanner;

public class Task06_EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("E-poçt ünvanını daxil edin: ");
        String email = scanner.nextLine();

        boolean hasAtSign = email.contains("@");
        boolean endsWithCom = email.endsWith(".com");
        boolean isLongEnough = email.length() > 5;

        System.out.println();
        System.out.println("'@' işarəsi var: " + hasAtSign);
        System.out.println("'.com' ilə bitir: " + endsWithCom);
        System.out.println("Uzunluğu 5-dən çoxdur: " + isLongEnough);

        boolean isValid = hasAtSign && endsWithCom && isLongEnough;
        System.out.println();
        System.out.println("Ümumi nəticə - email düzgündür: " + isValid);

        scanner.close();
    }
}
