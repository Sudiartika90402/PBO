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
    public Mover mover = new Mover();
    public World myWorld;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        wall_1 wall_1 = new wall_1();
        addObject(wall_1,320,0);
        wall_2 left_wall = new wall_2();
        addObject(left_wall,0,265);
        wall_2 right_wall = new wall_2();
        addObject(right_wall,580,265);
        Scoreboard scoreboard = new Scoreboard();
        addObject(scoreboard,570,100);
        Scoreboard scoreboard2 = new Scoreboard();
        addObject(scoreboard2,570,210);
        Scoreboard scoreboard3 = new Scoreboard();
        addObject(scoreboard3,570,309);
        Ball ball = new Ball(mover, this);
        addObject(ball,290,375);
        Mover mover2 = new Mover();
        addObject(mover2,290,390);
        block block = new block();
        
        for(int j = 0; j < 4; j++){
            for(int i = 0; i < 5; i++){
            addObject(new block(),(i*80)+130,(j*33)+70);
            }
        }
    }
}

