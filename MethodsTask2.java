public class MethodsTask2 {

    public static boolean isEven(int number) {

        return number % 2 == 0;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(i + " -> " + isEven(i));
        }
    }
}
