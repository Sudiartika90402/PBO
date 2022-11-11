import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public void act(){
        addEnemy();
        addEnemy2();
    }

    int spawnTime = 0;
    public void addEnemy()
    {
        if (spawnTime==120){ 
            int speed = Greenfoot.getRandomNumber(4)+1;
            addObject(new Enemy(),600,Greenfoot.getRandomNumber(400)); 
            spawnTime=0;
        }else{
            spawnTime++; 
        }
    }
    
    int Timer = 0;
    public void addEnemy2()
    {
        if (Timer==180){ //timer 3 detik ==> 60fps x 3s
            int speed = Greenfoot.getRandomNumber(4)+1;
            addObject(new Enemy2(),600,Greenfoot.getRandomNumber(400)); 
            Timer=0;
        }else{
            Timer++; //akan terus bertambah sebelum 180
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,168,211);
        hero.setLocation(51,193);
        Enemy enemy = new Enemy();
        addObject(enemy,419,201);
    }
}
