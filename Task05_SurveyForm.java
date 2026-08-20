import java.util.Scanner;

public class Task05_SurveyForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı daxil edin: ");
        String name = scanner.nextLine();

        System.out.print("Yaşınızı daxil edin: ");
        int age = scanner.nextInt();

        System.out.print("Boyunuzu daxil edin ");
        double height = scanner.nextDouble();

        System.out.print("Tələbəsinizmi? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println();
        System.out.println(name + " " + age + " yaşındadır, boyu " + height +
                " m-dir və tələbə olub-olmaması: " + isStudent + ".");

        scanner.close();
    }
}
