package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your password: ");
            String password = input.nextLine();
            boolean result = true;
            int NumCount = 0;
            if (password.length() < 8) {
                result = false;
                System.out.println("Unvalid password");
                continue;
            }
            if (password.length() < 0) {
                result = false;
                System.out.println("Unvalid password");
                continue;
            } else {
                for (int i = 0; i < password.length(); i++) {
                    if (!Character.isLetterOrDigit(password.charAt(i))) {
                        result = false;
                        System.out.println("Unvalid password");
                        continue;
                    }
                    if (Character.isDigit(password.charAt(i))) {
                        NumCount++;
                    }
                }
            }
            if (NumCount < 2) {
                result = false;
            }
            if (result) {
                System.out.println("Password valid!");
                break;
            } else {
                System.out.println("Password invalid!");
            }
        }
    }
}