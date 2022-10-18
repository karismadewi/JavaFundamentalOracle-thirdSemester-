import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int count=0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        hero hero = new hero();
        addObject(hero,54,221);
        
    }
    public int timing=10+Greenfoot.getRandomNumber(60);
    public void act()
    {
        int y = Greenfoot.getRandomNumber(720);  
        if(count==timing)
        {
            timing=10+Greenfoot.getRandomNumber(60);
            count=0; 
            enemy enemy=new enemy(); 
            addObject(enemy,1280,y); 
        }
        count++; 
    }
    

}
