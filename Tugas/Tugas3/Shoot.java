import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shoot extends Actor
{
    /**
     * Act - do whatever the Shoot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Shoot(){
        GreenfootImage heroImage = getImage();
        int newHeight = heroImage.getHeight()/25;
        int newWidth = heroImage.getWidth()/25;
        heroImage.scale(newWidth,newHeight);
    }
    
    int speed = 5;
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
