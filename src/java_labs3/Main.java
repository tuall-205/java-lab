package java_labs3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    //tạo thêm các attibute như phone, email, date của người dùng

    public static final Scanner sc = new Scanner(System.in);
    public static final String Email_valid = "^[A-Z0-9a-z]+@[a-z0-9A-Z.-]+\\.[A-Za-z]{2,4}$";
    public static final String Phone_valid = "^[0-9]{10}";

    public String checkInputString() {
        while (true) {
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("not empty");
            } else {
                return input;
            }
        }
    }

    public String checkInputPhone() {
        while (true) {
            try {
                String phone = sc.nextLine();
                if (!phone.matches(Phone_valid)) {
                    System.out.println("Phone number must have 10 digits");
                }else {
                    return phone;
                }
            }catch (NumberFormatException e) {
                System.out.println("Phone number must be number");
            }
        }
    }

    public String checkInputDate() {
        while (true) {
            try{
                String dateCheck = checkInputString();
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateCheck);
                return dateCheck;
            }catch (ParseException e) {
                System.out.println("format of date is not correct");
            }
        }
    }

    public String checkInputEmail() {
        while (true) {
            String email = checkInputString();
            if (!email.matches(Email_valid)) {
                System.out.println("Email must be correct format");
            }else {
                return email;
            }
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.checkInputDate();
        m.checkInputPhone();
        m.checkInputEmail();
        System.out.println(m);
    }
}
