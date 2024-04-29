import java.util.*;

public class MostEfficientAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        System.out.println("Find the algorithm with the least number of steps where N is unknown!");
        System.out.println(" A1 = 60N + 20");
        System.out.println(" A2 = N^2 + 20N");
        System.out.println(" A3 = 2^N\n");

        System.out.println(" Enter your number for N ");
        System.out.print(" For values of N between 20 and 60: ");
        N = input.nextInt();
        myMethod(N);

        System.out.println("\nEnter your number for N ");
        System.out.print(" For values of N more than 100: ");
        N = input.nextInt();
        myMethod(N);
    }

    static void myMethod (int N) {
        int A1, A2, A3;
        A1 = (60 * N) + 20;
        A2 = (int)(Math.pow(N, 2)) + (20*N);
        A3 = (int)(Math.pow(2, N));

        if ((A1 < A2) && (A1 < A3)) {
            System.out.printf("The most efficient algorithm is A1 with %d steps\n", A1);
        } else if ((A2 < A3) && (A2 < A1)) {
            System.out.printf("The most efficient algorithm is A2 with %d steps\n", A2);
        } else {
            System.out.printf("The most efficient algorithm is A3 with %d steps\n", A3);
        }

        System.out.println("These are the steps taken for each algorithm:");
        System.out.printf("A1: 60N + 20 = %d\n", A1);
        System.out.printf("A2: N^2 + 20N = %d\n", A2);
        System.out.printf("A3: 2^N = %d\n", A3);
    }
}
