import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class laser extends Actor
{
    public int speed = 10;
    /**
     * Act - do whatever the laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed); 

        if(isTouching(enemy.class))
        {

            removeTouching(enemy.class);
            getWorld().removeObject(this);
             
        }
        else if(isAtEdge())
        {
            getWorld().removeObject(this);
        }

        // Add your action code here.
    }
    public laser()
    {
        
        
        
        
    }
}
