import java.util.Arrays;

public class ArraysTask7 {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        // Dövr yalnız array-in yarısına qədər gedir.
        // Çünki hər element öz qarşılığı ilə yer dəyişir.
        // Əgər bütün array boyu getsəydik, dəyişdirilmiş elementlər
        // yenidən dəyişilərək array əvvəlki vəziyyətinə qayıda bilərdi.

        for (int i = 0; i < numbers.length / 2; i++) {

            // Müvəqqəti dəyişən istifadə olunur ki,
            // birinci elementin dəyəri itirilməsin.
            int temp = numbers[i];

            // İlk elementi son elementlə dəyişirik,
            // ikinci elementi sondan ikinci ilə və s.
            numbers[i] = numbers[numbers.length - 1 - i];

            numbers[numbers.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
