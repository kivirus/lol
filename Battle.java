import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Battle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Battle extends World
{
   static int time;
    /**
     * Constructor for objects of class Battle.
     * 
     */
    public Battle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(1600, 800, 1);
        
        addObject(new Return() ,50, 50);  
        time=0;
    }
     public void act(){
        
            Timer();
           
        }
        
     public void Timer(){
             
              showText("Time  "+(time/60),540,80);
              time++;
            if(time/60==180){
                 Greenfoot.setWorld(new scoreWorld()); 
            }
     }
 
}
