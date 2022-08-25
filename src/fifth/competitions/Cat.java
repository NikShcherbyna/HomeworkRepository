package fifth.competitions;

public class Cat extends Competitor{
    @Override
    public void jump(){
        System.out.println(name + " " + "has jumped the wall");
    }

    @Override
    public void run(){
        System.out.println(name + " " + "has ran the racetrack");
    }

    public Cat(int maxRunDistance, int maxJumpHeight, String name){
        super(maxRunDistance, maxJumpHeight, name);
    }
}