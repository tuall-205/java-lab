package J1.S.P0011;


import J1.S.P0011.Controller.Manager;
import J1.S.P0011.View.Validate;
import J1.S.P0011.View.view;

public class Main {

    public static void main(String[] args) {
        while (true) {
            view.displayMenu();
            int choice = Validate.getChoice();
            switch (choice) {
                case 1:
                    String binary = Validate.checkInputBinary();
                    Manager.convertFromBinary(binary);
                    break;
                case 2:
                    String decimal = Validate.checkInputDecimal();
                    Manager.convertFromDecimal(decimal);
                    break;
                case 3:
                    String hexa = Validate.checkInputHexaDecimal();
                    Manager.convertFromHexa(hexa);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}