import java.util.Scanner;

public class Task07_AgeAccessCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        int age = scanner.nextInt();

        if (age < 0 || age > 130) {
            System.out.println("Yanlış yaş!");
        } else if (age >= 18) {
            System.out.println("Giriş icazəsi var");
        } else if (age >= 13) {
            System.out.println("Yalnız valideyn müşayiəti ilə");
        } else {
            System.out.println("Giriş qadağandır");
        }

        scanner.close();
    }
}
