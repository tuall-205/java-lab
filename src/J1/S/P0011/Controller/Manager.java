package J1.S.P0011.Controller;


import J1.S.P0011.View.*;
import J1.S.P0011.Model.Convert;

public class Manager {

    public final view view2;
    public final Validate validate;

    public Manager(view view2, Validate validate) {
        this.view2 = view2;
        this.validate = validate;
    }

    public void convertFromBinary(String binary) {
        view2.displayConvertMenu("Binary", "Decimal", "Hexa");
        int choice = validate.checkInputIntLimit(1, 2);
        switch (choice) {
            case 1:
                System.out.println("Decimal number: " + Convert.binaryToDecimal(binary));
                break;
            case 2:
                System.out.println("Hexa number: " + Convert.binaryToHexa(binary));
                break;
        }
    }

    public void convertFromDecimal(String decimal) {
        view2.displayConvertMenu("Decimal", "Binary", "Hexa");
        int choice = validate.checkInputIntLimit(1, 2);
        switch (choice) {
            case 1:
                System.out.println("Binary number: " + Convert.decimalToBinary(decimal));
                break;
            case 2:
                System.out.println("Hexa number: " + Convert.decimalToHexa(decimal));
                break;
        }
    }

    public void convertFromHexa(String hexa) {
        view2.displayConvertMenu("Hexa", "Binary", "Decimal");
        int choice = validate.checkInputIntLimit(1, 2);
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