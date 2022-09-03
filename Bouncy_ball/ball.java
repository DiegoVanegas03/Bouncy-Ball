import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        World m = getWorld();
        
        if(getX()>= m.getWidth() -5 || getX() <= 5){
              turn(45);
        }
        move(2);
        
         if(getY()>= m.getHeight() -5 || getY() <= 5){
                turn(90);
        }
        
    }
}
