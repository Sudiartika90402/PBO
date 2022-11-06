import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy(){
        GreenfootImage heroImage = getImage();
        int newHeight = heroImage.getHeight()/5;
        int newWidth = heroImage.getWidth()/5;
        heroImage.scale(newWidth,newHeight);
        setRotation(180);
        heroImage.mirrorVertically();
    }
    
    int speed = 5;
    public void act()
    {
        move(speed);
        removeIfTouchShoot();
    }
    
    public void removeIfTouchShoot(){
        if(isTouching(Shoot.class)){
            getWorld().addObject(new Boom(), getX(), getY());
            removeTouching(Shoot.class);
            getWorld().removeObject(this);
        }
        else if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    
}
