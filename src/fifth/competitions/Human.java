package fifth.competitions;

public class Human extends Competitor{

    @Override
    public void jump(Obstacles obstacles) {
        if(jumpHeight >= obstacles.getObstacleSize()) {
            System.out.println(name + " " + "has jumped through the wall on distance" + " " + obstacles.getObstacleSize());
        }else{
            System.out.println(name + " " + "has not jumped through the wall on height" + " " + obstacles.getObstacleSize() + "and has been disqualified he/she jumped" + " " + jumpHeight);
            isDisqualified = true;
        }
    }

    @Override
    public void run(Obstacles obstacles) {
        if(runDistance >= obstacles.getObstacleSize()) {
            System.out.println(name + " " + "has ran the racetrack on distance" + " " + obstacles.getObstacleSize());
        }else{
            System.out.println(name + " " + "has not ran the racetrack on height" + " " + obstacles.getObstacleSize() + "and has been disqualified he/she ran" + " " + jumpHeight);
            isDisqualified = true;
        }
    }

    public Human(int maxRunDistance, int maxJumpHeight, String name) {
        super(maxRunDistance, maxJumpHeight, name);
    }
}