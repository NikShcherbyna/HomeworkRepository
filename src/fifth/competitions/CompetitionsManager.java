package fifth.competitions;

public class CompetitionsManager{
    public static void main(String[] args){
        Competitor human1 = new Human(10, 5, "Borya");
        Competitor human2 = new Human(10, 7, "Volodya");
        Competitor robot1 = new Robot(7,10, "Optimus Prime");
        Competitor cat1 = new Cat(5, 6, "Barsik");
        Competitor[] arrayOfCompetitors = {human1, human2, robot1, cat1};

        Obstacles wall1 = new Wall(7);
        Obstacles wall2 = new Wall(4);
        Obstacles racetrack1 = new Racetrack(15);
        Obstacles racetrack2 = new Racetrack(5);
        Obstacles[] arrayOfObstacles = {wall1, wall2, racetrack1, racetrack2};

        overcomeArray(arrayOfCompetitors, arrayOfObstacles);
    }

    public static void overcomeArray(Competitor[] arrayOfCompetitors, Obstacles[] arrayOfObstacles){
        for(Competitor eachCompetitor : arrayOfCompetitors)
            for(Obstacles eachObstacle : arrayOfObstacles){
                eachCompetitor.overcome(eachObstacle);
            }
    }
}