import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   int ammo = 3 ;
   int reloadDelay = 9;

    int i = 0;
  
        public void act() 
    {  
        checkKeyPress();
   
        if(isTouching(Turret1.class)){
            play1();
            Greenfoot.setWorld(new scoreWorld());
        }
         if(isTouching(Turret2.class)){
             play1();
        Greenfoot.setWorld(new scoreWorld());
        }
         if(isTouching(Turret3.class)){
             play1();
         Greenfoot.setWorld(new scoreWorld());
        }
         
    }  


     public void play(){
     Greenfoot.playSound("clear.wav");   
    }
     public void play1(){
     Greenfoot.playSound("explosion.wav");   
    }
    
    public void checkKeyPress(){
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY() - 4);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY() + 4);
        }
        if(Greenfoot.isKeyDown("a")){
         
            setLocation(getX() - 4, getY());
        }
        if(Greenfoot.isKeyDown("d")){
         
            setLocation(getX() + 4, getY());
        }
         if (ammo > 0 && "space".equals(Greenfoot.getKey()))
            {

         fire();
         play();
        ammo--;
         }
      
        
     
    }
      public void fire()
    { Clear clear=new Clear();
      getWorld().addObject(clear,getX(),getY());  
    }
    
   
    
    
}
    
