import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kumbang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kumbang extends Actor
{
    /**
     * Act - do whatever the Kumbang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(5);
        setRotation(180);
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
