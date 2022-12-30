import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int xMoveVal = 0;
    int yMoveVal = 3;
    public Mover mover;
    public World myWorld;
    
    public Ball(Mover mover, World world){
        myWorld = world;
        this.mover = mover;
        int n = 18;
        GreenfootImage heroImage = getImage();
        int newHeight = heroImage.getHeight()/n;
        int newWidth = heroImage.getWidth()/n;
        heroImage.scale(newWidth,newHeight);
    }
    
    public void act()
    {
       setLocation(getX()-xMoveVal, getY()- yMoveVal);
       bouncingBall();
       bouncingIfTouchBlock();
       removeBall();
    }
    
    //Memantulkan bola
    public void bouncingBall(){
        
        
        if (getX() < 90 || getX() > 489)
        {
            xMoveVal = -xMoveVal;
        }
        
        else if (getY() < 55)
        {
            yMoveVal = -yMoveVal;
            
        }
        
        else if (isTouching(Mover.class) && this.mover.getX() < getX() + 50){
            yMoveVal = -yMoveVal;
            xMoveVal -= 3;
        }
        else if (isTouching(Mover.class) && this.mover.getX() > getX() - 20){
            yMoveVal = -yMoveVal;
            xMoveVal += 3;
        }
    }
    
    public void bouncingIfTouchBlock(){
        if(isTouching(block.class)){
            yMoveVal = yMoveVal * -1;
        }
    }
    
    public void removeBall(){
        if(isAtEdge()){
            getWorld().removeObject(this);
            
        }
    }
    
    
    
}
