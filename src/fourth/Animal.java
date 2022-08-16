package fourth;

public abstract class Animal {
    protected String name;
    private int countOfAnimals;

    public Animal (String name){
        this.name = name;
        countOfAnimals++;
    }

    public abstract void run (int runDistance);
    public abstract void swim (int swimDistance);
}