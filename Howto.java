import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Howto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Howto extends Actor
{
    /**
     * Act - do whatever the Howto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {  
        if(Greenfoot.mouseClicked(this)){
            play();
        Greenfoot.setWorld(new How());    
        }
    }    
     public void play(){
     Greenfoot.playSound("button.wav");   
    }  
}
