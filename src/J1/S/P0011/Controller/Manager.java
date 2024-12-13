package J1.S.P0011.Controller;


import J1.S.P0011.View.Validate;
import J1.S.P0011.View.view;
import J1.S.P0011.Model.Convert;

public class Manager {

    public static void convertFromBinary(String binary) {
        view.displayConvertMenu("Binary", "Decimal", "Hexa");
        int choice = Validate.checkInputIntLimit(1, 2);
        switch (choice) {
            case 1:
                System.out.println("Decimal number: " + Convert.binaryToDecimal(binary));
                break;
            case 2:
                System.out.println("Hexa number: " + Convert.binaryToHexa(binary));
                break;
        }
    }

    public static void convertFromDecimal(String decimal) {
        view.displayConvertMenu("Decimal", "Binary", "Hexa");
        int choice = Validate.checkInputIntLimit(1, 2);
        switch (choice) {
            case 1:
                System.out.println("Binary number: " + Convert.decimalToBinary(decimal));
                break;
            case 2:
                System.out.println("Hexa number: " + Convert.decimalToHexa(decimal));
                break;
        }
    }

    public static void convertFromHexa(String hexa) {
        view.displayConvertMenu("Hexa", "Binary", "Decimal");
        int choice = Validate.checkInputIntLimit(1, 2);
        switch (choice) {
            case 1:
                System.out.println("Binary number: " + Convert.hexaToBinary(hexa));
                break;
            case 2:
                System.out.println("Decimal number: " + Convert.hexaToDecimal(hexa));
                break;
        }
    }

}