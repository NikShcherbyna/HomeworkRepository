package fifth.competitions;

public abstract class Obstacles{
    private int obstacleSize;

    public Obstacles(int obstacleSize){
        this.obstacleSize = obstacleSize;
    }

    public int getObstacleSize() {
        return obstacleSize;
    }
}