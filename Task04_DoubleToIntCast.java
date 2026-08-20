public class Task04_DoubleToIntCast {
    public static void main(String[] args) {

        double price = 7.8;
        int rounded = (int) price;

        System.out.println("price = " + price);
        System.out.println("(int) price = " + rounded);

        System.out.println();
        System.out.println("İzah: (int) 7.8 nəticəsi 8 yox, 7 oldu, çünki cast " +
                "yuvarlaqlaşdırma (rounding) etmir, sadəcə vergüldən sonrakı hissəni " +
                "kəsib atır (truncation). Yuvarlaqlaşdırma ən yaxın tam ədədə " +
                "aparardı (7.8 -> 8), truncation isə həmişə sıfıra doğru kəsir (7.8 -> 7).");
    }
}
