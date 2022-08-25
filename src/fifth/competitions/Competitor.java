package fifth.competitions;

public abstract class Competitor{
    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected String name;

    abstract void jump();
    abstract void run();

    void overcome(Obstacles obstacles){
        if (obstacles instanceof Wall){
            this.jump();
        } else if (obstacles instanceof Racetrack) {
            this.run();
        }
    }

    public Competitor(int maxRunDistance, int maxJumpHeight, String name){
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.name = name;
    }
}