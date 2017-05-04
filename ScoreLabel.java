import mayflower.*;
public class ScoreLabel extends Actor{
    private RobotActor robot;
    private int score;
    public ScoreLabel(RobotActor r){
        score = 0;
        MayflowerImage img = new MayflowerImage("Hello Robot", 24, Color.WHITE);
        setImage(img);
        robot = r;
    }
    @Override
    public void act(){
        if(robot.getScore() != score){
            score = robot.getScore();
            MayflowerImage image = new MayflowerImage("Score " + score, 24, Color.WHITE);
            setImage(image);
        }
    }
}
