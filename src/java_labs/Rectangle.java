package java_labs;

public class Rectangle extends Shape {
    public double width;
    public double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void printResult() {
        System.out.println("Rectangle{" +
                "width = " + width +
                ", length = " + length +
                ", Area = " + getArea() +
                ", Perimeter = " + getPerimeter() +
                '}');
    }
}
