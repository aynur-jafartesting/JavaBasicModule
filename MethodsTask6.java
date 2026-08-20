import java.util.Scanner;

public class MethodsTask6 {


    public static boolean isValidScore(int score) {

        return score >= 0 && score <= 100;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bal daxil edin: ");

        int score = scanner.nextInt();


        if (!isValidScore(score)) {

            System.out.println("Yanlis input");
            return;
        }


        System.out.println("Bal qebul edildi: " + score);
    }
}
