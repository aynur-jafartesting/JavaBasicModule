import java.util.Scanner;

public class SwitchTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        double num1 = scanner.nextDouble();
        System.out.print("İkinci ədədi daxil edin: ");
        double num2 = scanner.nextDouble();
        System.out.print("Əməliyyat (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        if (operation == '/' && num2 == 0) {
            System.out.println("Xəta: sıfıra bölmək olmaz!");
            return;
        }

        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Nəticə: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Nəticə: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Nəticə: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Nəticə: " + result);
                break;
            default:
                System.out.println("Naməlum əməliyyat: " + operation);
                break;
        }
    }
}
