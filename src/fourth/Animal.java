package fourth;

public abstract class Animal {
    protected String name;

    public Animal (String name){
        this.name = name;
    }

    public abstract void run (int runDistance);
    public abstract void swim (int swimDistance);
}