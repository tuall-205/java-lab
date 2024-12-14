package J1.S.P0011.View;

import java.util.Scanner;

public class Validate {

    private static final Scanner sc = new Scanner(System.in);
    private static final String BINARY_VALID = "[0-1]*";
    private static final String HEXADECIMAL_VALID = "[0-9a-fA-F]*";
    private static final String DECIMAL_VALID = "[0-9]*";

    public int checkInputIntLimit (int min, int max) {
       while (true) {
           try {
               int result = Integer.parseInt(sc.nextLine().trim());
               if (result < min && result > max) {
                   throw new NumberFormatException();
               }
               return result;
           } catch (NumberFormatException e) {
               System.out.println("Input number must be between " + min + " and " + max );
               System.out.println("Please try again");
           }
       }
    }

    public String checkInputBinary() {
        while (true) {
            System.out.print("Please enter binary number: ");
            sc.nextLine();
            String binary = sc.nextLine().trim();
            if (binary.matches(BINARY_VALID)) {
                return binary;
            }
            System.out.println("Number must be binary {0,1} ");
            System.out.println("Please try again");
        }
    }

    public String checkInputDecimal() {
        while (true) {
            System.out.print("Please enter decimal number: ");
            sc.nextLine();
            String decimal = sc.nextLine().trim();
            if (decimal.matches(DECIMAL_VALID)) {
                return decimal;
            }
            System.out.println("Number must be decimal number {0-9}");
            System.out.println("Please try again");
        }
    }

    public String checkInputHexaDecimal() {
        while (true) {
            System.out.print("Please enter hexadecimal number: ");
            sc.nextLine();
            String hexa = sc.nextLine().trim().toUpperCase();
            if (hexa.matches(HEXADECIMAL_VALID)) {
                return hexa;
            }
            System.out.println("Number must be hexadecimal number {0-9A-F}");
            System.out.println("Please try again");
        }
    }

    public static int getChoice() {
        return sc.nextInt();
    }
}