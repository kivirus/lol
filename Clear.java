 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Clear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clear extends Mover1
{
    /**
     * Act - do whatever the Clear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(+7);
     if(isTouching(Bullet.class)){
           removeTouching(Bullet.class);
        }
       remove();
       
      
    }   
    
    public void remove(){
        if(atWorldEdge()){
            if(getX() >1500 && getY()>-1 ){
            getWorld().removeObject(this);
        }
        
        }
    }
}
