package fifth.competitions;

public class Robot extends Competitor{
    @Override
    public void jump(Obstacles obstacles) {
        if(maxJumpHeight >= obstacles.getObstacleSize()) {
            System.out.println(name + " " + "has jumped through the wall on distance" + " " + obstacles.getObstacleSize());
        }else{
            System.out.println(name + " " + "has not jumped through the wall on height" + " " + obstacles.getObstacleSize() + " " + "it jumped" + " " + maxJumpHeight);
        }
    }

    @Override
    public void run(Obstacles obstacles) {
        if(maxRunDistance >= obstacles.getObstacleSize()) {
            System.out.println(name + " " + "has ran the racetrack on distance" + " " + obstacles.getObstacleSize());
        }else{
            System.out.println(name + " " + "has not ran the racetrack on height" + " " + obstacles.getObstacleSize() + " " + "it ran" + " " + maxJumpHeight);
        }
    }

    public Robot(int maxRunDistance, int maxJumpHeight, String name){
        super(maxRunDistance, maxJumpHeight, name);
    }
}