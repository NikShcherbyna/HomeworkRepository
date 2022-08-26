package fifth.figure;

public class Square implements FigureInterface{
    protected double a;

    public Square(double a) {
        if(a <= 0){
            throw new ArithmeticException("Side a of square must be more than 0");
        }
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