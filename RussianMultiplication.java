import java.util.Scanner; //Java Library

public class RussianMultiplication {
    public static void main(String[] args) {
        //Gains input from the user.
        Scanner input = new Scanner(System.in);

        //init variables whilst reading input keyed in by the user.
        int result = 0;
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        //Logic
        //The loop will continue while num1 is more than 0
        //Inside the while loop there is an if condition, where if the result is odd, they will add together with the value of num2.
        while (num1 > 0) {
            if (num1 % 2 == 1){
                result += num2;
            }
            //While num1 is still more than 0, num1 will keep being divided by 2 and num2 will keep being multiplied by 2.
            num1 /= 2;
            num2 *= 2;
        }
        //The code breaks out of the loop when num1 is finally not more than 0.


        //Prints the result.
        System.out.println("The result is: " + result);
    }
}
