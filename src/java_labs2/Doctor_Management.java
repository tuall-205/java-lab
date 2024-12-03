package java_labs2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Doctor_Management {
    private static final Map<String, Doctor> doctorMap = new HashMap<>();
    private static final Scanner sc = new Scanner(System.in);

    public void run() {
        while (true) {
            displayMain();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addDoctor();
                    break;
                case 2:
                    updateDoctor();
                    break;
                case 3:
                    deleteDoctor();
                    break;
                case 4:
                    searchDoctor();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    public void displayMain() {
        System.out.println("=====Doctor Management=====");
        System.out.println("1.Add doctor.");
        System.out.println("2.Update doctor.");
        System.out.println("3.Delete doctor.");
        System.out.println("4.Search doctor.");
        System.out.println("5.Exit.");

        for (Doctor doctor : doctorMap.values()) {
            System.out.println(doctor);
        }
    }

    public void addDoctor() {
        System.out.print("please input the code: ");
        String code = sc.nextLine();

        if (doctorMap.containsKey(code)) {
            System.out.println("code is duplicate");
            return;
        }

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter specialization: ");
        String specialization = sc.nextLine();
        System.out.print("Enter availability: ");
        int availability = sc.nextInt();
        sc.nextLine();
        try {
            checkAvailability(availability);
            doctorMap.put(code, new Doctor(code, name, specialization, availability));
            System.out.println("add oke");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void updateDoctor() {
        System.out.println("please input the code: ");
        String code = sc.nextLine();

        if (!doctorMap.containsKey(code)) {
            System.out.println("code isn't exist");
            return;
        }

        Doctor doctor = doctorMap.get(code);
        System.out.print("Enter new name: ");
        String name = sc.nextLine();
        System.out.print("Enter specialization: ");
        String specialization = sc.nextLine();
        System.out.print("Enter availability: ");
        String availability = sc.nextLine();

        try {
            if (!availability.trim().isEmpty()) {
                int a = Integer.parseInt(availability);
                checkAvailability(a);
                doctor.setAvailability(a);
            }
            if (!name.trim().isEmpty()) doctor.setName(name);
            if (!specialization.trim().isEmpty()) doctor.setSpecialization(specialization);
            System.out.println("upd oke");
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
    }

    public void deleteDoctor() {
        System.out.println("Enter code: ");
        String code = sc.nextLine();

        if (doctorMap.remove(code) != null) {
            System.out.println("delete oke");
        } else {
            System.out.println("delete don't oke");
        }
    }

    public void searchDoctor() {
        System.out.println("Enter your search's idea (any infor): ");
        String infor = sc.nextLine().toLowerCase();

        System.out.println("Result of doctor by search: ");
        for (Doctor doctor : doctorMap.values()) {
            if (doctor.getName().toLowerCase().contains(infor) ||
                    doctor.getCode().toLowerCase().contains(infor) ||
                    doctor.getSpecialization().toLowerCase().contains(infor)) {
                System.out.println(doctor);
            }
        }
    }

    private void checkAvailability(int availability) {
        if (availability < 0) {
            throw new IllegalArgumentException("Availability is greater than 0.");
        }
    }

    public static void main(String[] args) {
        Doctor_Management dr = new Doctor_Management();
        dr.run();
    }
}
