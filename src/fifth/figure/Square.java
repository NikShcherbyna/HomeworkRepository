package fifth.figure;

public class Square implements FigureInterface{
    protected double a;

    public Square(double a) {
        this.a = a;
    }
    @Override
    public double area() {
        return Math.pow(a, 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}