import java.util.Scanner;

public class SwitchTask5 {
    public static void main(String[] args) {

        /*
        Müqayisə:

        Klassik switch:
        - break yazmaq lazımdır.
        - Sintaksisi daha uzundur.

        Switch expression:
        - break lazım deyil.
        - -> ilə daha qısa yazılır.
        - Dəyəri birbaşa qaytarır.

        Fikir:
        Switch expression daha sadə və təhlükəsizdir.
        Amma köhnə proqramlarda klassik switch istifadə olunduğu üçün
        hər ikisini bilmək vacibdir.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ayın nömrəsini daxil edin (1-12): ");
        int month = scanner.nextInt();

        String season = switch (month) {
            case 12, 1, 2 -> "Qış";
            case 3, 4, 5 -> "Yaz";
            case 6, 7, 8 -> "Yay";
            case 9, 10, 11 -> "Payız";
            default -> "Yanlış ay nömrəsi!";
        };

        System.out.println("Fəsil: " + season);

        scanner.close();
    }
}