import mayflower.*;
public class CookieActor extends Actor{
    public CookieActor(){
        setImage("img/cookie.png");
    }
    @Override
    public void act(){
        if( isTouching( RobotActor.class ) ){
            RobotActor robot = getOneIntersectingObject( RobotActor.class );
            robot.scorePoints(1);
            getWorld().removeObject(this);
            
        }
    }
}
