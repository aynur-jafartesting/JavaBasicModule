public class ArraysTask2 {
    public static void main(String[] args) {

        int[] numbers = {5, 12, 8, 21, 30, 7, 14, 9, 18, 4};

        int sum = 0;
        int evenCount = 0;

        for (int number : numbers) {
            sum += number;

            if (number % 2 == 0) {
                evenCount++;
            }
        }

        double average = (double) sum / numbers.length;

        System.out.println("Cem: " + sum);
        System.out.println("Ortalama: " + average);
        System.out.println("Cut ededlerin sayi: " + evenCount);
    }
}
