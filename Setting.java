import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Setting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Setting extends World
{
Easy easy = new Easy();
Normal normal = new Normal();
Hard hard = new Hard();
    /**
     * Constructor for objects of class Setting.
     * 
     */
    public Setting()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1);
       addObject(easy,  ((getWidth()/2)), getHeight()-700);
       addObject(normal,((getWidth()/2)), getHeight()-400);
       addObject(hard,  ((getWidth()/2)), getHeight()-100);
    }
}
