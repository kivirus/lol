import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Reset2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reset2 extends Actor
{
    /**
     * Act - do whatever the Reset2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            play();
        Greenfoot.setWorld(new battle2());    
        }
    }    
     public void play(){
     Greenfoot.playSound("button.wav");   
    } 
}
