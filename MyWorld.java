import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
   Title title = new Title();
   Start start = new Start();
   static int time;
   
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    static GreenfootSound mo = new GreenfootSound("song.wav");
    public MyWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1);
       addObject(title, (getWidth()/2), getHeight()-700);
       addObject(start, 807,249);
      addObject(new Howto(), 812, 419);
       int time=0;
       
    }
 
      
    
    public void started(){
        mo.play();
    }
     public void act(){   
    
     
     
    }


     public void play(){
     Greenfoot.playSound("button.wav");   
    }
    
}
