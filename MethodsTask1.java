public class MethodsTask1 {

    public static int max(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        System.out.println(max(10, 5));
        System.out.println(max(3, 9));
        System.out.println(max(7, 7));
    }
}
