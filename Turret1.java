import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hen3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turret1 extends Actor
{
     int i = 0;
    
 
        public void act() 
    {  
         setLocation(getX(), getY() + 3);
          if(getX() == (getWorld().getWidth()-1))
        {
           setLocation(0, getY());
        }
        else if(getX() == 0)
        {
           setLocation(getWorld().getWidth(), getY());
        }      
      
        if(getY() == (getWorld().getHeight()-1))
        {
           setLocation(getX(), 0);
        }
        else if(getY() == 0)
        {
           setLocation(getX(), getWorld().getHeight());  
        }
        shoot();
    } 
  
    public void shoot(){
        
        
            i++;
            if(i == 20){
                fire();
                i = 0;
            }
            
        
    }
   
      public void fire()
    { Bullet ball1=new Bullet();
      getWorld().addObject(ball1,getX(),getY()); 
      
    }
    
    
}