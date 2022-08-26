package fifth.competitions;

public abstract class Competitor{
    protected int runDistance;
    protected int jumpHeight;
    protected String name;
    protected boolean isDisqualified;

    abstract void jump(Obstacles obstacles);
    abstract void run(Obstacles obstacles);

    void overcome(Obstacles obstacles){
        if (obstacles instanceof Wall){
            this.jump(obstacles);
        } else if (obstacles instanceof Racetrack) {
            this.run(obstacles);
        }
    }

    public Competitor(int maxRunDistance, int maxJumpHeight, String name){
        this.runDistance = maxRunDistance;
        this.jumpHeight = maxJumpHeight;
        this.name = name;
    }
}