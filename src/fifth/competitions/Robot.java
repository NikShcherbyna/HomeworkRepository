package fifth.competitions;

public class Robot extends Competitor{
    @Override
    public void jump(){
        System.out.println(name + " " + "has jumped the wall");
    }

    @Override
    public void run(){
        System.out.println(name + " " + "has ran the racetrack");
    }

    public Robot(int maxRunDistance, int maxJumpHeight, String name){
        super(maxRunDistance, maxJumpHeight, name);
    }
}