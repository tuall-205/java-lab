package J1.S.P0011;


import J1.S.P0011.Controller.Manager;
import J1.S.P0011.View.Validate;
import J1.S.P0011.View.view;

public class Main {
    public static void main(String[] args) {
        view view1 = new view();
        Validate validate = new Validate();
        Manager Manager = new Manager(view1, validate);
        while (true) {
            view1.displayMenu();
            int choice = Validate.getChoice();
            switch (choice) {
                case 1:
                    String binary = validate.checkInputBinary();
                    Manager.convertFromBinary(binary);
                    break;
                case 2:
                    String decimal = validate.checkInputDecimal();
                    Manager.convertFromDecimal(decimal);
                    break;
                case 3:
                    String hexa = validate.checkInputHexaDecimal();
                    Manager.convertFromHexa(hexa);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}