import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Mover1
{
    
    /**
     * Act - do whatever the Ball1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        setLocation(getX()-10, getY());
        setRotation(getRotation()+10);
      
   
        if(isTouching(Player.class)){
            play1();
           Greenfoot.setWorld(new scoreWorld());
        }
      

       remove();
     
    }   
    
    public void remove(){
        if(atWorldEdge()){
            getWorld().removeObject(this);
        }
    }
     public void play1(){
     Greenfoot.playSound("explosion.wav");   
    }

}
