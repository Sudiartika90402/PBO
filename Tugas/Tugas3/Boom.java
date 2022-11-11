import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boom extends Actor
{
    /**
     * Act - do whatever the Boom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Boom(){
        GreenfootImage heroImage = getImage();
        int newHeight = heroImage.getHeight()/3;
        int newWidth = heroImage.getWidth()/3;
        heroImage.scale(newWidth,newHeight);
    }
    public void act()
    {
        explosion();
    }
    
    int Timer = 0;
    public void explosion(){
        if(Timer == 30){
            getWorld().removeObject(this);
        }
        else{
            Timer++;
        }
    }
}
