package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a number: ");
        int originalNum = input.nextInt();
        assert originalNum > 0: "Number must be greater than 0!";
        String number = originalNum + "";
        int originalCopy = originalNum;
        int reversedNum = 0;

        while (originalCopy != 0) {
            int currentDigit = originalCopy % 10;
            originalCopy /= 10;
            reversedNum *= 10;
            reversedNum += currentDigit;
        }
        boolean result = reversedNum == originalNum;
        if (result) {
            System.out.println("Palindrome: " + result);
        } else {
            System.out.println("Palindrome: " + result);
        }

    }
}