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
    
    int speed = 3;
    public void act()
    {
        move(speed);
        addEnemy2();
        removeIfTouchShoot();
    }
    
    int Timer = 0;
    public void addEnemy2()
    {
        if (Timer==60){ //timer 3 detik ==> 60fps x 3s
            int speed = Greenfoot.getRandomNumber(4)+1;
            getWorld().addObject(new Enemy2(),600,Greenfoot.getRandomNumber(400)); 
            Timer=0;
        }else{
            Timer++; //akan terus bertambah sebelum 180
        }
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
