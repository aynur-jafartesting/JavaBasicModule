import java.util.Scanner;

public class SwitchTask3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ayın nömrəsini daxil edin (1-12): ");
        int month = scanner.nextInt();

        System.out.println("\n--- Break-siz versiya (fall-through) ---");
        printSeasonWithoutBreak(month);

        System.out.println("\n--- Break-li versiya (düzgün) ---");
        printSeasonWithBreak(month);
    }

    // TASK 3 — Break-lər SİLİNMİŞ versiya (sınaq üçün)
    // month = 3 daxil etdikdə: Yaz, Yay, Payız, Yanlış ay nömrəsi! (4 sətir)
    // Break olmadığı üçün icra uyğun case-dən başlayıb aşağıya "tökülür"
    // (fall-through) — qalan bütün blokların kodu da ardıcıl icra olunur.


    public static void printSeasonWithoutBreak(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Qış");
            case 3:
            case 4:
            case 5:
                System.out.println("Yaz");
            case 6:
            case 7:
            case 8:
                System.out.println("Yay");
            case 9:
            case 10:
            case 11:
                System.out.println("Payız");
            default:
                System.out.println("Yanlış ay nömrəsi!");
        }
    }

    // TASK 3 — Break-lər GERİ QAYTARILMIŞ versiya (düzgün, son hal)
    // month = 3 daxil etdikdə: Yaz (yalnız 1 sətir)
    // Hər case öz break-i ilə bitir, ona görə uyğun case tapılan kimi
    // switch bloku dərhal tərk edilir.
    public static void printSeasonWithBreak(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Qış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Yaz");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yay");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Payız");
                break;
            default:
                System.out.println("Yanlış ay nömrəsi!");
                break;
        }
    }
}