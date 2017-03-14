import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class battle1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class battle1 extends Battle
{
  Turret1 turret1= new Turret1();
  Player player = new Player();

   public static long time;
    /**
     * Constructor for objects of class battle1.
     * 
     */
    public battle1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
     
       addObject(turret1, (getWidth()/2)+700, getHeight()-700);
       addObject(player, (getWidth()/2)-600, getHeight()-400);
       addObject(new Reset() ,1550, 50);  
       
       
    }
  
}
