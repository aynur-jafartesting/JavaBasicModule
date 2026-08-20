public class MethodsTask4 {


    public static double area(double radius) {

        return Math.PI * radius * radius;
    }


    public static double area(double width, double height) {

        return width * height;
    }


    public static double area(double a, double b, double c) {

        double s = (a + b + c) / 2;

        return Math.sqrt(
                s * (s - a) *
                        (s - b) *
                        (s - c)
        );
    }


    public static void main(String[] args) {

        System.out.println("Daire: " + area(5));

        System.out.println("Duzbucaqli: " + area(4, 6));

        System.out.println("Ucbucaq: " + area(3, 4, 5));
    }
}
