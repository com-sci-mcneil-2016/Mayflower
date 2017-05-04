import java.util.List;
import mayflower.*;
public class Level1World extends World{
    private RobotActor robot;
    public Level1World(){
        setPaintOrder(CookieActor.class, RobotActor.class);
        setBackground("img/bg_space.png");
        robot = new RobotActor();
        addObject(robot, 400, 300);
        CookieActor cookie1 = new CookieActor();
        CookieActor cookie2 = new CookieActor();
        CookieActor cookie3 = new CookieActor();
        addObject(cookie1, 25, 50);
        addObject(cookie2, 600, 300);
        addObject(cookie3, 300, 500);
        ScoreLabel score = new ScoreLabel(robot);
        addObject(score, 0, 0);
    }
    @Override
    public void act(){
        List<CookieActor> cookies = getObjects( CookieActor.class );
        if(cookies.size() == 0){
            YouWinWorld nextWorld = new YouWinWorld(robot);
            Mayflower.setWorld(nextWorld);
        }
    }
}
