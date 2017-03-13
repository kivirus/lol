import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Reset3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reset3 extends Actor
{
    /**
     * Act - do whatever the Reset3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            play();
        Greenfoot.setWorld(new battle3());    
        }
    }    
     public void play(){
     Greenfoot.playSound("button.wav");   
    } 
}
