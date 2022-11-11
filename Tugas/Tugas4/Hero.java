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
    public Hero(){
        GreenfootImage heroImage = getImage();
        int newHeight = heroImage.getHeight()/5;
        int newWidth = heroImage.getWidth()/5;
        heroImage.scale(newWidth,newHeight);
    }
    public void act()
    {
        Spawnshoot();
        movingHero();
        gameOverIfTouchLaser();
    }
    
    public void movingHero(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-2);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+2);
        }
        if(Greenfoot.isKeyDown("left")&& getX()>=30){
            setLocation(getX()-2,getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+2,getY());
        }
    }
    
    int Timer = 0;
    public void Spawnshoot(){
        if(Timer == 30){
            getWorld().addObject(new Shoot(), getX()+40, getY());
            Timer = 0;
        }
        else{
            Timer++;
        }
    }
    
    public void gameOverIfTouchLaser(){
        if(isTouching(LaserEnemy.class)){
            getWorld().addObject(new GameOver(),300,200);
            removeTouching(LaserEnemy.class);
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
}
