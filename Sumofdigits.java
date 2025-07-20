//Sum of Digits
//Method: int sumOfDigits(int n)

public class Sumofdigits {
    public static void main(String[] args) {
        System.out.println("Sum: " + sumofdigits(123));  // Output: 6
    }

    public static int sumofdigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;  // Get last digit
            n /= 10;        // Remove last digit
        }
        return sum;
    }
}
