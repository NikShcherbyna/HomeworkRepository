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
        if (maxJumpHeight <= 0 || maxRunDistance <= 0){
            throw new ArithmeticException("Parameters must be more than 0");
        }else if (name == ""){
            throw new RuntimeException("Write the name of competitor");
        }else {
            this.runDistance = maxRunDistance;
            this.jumpHeight = maxJumpHeight;
            this.name = name;
        }
    }
}