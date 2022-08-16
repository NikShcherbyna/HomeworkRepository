package fourth;

public class Dog extends Animal{
    private static int countOfDogs;
    public Dog(String name) {
        super(name);
        countOfDogs++;
    }

    public static void getCountOfAnimals() {
        System.out.println(countOfDogs + " " + "dogs created");
    }

    @Override
    public void run(int runDistance) {
        if (runDistance > 0 && runDistance < 500){
            System.out.println("Dog" + " " + name + " " + "has ran" + " " + runDistance + " " + "metres");
        }else{
            System.out.println("Your dog" + " " + name + " " + "can not run more than 500 metres and less than 0");
        }
    }

    @Override
    public void swim(int swimDistance) {
        if (swimDistance > 0 && swimDistance < 10){
            System.out.println("Dog" + " " + name + " " + "has swam" + " " + swimDistance + " " + " " + "metres");
        }else{
            System.out.println("Your dog" + " " + name + " " + "can not swim more than 10 metres and less than 0");
        }
    }
}