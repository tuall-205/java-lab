package java_labs;

public class Triangle extends Shape {

    public double sideA;
    public double sideB;
    public double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle() {
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double p =(sideA + sideB + sideC)/2;
        return Math.sqrt((p * (p - sideA) * (p - sideB) * (p - sideC)));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public void printResult() {
        System.out.println("Triangle{" +
                "sideA = " + sideA +
                ", sideB = " + sideB +
                ", sideC = " + sideC +
                ", Area = " + getArea() +
                ", Perimeter = " + getPerimeter() +
                '}');
    }
}
