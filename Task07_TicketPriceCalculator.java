import java.util.Scanner;

public class Task07_TicketPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        int age = scanner.nextInt();

        System.out.print("Tələbəsinizmi? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        double basePrice = 10.0;
        double finalPrice;
        String discountInfo;

        if (age < 6) {
            finalPrice = 0;
            discountInfo = "Pulsuz (6 yaşdan kiçik)";
        } else if (isStudent) {
            // Tələbə endirimi (30%) yaşdan asılı olmayaraq tətbiq olunur,
            // amma əvvəlcə digər potensial endirimlərlə müqayisə edilməlidir
            double studentDiscount = 0.30;
            double seniorDiscount = (age >= 65) ? 0.40 : 0;
            double childDiscount = (age >= 6 && age <= 17) ? 0.50 : 0;

            double maxDiscount = Math.max(studentDiscount, Math.max(seniorDiscount, childDiscount));
            finalPrice = basePrice * (1 - maxDiscount);
            discountInfo = "Ən böyük endirim tətbiq olundu: " + (int) (maxDiscount * 100) + "%";
        } else if (age >= 6 && age <= 17) {
            finalPrice = basePrice * 0.50;
            discountInfo = "50% endirim (6-17 yaş)";
        } else if (age >= 65) {
            finalPrice = basePrice * 0.60;
            discountInfo = "40% endirim (65+ yaş)";
        } else {
            finalPrice = basePrice;
            discountInfo = "Endirim yoxdur";
        }

        System.out.println();
        System.out.println("Baza qiymət: " + basePrice + " AZN");
        System.out.println(discountInfo);
        System.out.println("Yekun qiymət: " + finalPrice + " AZN");

        scanner.close();
    }
}
