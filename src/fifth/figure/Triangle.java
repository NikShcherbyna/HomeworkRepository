package fifth.figure;

public class Triangle implements FigureInterface{
    protected double h;
    protected double a;

    public Triangle(double h, double a) {
        if(a <= 0 || h <= 0){
            throw new ArithmeticException("Side or height of triangle must be more than 0");
        }
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