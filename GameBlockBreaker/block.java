import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class block extends Actor
{
    /**
     * Act - do whatever the block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public block(){
        int n = 5;
        GreenfootImage heroImage = getImage();
        int newHeight = heroImage.getHeight()/n;
        int newWidth = heroImage.getWidth()/6;
        heroImage.scale(newWidth,newHeight);
    }
    
    public void act()
    {
        removeIfTouchBall();        
    }
    
    public void removeIfTouchBall(){
        if(isTouching(Ball.class)){
            getWorld().removeObject(this);
        }
    }
}
