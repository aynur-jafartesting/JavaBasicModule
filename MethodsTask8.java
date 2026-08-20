public class MethodsTask8 {


    public static int factorialRecursive(int n) {

        // Base case:
        // n = 0 olduqda rekursiya dayanır və 1 qaytarılır.
        // Əgər base case olmasa, method özünü sonsuz çağıracaq
        // və nəticədə StackOverflowError yaranacaq.

        if (n == 0) {
            return 1;
        }

        return n * factorialRecursive(n - 1);
    }


    public static int factorialLoop(int n) {

        int result = 1;

        for (int i = 1; i <= n; i++) {

            result *= i;
        }

        return result;
    }


    public static void main(String[] args) {

        int number = 5;

        System.out.println("Rekursiya: "
                + factorialRecursive(number));

        System.out.println("Loop: "
                + factorialLoop(number));
    }
}