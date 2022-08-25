package fifth.competitions;

public class Human extends Competitor{
    @Override
    public void jump() {
        System.out.println(name + " " + "has jumped through the wall");
    }

    @Override
    public void run() {
        System.out.println(name + " " + "has ran the racetrack");
    }

    public Human(int maxRunDistance, int maxJumpHeight, String name) {
        super(maxRunDistance, maxJumpHeight, name);
    }
}