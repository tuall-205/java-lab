package J1.S.P0011.View;

public class view {
    public static void displayMenu() {
        System.out.println("1. Convert from Binary");
        System.out.println("2. Convert from Decimal");
        System.out.println("3. Convert from Hexa");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void displayConvertMenu(String from, String toCase1, String toCase2) {
        System.out.println("1. Convert " + from + " to " + toCase1);
        System.out.println("2. Convert " + from + " to " + toCase2);
        System.out.print("Enter your choice: ");
    }

}
