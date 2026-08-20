public class Task03_IncrementDecrement {
    public static void main(String[] args) {
        // Postfix
        int x = 5;
        System.out.println("x++ = " + x++);  // 5 çap edir (istifadə et, sonra artır)
        System.out.println("sonra x = " + x); // 6

        // Prefix
        int y = 5;
        System.out.println("++y = " + ++y);  // 6 çap edir (əvvəl artır, sonra istifadə et)
        System.out.println("sonra y = " + y); // 6
    }
}
