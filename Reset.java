import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Reset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reset extends Actor
{
    /**
     * Act - do whatever the Reset wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            play();
        Greenfoot.setWorld(new battle1());    
        }
    }    
     public void play(){
     Greenfoot.playSound("button.wav");   
    }
}
