import java.util.Scanner;

public class Task05_ScannerTrapDemo {
    public static void main(String[] args) {

        System.out.println("===== PROBLEMLI VERSİYA =====");
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        int age1 = scanner1.nextInt();
        // Problem: nextInt() yalnız ədədi oxuyur, Enter-in yaratdığı "\n" simvolu
        // buferdə qalır. Növbəti nextLine() bu boş "\n"-i oxuyur və "ad" kimi
        // heç nə soruşulmadan boş sətir qaytarır.

        System.out.print("Adınızı daxil edin: ");
        String name1 = scanner1.nextLine();  // BOŞ qayıdacaq!

        System.out.println("Nəticə (problemli): ad='" + name1 + "', yaş=" + age1);
        System.out.println();

        // ---------------------------------------------------

        System.out.println("===== DÜZƏLDİLMİŞ VERSİYA =====");
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        int age2 = scanner2.nextInt();

        scanner2.nextLine(); // Həll: buferdə qalan "\n" simvolunu təmizləyirik

        System.out.print("Adınızı daxil edin: ");
        String name2 = scanner2.nextLine();  // İndi düzgün oxuyur

        System.out.println("Nəticə (düzəldilmiş): ad='" + name2 + "', yaş=" + age2);

        scanner1.close();
        scanner2.close();
    }
}
