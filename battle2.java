import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class battle2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class battle2 extends Battle
{
     Turret1 turret1= new Turret1();
     Turret2 turret2= new Turret2();
     Player player = new Player();
     
    /**
     * Constructor for objects of class battle2.
     * 
     */
    public battle2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       addObject(new Reset2() ,(getWidth()/2-740), getHeight()+100);  
       addObject(turret1, (getWidth()/2)+700, getHeight()-700);
       addObject(turret2, (getWidth()/2)+600, getHeight()-500);  
       addObject(player, (getWidth()/2)-600, getHeight()-400);
       
    }
       
}
