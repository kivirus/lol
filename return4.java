import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class return4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class return4 extends Actor
{
    /**
     * Act - do whatever the return4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this)){
            play();
        Greenfoot.setWorld(new Setting());    
        }
    }    
     public void play(){
     Greenfoot.playSound("button.wav");   
    } 
    
}
