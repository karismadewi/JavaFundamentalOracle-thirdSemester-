import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int laserCount = 0; 
    public int laserTiming = 10;     
    public hero hero = new hero();
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
    
        
    private void prepare()
    {
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
        
        if(Greenfoot.isKeyDown("space"))
        { 
            if(laserCount==laserTiming)
            {
                laserCount=0; 
                laser laser = new laser();  
                addObject(laser,hero.getX(),hero.getY());
            }
            laserCount++;
        }
        

        
    }
    

}
