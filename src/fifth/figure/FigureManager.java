package fifth.figure;

public class FigureManager {
    public static void main(String[] args){
        Circle circle = new Circle(4);
        System.out.println("Circle area is" + " " + circle.area());

        Square square = new Square(3);
        System.out.println("Square area is" + " " + square.area());

        Triangle triangle = new Triangle(2,3);
        System.out.println("Triangle area is" + " " + triangle.area());

        FigureInterface[] figureArray = new FigureInterface[]{triangle,circle,square};
        System.out.println("Sum of all areas is" + " " + sumOfArrays(figureArray));
    }

    static double sumOfArrays(FigureInterface[] arraySum){
        double sum = 0;
        for(FigureInterface eachArray : arraySum){
            sum += eachArray.area();
        }
        return sum;
    }
}