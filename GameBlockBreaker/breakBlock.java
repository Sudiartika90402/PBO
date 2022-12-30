import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class breakBlock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class breakBlock extends block
{
    /**
     * Act - do whatever the breakBlock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public breakBlock(){
        int n = 5;
        GreenfootImage heroImage = getImage();
        int newHeight = heroImage.getHeight()/n;
        int newWidth = heroImage.getWidth()/6;
        heroImage.scale(newWidth,newHeight);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
