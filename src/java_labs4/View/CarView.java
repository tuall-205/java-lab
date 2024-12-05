package java_labs4.View;
import java.util.Scanner;

public class CarView {
    private final Scanner sc = new Scanner(System.in);

    public String getString (String message) {
        System.out.println(message);
        return sc.nextLine();
    }

    public int getValueInt (String mess) {
        System.out.println(mess);
        return sc.nextInt();
    }

    public void displayMess(String mess) {
        System.out.println(mess);
    }
}
