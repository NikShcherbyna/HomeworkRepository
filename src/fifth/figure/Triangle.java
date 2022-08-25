package fifth.figure;

public class Triangle implements FigureInterface{
    protected double h;
    protected double a;

    public Triangle(double h, double a) {
        this.h = h;
        this.a = a;
    }

    @Override
    public double area() {
        return 0.5 * a * h;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "h=" + h +
                ", a=" + a +
                '}';
    }
}