import mayflower.*;
public class StartGameButton extends Actor{
    public StartGameButton(){
        setImage("img/start.png");
    }
    @Override
    public void act(){
        if( Mayflower.mouseClicked(this) ){
            Mayflower.setWorld( new Level1World() );
        }
    }
}