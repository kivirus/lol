import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class How here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class How extends World
{

    /**
     * Constructor for objects of class How.
     * 
     */
    public How()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1); 
         addObject(new return2(), (getWidth()/2), getHeight()-100);
       addObject(new ints(), ((getWidth()/2)), getHeight()-500);
    }
}
