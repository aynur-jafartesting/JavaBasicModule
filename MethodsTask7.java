import java.util.Scanner;

public class MethodsTask7 {


    public static int[] readScores(int count) {

        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[count];


        for (int i = 0; i < count; i++) {

            System.out.print((i + 1) + ". bal: ");
            scores[i] = scanner.nextInt();
        }

        return scores;
    }


    public static double average(int[] scores) {

        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        return (double) sum / scores.length;
    }


    public static int highest(int[] scores) {

        int max = scores[0];

        for (int score : scores) {

            if (score > max) {
                max = score;
            }
        }

        return max;
    }


    public static String gradeFor(double average) {

        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }


    public static void printReport(int[] scores) {

        double avg = average(scores);

        System.out.println("Ortalama: " + avg);
        System.out.println("En yuksek bal: " + highest(scores));
        System.out.println("Qiymet: " + gradeFor(avg));
    }


    public static void main(String[] args) {

        int[] scores = readScores(5);

        printReport(scores);
    }
}
