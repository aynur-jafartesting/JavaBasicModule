public class LoopsTask4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println("Qeyd:");
        System.out.println("Evvel FizzBuzz yoxlanilir.");
        System.out.println("Cunki 15 hem 3-e, hem de 5-e bolunur.");
        System.out.println("Eger evvel i % 3 == 0 yoxlanilsa, 15 ucun derhal Fizz cap olunacaq.");
        System.out.println("Bu halda FizzBuzz hissesine catmayacaq.");
    }
}
