import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter your second number: ");
        int b = scanner.nextInt();

        int result = russianPeasant(a, b);

        System.out.println("The product of " + a + " and " + b + " is: " + result);
    }

    static int russianPeasant(int a, int b) {
        int res = 0;

        while (b > 0) {
            if ((b & 1) != 0) {
                res = res + a;
            }
            a = a << 1;
            b = b >> 1;
        }

        return res;
    }
}
