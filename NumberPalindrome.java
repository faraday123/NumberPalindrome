/**
 * Name: Samuel Adams Adjin
 */
public class NumberPalindrome {

    public static int isReverse(int number){
        int reverse = 0;
        int lastDigit;
        while (number > 0){
            lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number /= 10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int number){
        if (number < 0){
            number= -number;
        }

        int number1= isReverse(number);
        if (number1 == number){
            return true;
        }else{
            return false;
        }

    }
}
