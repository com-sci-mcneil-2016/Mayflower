import mayflower.*;
public class PlayAgainButton extends Actor{
    public PlayAgainButton(){
        setImage("img/playagain.png");
    }
    @Override
    public void act(){
        if( Mayflower.mouseClicked(this) ){
            Mayflower.setWorld( new Level1World() );
        }
    }
}
