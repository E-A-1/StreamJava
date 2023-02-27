package basicMaths;

public class CountDigit {
    static int countDigit(int number) {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            System.out.println("the number is " + number);
            count = count + 1;
        }
        return count;

    }

    static int reverseNumber(int number) {
        int count = CountDigit.countDigit(number);
        String reversedNumber = "";
        for (int i = count; i > 0; i--) {
            int newValue = (number % 10);
            reversedNumber = reversedNumber + String.valueOf(newValue);
            number = number / 10;
        }
        return Integer.valueOf(reversedNumber);
    }

    static int reverseNumberAlternateWay(int number) {
        int reverse = 0;
        while (number > 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number=number/10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(CountDigit.reverseNumberAlternateWay(123456));
    }
}
