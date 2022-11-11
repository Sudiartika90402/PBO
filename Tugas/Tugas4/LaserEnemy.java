import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserEnemy extends Actor
{
    /**
     * Act - do whatever the LaserEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public LaserEnemy(){
        GreenfootImage heroImage = getImage();
        int newHeight = heroImage.getHeight()/2;
        int newWidth = heroImage.getWidth()/2;
        heroImage.scale(newWidth,newHeight);
        setRotation(180);
    }
    int speed = 7;
    public void act()
    {
       move(speed);
       removeIfAtEdge();
    }
    
    public void removeIfAtEdge()
    {
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    
    
}
