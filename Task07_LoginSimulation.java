import java.util.Scanner;

public class Task07_LoginSimulation {
    public static void main(String[] args) {

        String correctUsername = "admin";
        String correctPassword = "pass123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Username daxil edin: ");
        String username = scanner.nextLine();

        System.out.print("Password daxil edin: ");
        String password = scanner.nextLine();

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username və ya password boş ola bilməz!");
        } else if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Giriş uğurlu");
        } else if (username.equals(correctUsername) && !password.equals(correctPassword)) {
            System.out.println("Parol səhvdir");
        } else {
            System.out.println("İstifadəçi tapılmadı");
        }

        scanner.close();
    }
}
