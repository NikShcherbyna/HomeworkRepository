package fourth;

public class Cat extends Animal{
    private static int countOfCats;

    public Cat(String name) {
        super(name);
        countOfCats++;
    }

    public static int getCountOfAnimals(){
        System.out.println(countOfCats + " " + "cats created");
        return countOfCats;
    }

    @Override
    public void run(int runDistance) {
        if (runDistance > 0 && runDistance < 200){
            System.out.println("Cat" + " " + " " + name + " " + " has ran" + runDistance + " " + "metres");
        }else{
            System.out.println("Your cat" + " " + name + " " + "can run not more than 200 metres and less than 0");
        }
    }

    @Override
    public void swim(int swimDistance) {
        System.out.println("Cats can not swim");
    }
}