public class NumberPalindrome {
    public static void main(String[] args) {

        String outString = isPalindrome(-1221) ? "is a palindrome" : "is NOT a palindrome";
        System.out.println("-1221 " +  outString);

        outString = isPalindrome(707) ? "is a palindrome" : "is NOT a palindrome";
        System.out.println("707 " +  outString);

        outString = isPalindrome(1492) ? "is a palindrome" : "is NOT a palindrome";
        System.out.println("1492 " +  outString);

        outString = isPalindrome(0) ? "is a palindrome" : "is NOT a palindrome";
        System.out.println("0 " +  outString);

        outString = isPalindrome(7) ? "is a palindrome" : "is NOT a palindrome";
        System.out.println("7 " +  outString);

        outString = isPalindrome(123321) ? "is a palindrome" : "is NOT a palindrome";
        System.out.println("123,321 " +  outString);

        outString = isPalindrome(751) ? "is a palindrome" : "is NOT a palindrome";
        System.out.println("751 " +  outString);

        outString = isPalindrome(77) ? "is a palindrome" : "is NOT a palindrome";
        System.out.println("77 " +  outString);

        outString = isPalindrome(10) ? "is a palindrome" : "is NOT a palindrome";
        System.out.println("10 " +  outString);

    }

    public static boolean isPalindrome(int number) {

        int lastDigit;
        int reverso = 0;

        if (number < 0) {
            number *= -1;
        }

        int temp = number;

        while (temp > 0) {
            lastDigit = temp % 10;  // peel off the current least significant digit
            reverso = reverso * 10;  // move the current value of reversed num to the left by 10**1
            reverso += lastDigit;
            temp = temp / 10; // and drop that currently least significant digit from our number
        }


        return (number == reverso);
    }

}
