package java_labs;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=====Calculator Shape Program=====");

        System.out.println("Rectangle:");
        System.out.print("width: ");
        double a = sc.nextDouble();
        System.out.print("length: ");
        double b = sc.nextDouble();
        Shape rectangle = new Rectangle(a, b);

        System.out.println("Circle:");
        System.out.print("rad: ");
        double rad = sc.nextDouble();
        Shape circle = new Circle(rad);

        System.out.println("Triangle:");
        double x,y,z;
        while (true) {
            System.out.print("sideA: ");
            x = sc.nextDouble();
            System.out.print("sideB: ");
            y = sc.nextDouble();
            System.out.print("sideC: ");
            z = sc.nextDouble();
            if (x + y > z && x + z > y && y + z > x) {
                break;
            }
        }
        Shape triangle = new Triangle(x, y, z);

        rectangle.printResult();
        System.out.println();
        circle.printResult();
        System.out.println();
        triangle.printResult();
    }
}
