package fifth.competitions;

public abstract class Competitor{
    protected int maxRunDistance;
    protected int maxJumpHeight;
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
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.name = name;
    }
}