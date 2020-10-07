import java.util.Scanner;

public class Task6_2_SumTheDigitsInAnInteger {

    /*  Write a method that computes the sum of the digits
        in an integer. Use the following method header:
        public static int sumDigits(long n)
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        long number = input.nextLong();
        System.out.println(sumDigits(number));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
