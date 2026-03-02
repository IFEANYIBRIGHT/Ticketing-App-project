import java.util.Scanner;

public class Wallet {

 
    public static boolean luhnAlgorithm(String cardNumber) {

        int totalSum = 0;
        boolean doubleDigit = false;

 
        for (int count = cardNumber.length() - 1; count >= 0; count--) {

            int digit = cardNumber.charAt(count) - '0';

            if (doubleDigit) {
                digit *= 2;

                if (digit > 9) {
                    digit -= 9;
                }
            }

            totalSum += digit;

 
            doubleDigit = !doubleDigit;
        }

        return totalSum % 10 == 0;
    }


 
    public static String getCardType(String cardNumber) {

        if (cardNumber.startsWith("4")) {
            return "Visa Card";
        }
        else if (cardNumber.startsWith("5")) {
            return "MasterCard";
        }
        else if (cardNumber.startsWith("34") || cardNumber.startsWith("37")) {
            return "American Express";
        }
        else if (cardNumber.startsWith("6")) {
            return "Discover Card";
        }
        else {
            return "Unknown Card Type";
        }
    }


    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To The Ticketing App !!");
        System.out.println();

        System.out.print("To buy Ticket input your card number: ");
        String cardNumber = input.nextLine();

        System.out.print("Input Card Expiry Date (mm/dd/yy): ");
        String cardDate = input.nextLine();

        int length = cardNumber.length();

 
        if (length < 13 || length > 19) {
            System.out.println("Invalid card number length.");
        }
        else {

            if (luhnAlgorithm(cardNumber)) {

                System.out.println("Card is VALID ✅");
                System.out.println("Card Type: " + getCardType(cardNumber));
                System.out.println("Expiry Date: " + cardDate);

            } else {

                System.out.println("Card is INVALID ❌");
            }
        }

 
    }
}
