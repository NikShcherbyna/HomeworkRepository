package fourth;

public abstract class Animal {
    protected String name;
    private static int countOfAnimals;

    public Animal (String name){
        this.name = name;
        countOfAnimals++;
    }

    public static int getCountOfAnimals() {
        System.out.println("Total number of animals" + " " + countOfAnimals);
        return countOfAnimals;
    }

    public abstract void run (int runDistance);
    public abstract void swim (int swimDistance);
}