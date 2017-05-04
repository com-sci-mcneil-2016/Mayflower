import mayflower.*;
public class TitleScreenWorld extends World{
    private RobotActor robot;
    public TitleScreenWorld(RobotActor r){
        setBackground("img/title.png");
        robot = new RobotActor();
        CookieActor cookie1 = new CookieActor();
        CookieActor cookie2 = new CookieActor();
        CookieActor cookie3 = new CookieActor();
        ScoreLabel score = new ScoreLabel(robot);
        StartGameButton strt = new StartGameButton();
        addObject(strt, 304, 400);
    }
    @Override
    public void act(){
        
    }
}
