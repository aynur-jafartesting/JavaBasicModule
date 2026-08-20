public class Task03_DivisibilityCheck {
    public static void main(String[] args) {

        int[] numbers = {6, 8, 9, 12};

        for (int num : numbers) {
            boolean divisibleByBoth = (num % 2 == 0) && (num % 3 == 0);
            System.out.println(num + " -> həm 2-yə, həm 3-ə bölünür: " + divisibleByBoth);
        }

        System.out.println();
        System.out.println("İzah: && operatoru hər iki şərtin doğru olmasını tələb edir. " +
                "6 və 12 həm 2-yə, həm 3-ə bölündüyü üçün true, " +
                "8 yalnız 2-yə, 9 yalnız 3-ə bölündüyü üçün nəticə false olur.");
    }
}
