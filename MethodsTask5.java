public class MethodsTask5 {


    public static int sum(int[] array) {

        int total = 0;

        for (int number : array) {
            total += number;
        }

        return total;
    }


    public static double average(int[] array) {

        return (double) sum(array) / array.length;
    }


    public static int max(int[] array) {

        int max = array[0];

        for (int number : array) {

            if (number > max) {
                max = number;
            }
        }

        return max;
    }


    public static int min(int[] array) {

        int min = array[0];

        for (int number : array) {

            if (number < min) {
                min = number;
            }
        }

        return min;
    }


    public static void main(String[] args) {

        int[] numbers = {10, 25, 5, 40, 15};

        System.out.println("Cem: " + sum(numbers));
        System.out.println("Ortalama: " + average(numbers));
        System.out.println("Max: " + max(numbers));
        System.out.println("Min: " + min(numbers));
    }
}
