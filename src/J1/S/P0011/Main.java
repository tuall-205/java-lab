package J1.S.P0011;


public class Main {

    public static void main(String[] args) {
        while (true) {
            int choice = Manager.displayMenu();
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