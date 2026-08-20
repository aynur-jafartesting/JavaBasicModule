public class ArraysTask8 {
    public static void main(String[] args) {

        int[] numbers = {5, 8, 3, 5, 10, 8, 15, 3};

        System.out.println("Tekrarlanan elementler:");

        for (int i = 0; i < numbers.length; i++) {

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (numbers[i] == numbers[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    break;
                }
            }
        }
    }
}
