import java.util.Scanner;

public class Task06_CapitalizeWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir söz daxil edin: ");
        String word = scanner.nextLine();

        String firstLetter = word.substring(0, 1).toUpperCase();
        String restOfWord = word.substring(1).toLowerCase();
        String result = firstLetter + restOfWord;

        System.out.println();
        System.out.println("Orijinal: " + word);
        System.out.println("Formatlanmış: " + result);

        scanner.close();
    }
}