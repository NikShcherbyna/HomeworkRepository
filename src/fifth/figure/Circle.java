package fifth.figure;

public class Circle implements FigureInterface{
    protected double r;
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return PI * Math.pow(r, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}