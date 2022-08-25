package fifth.competitions;

public abstract class Obstacles{
    protected int obstacleSize;

    public Obstacles(int obstacleSize){
        this.obstacleSize = obstacleSize;
    }

    public void setObstacleSize(int obstacleSize) {
        this.obstacleSize = obstacleSize;
    }
}