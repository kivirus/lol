import java.util.List;  

 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class scoreWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scoreWorld extends World
{

    /**
     * Constructor for objects of class scoreWorld.
     * 
     */
   
   

   
    static int time;
    static int i ;
     Number blank = null;
    
    int check = 0;
    
    public scoreWorld()
    {    
       super(1600, 800, 1);
      addObject(new Total() ,(getWidth()-800), getHeight()-700); 
     
          i=(Battle.time/60);
      if(i>0&&i<10){            
        i=i%10;
        addObject(new Number(i) ,(getWidth()/2), getHeight()/2);  
        }
     else if(i>=10&&i<20){
           i=i%10;
        addObject(new Number(1) ,(getWidth()/2), getHeight()/2);   
        addObject(new Number(i) ,(getWidth()/2+150), getHeight()/2);
    }
    else if(i>=20&&i<30){
           i=i%10;
        addObject(new Number(2) ,(getWidth()/2), getHeight()/2);  
        addObject(new Number(i) ,(getWidth()/2+150), getHeight()/2);
    }
    else if(i>=30&&i<40){
           i=i%10;
         addObject(new Number(3) ,(getWidth()/2), getHeight()/2);  
        addObject(new Number(i) ,(getWidth()/2+150), getHeight()/2);
    }
    else if(i>=40&&i<50){
           i=i%10;
           addObject(new Number(4) ,(getWidth()/2), getHeight()/2);  
        addObject(new Number(i) ,(getWidth()/2+150), getHeight()/2);
    }
    else  if(i>=50&i<60){
           i=i%10;
           addObject(new Number(5) ,(getWidth()/2), getHeight()/2);  
        addObject(new Number(i) ,(getWidth()/2+150), getHeight()/2);
    }
    else if(i>=60&&i<70){
           i=i%10;
           addObject(new Number(6) ,(getWidth()/2), getHeight()/2);  
        addObject(new Number(i) ,(getWidth()/2+150), getHeight()/2);
    }
    else if(i>=70&&i<80){
           i=i%10;
           addObject(new Number(7) ,(getWidth()/2), getHeight()/2);  
        addObject(new Number(i) ,(getWidth()/2+150), getHeight()/2);
    }
    else if(i>=80&&i<90){
           i=i%10;
           addObject(new Number(8) ,(getWidth()/2), getHeight()/2);  
        addObject(new Number(i) ,(getWidth()/2+150), getHeight()/2);
    }
    else if(i>=90&&i<100){
           i=i%10;
           addObject(new Number(9) ,(getWidth()/2), getHeight()/2);  
        addObject(new Number(i) ,(getWidth()/2+150), getHeight()/2);
      
    }
    else if(i>=100&&i<110){
           i=i%10;
           addObject(new Number(10) ,(getWidth()/2), getHeight()/2);  
        addObject(new Number(i) ,(getWidth()/2+140), getHeight()/2);
    }
    else if(i>=110&&i<120){
         i=i%10;
        addObject(new Number(11) ,(getWidth()/2), getHeight()/2);  
        addObject(new Number(i) ,(getWidth()/2+150), getHeight()/2);
    }
    else if(i>=120&&i<130){
        i=i%10;
        addObject(new Number(12) ,(getWidth()/2), getHeight()/2);  
        addObject(new Number(i) ,(getWidth()/2+150), getHeight()/2);
    }
    else if(i>=130&&i<140){
        i=i%10;
        addObject(new Number(13) ,(getWidth()/2), getHeight()/2);  
        addObject(new Number(i) ,(getWidth()/2+150), getHeight()/2);
    }
    else if(i>=140&&i<150){
        i=i%10;
        addObject(new Number(14) ,(getWidth()/2), getHeight()/2);  
        addObject(new Number(i) ,(getWidth()/2+150), getHeight()/2);
    }
    else if(i>=150&&i<160){
        i=i%10;
        addObject(new Number(15) ,(getWidth()/2), getHeight()/2);  
        addObject(new Number(i) ,(getWidth()/2+150), getHeight()/2);
    }
    else if(i>=160&&i<170) {
        i=i%10;
        addObject(new Number(16) ,(getWidth()/2), getHeight()/2);  
        addObject(new Number(i) ,(getWidth()/2+150), getHeight()/2);
    }
    else if(i>=170&&i<180){
           i=i%10;
        addObject(new Number(17) ,(getWidth()/2), getHeight()/2);  
        addObject(new Number(i) ,(getWidth()/2+150), getHeight()/2);
     }
     else {
         addObject(new Perfect() ,(getWidth()/2), getHeight()/2);  
        } 
        
    
    }
   
    public void act(){
     
      checkKeyPress();   
   
    }
      
    

 
    public void checkKeyPress(){
        if(Greenfoot.isKeyDown("r")){  
          Greenfoot.setWorld(new MyWorld());
            }
        

         }
    
     
    
     public void stop(){
        MyWorld.mo.stop();
    }
    
}




