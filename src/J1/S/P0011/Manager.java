package J1.S.P0011;


public class Manager {

    private static final char[] hexaDigit = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    public static int displayMenu() {
        System.out.println("1. Convert from Binary");
        System.out.println("2. Convert from Decimal");
        System.out.println("3. Convert from Hexa");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        int choice = Validate.checkInputIntLimit(1, 4);
        return choice;
    }

    public static int displatConvert(String from, String toCase1, String toCase2) {
        System.out.println("1.Convert " + from + " to " + toCase1);
        System.out.println("2.Convert " + from + " to " + toCase2);
        System.out.println("Enter your choice: ");
        int choice = Validate.checkInputIntLimit(1, 2);
        return choice;
    }

    public static void convertFromBinary(String binary) {
        int choice = displatConvert("Binary", "Decimal", "Hexa");
        switch (choice) {
            case 1:
                System.out.println("Decimal number: " + binaryToDecimal(binary));
                break;
            case 2:
                System.out.println("Hexa number: " + binaryToHexa(binary));
                break;
        }
    }

    public static void convertFromDecimal(String decimal) {
        int choice = displatConvert("Decimal", "Binary", "Hexa");
        switch (choice) {
            case 1:
                System.out.println("Binary number: " + decimalToBinary(decimal));
                break;
            case 2:
                System.out.println("Hexa number: " + decimalToHexa(decimal));
                break;
        }
    }

    public static void convertFromHexa(String hexa) {
        int choice = displatConvert("Hexa", "Binary", "Decimal");
        switch (choice) {
            case 1:
                System.out.println("Binary number: " + hexaToBinary(hexa));
                break;
            case 2:
                System.out.println("Decimal number: " + hexaToDecimal(hexa));
                break;
        }
    }

    public static String binaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toString(decimal);
    }

    public static String binaryToHexa(String binary) {
        String decimal = binaryToDecimal(binary);
        String hexa = decimalToHexa(decimal);
        return hexa;
    }

    public static String decimalToBinary(String decimal) {
        String binary = Integer.toBinaryString(Integer.parseInt(decimal));
        return binary;
    }

    public static String decimalToHexa(String decimal) {
        String digit = "";
        int dec = Integer.parseInt(decimal);
        while (dec != 0) {
            digit = hexaDigit[dec % 16] + digit;
            dec /= 16;
        }
        return digit;
    }

    public static int hexaToDecimal(String hexa) {
        int decimal = Integer.parseInt(hexa, 16);
        return decimal;
    }

    public static String hexaToBinary(String hexa) {
        String binary = Integer.toBinaryString(hexaToDecimal(hexa));
        return binary;
    }
}