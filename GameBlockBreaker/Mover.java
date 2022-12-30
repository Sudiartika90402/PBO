import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mover extends Actor
{
    /**
     * Act - do whatever the Mover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Mover(){
        GreenfootImage heroImage = getImage();
        int newHeight = heroImage.getHeight()/3;
        int newWidth = heroImage.getWidth()/2;
        heroImage.scale(newWidth,newHeight);
        setRotation(180);
        heroImage.mirrorVertically();
    }
    
    public void act()
    {
        int i = 3;
        if((Greenfoot.isKeyDown("right") && getX() <= 419 )){
            setLocation(getX()+i, getY());
        }
        if((Greenfoot.isKeyDown("left") && getX() >= 158)){
            setLocation(getX()-i, getY());
        }
        
    }
}
