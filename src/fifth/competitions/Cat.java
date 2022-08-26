package fifth.competitions;

public class Cat extends Competitor{
    @Override
    public void jump(Obstacles obstacles) {
        if(jumpHeight >= obstacles.getObstacleSize()) {
            System.out.println(name + " " + "has jumped through the wall on distance" + " " + obstacles.getObstacleSize());
        }else{
            System.out.println(name + " " + "has not jumped through the wall on height" + " " + obstacles.getObstacleSize() + " " + "the cat jumped" + " " + jumpHeight + " " + "and has been disqualified");
            isDisqualified = true;
        }
    }

    @Override
    public void run(Obstacles obstacles) {
        if(runDistance >= obstacles.getObstacleSize()) {
            System.out.println(name + " " + "has ran the racetrack on distance" + " " + obstacles.getObstacleSize());
        }else{
            System.out.println(name + " " + "has not ran the racetrack on height" + " " + obstacles.getObstacleSize() + " " + "the cat ran" + " " + jumpHeight + " " + "and has been disqualified");
            isDisqualified = true;
        }
    }

    public Cat(int maxRunDistance, int maxJumpHeight, String name){
        super(maxRunDistance, maxJumpHeight, name);
    }
}