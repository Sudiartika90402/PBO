import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("up")&& getY()>=20){
            setLocation(getX(),getY()-3);
        }   
        if (Greenfoot.isKeyDown("down")&& getY()<=380){
            setLocation(getX(),getY()+3);
        }
        if (Greenfoot.isKeyDown("left")&& getX()>=50){
            setLocation(getX()-3,getY());
        }
        if (Greenfoot.isKeyDown("right")&& getX()<=550){
            setLocation(getX()+3,getY());
        }
    }
}
