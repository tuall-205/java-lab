package java_labs;

public class Circle extends Shape {
    public double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    public Circle() {
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * rad;
    }

    @Override
    public double getArea() {
        return Math.PI * rad * rad;
    }

    @Override
    public void printResult() {
        System.out.println("Circle{" +
                "rad = " + rad +
                ", Area = " + getArea() +
                ", Perimeter = " + getPerimeter() +
                '}');
    }
}
