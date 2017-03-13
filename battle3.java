import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class battle3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class battle3 extends Battle
{
    Turret1 turret1= new Turret1();
    Turret2 turret2= new Turret2();
    Turret3 turret3= new Turret3();
    Player player = new Player();
      
    /**
     * Constructor for objects of class battle3.
     * 
     */
    public battle3()
    {    
        // uper(1600, 800, 1);
        addObject(new Reset3() ,(getWidth()/2-740), getHeight()+100); 
        addObject(turret1, (getWidth()/2)+700, getHeight()-700);
        addObject(turret2, (getWidth()/2)+600, getHeight()-400);  
        addObject(turret3, (getWidth()/2)+500, getHeight()-100); 
        addObject(player, (getWidth()/2)-600, getHeight()-400); 
          
    }

}
