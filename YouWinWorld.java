import mayflower.*;
public class YouWinWorld extends World{
    private RobotActor robot;
    public YouWinWorld(RobotActor r){
        setBackground("img/winner.png");
        robot = r;
        ScoreLabel score = new ScoreLabel(robot);
        addObject(score, 0, 0);
        PlayAgainButton playAgain = new PlayAgainButton();
        addObject(playAgain, 304, 400);
    }
    @Override
    public void act(){
        
    }
}
