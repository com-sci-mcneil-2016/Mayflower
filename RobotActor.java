import mayflower.*;
public class RobotActor extends Actor{
    private int score;
    public RobotActor(){
        setImage("img/robot.png");
        score = 0;
    }
    public int getScore(){
        return score;
    }
    public void scorePoints(int amnt){
        score += amnt;
    }
    @Override
    public void act(){
        if( Mayflower.isKeyDown( Keyboard.KEY_RIGHT ) ){
            turn( 5 );
        }
        if( Mayflower.isKeyDown( Keyboard.KEY_DOWN ) ){
            move( -10 );
        }
        if( Mayflower.isKeyDown( Keyboard.KEY_LEFT ) ){
            turn( -5 );
        }
        if( Mayflower.isKeyDown( Keyboard.KEY_UP ) ){
            move( 10 );
        }
    }
}
