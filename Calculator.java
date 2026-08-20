public class Calculator {

    public static int topla(int a, int b) {
        return a + b;
    }

    public static int chix(int a, int b) {
        return a - b;
    }

    public static int vur(int a, int b) {
        return a * b;
    }

    public static double bol(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        int x = 8, y = 5;

        System.out.println("Toplama: " + topla(x, y));
        System.out.println("Çıxma: " + chix(x, y));
        System.out.println("Vurma: " + vur(x, y));
        System.out.println("Bölmə: " + bol(x, y));
    }
}
