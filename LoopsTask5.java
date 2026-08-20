import java.time.LocalTime;
import java.util.Scanner;

public class LoopsTask5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1 - Salamla");
            System.out.println("2 - Saati goster");
            System.out.println("0 - Cix");
            System.out.print("Secim: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Salam!");
                    break;

                case 2:
                    System.out.println("Saat: " + LocalTime.now());
                    break;

                case 0:
                    System.out.println("Program baglandi.");
                    break;

                default:
                    System.out.println("Yanlis secim!");
            }

        } while (choice != 0);
    }
}
