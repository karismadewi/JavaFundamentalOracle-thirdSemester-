import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int speed; 
    public enemy()
    {
        speed = 2+Greenfoot.getRandomNumber(8);
        setRotation(180);
    }
    
    public void act()
    {
        move(speed);
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }

    }
    
}
