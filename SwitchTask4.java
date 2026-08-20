import java.util.Scanner;

public class SwitchTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Komanda daxil edin (start, stop, pause, status): ");
        String command = scanner.nextLine().toLowerCase();

        switch (command) {
            case "start":
                System.out.println("Sistem başladılır...");
                break;
            case "stop":
                System.out.println("Sistem dayandırılır...");
                break;
            case "pause":
                System.out.println("Sistem fasiləyə alındı.");
                break;
            case "status":
                System.out.println("Sistem hazırda işləyir.");
                break;
            default:
                System.out.println("Naməlum komanda: " + command);
                break;
        }
    }
}
