package J1.S.P0011.Model;

public class Convert {
    private static final char[] hexaDigit = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

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