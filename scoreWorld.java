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
    
    
  
    
    public scoreWorld()
    {    
       super(1600, 800, 1);
      addObject(new Total() ,(getWidth()-800), getHeight()-700); 
      addObject(new return4() ,(getWidth()/2), 650); 
          i=(Battle.time/60);
      if(i>0&&i<10){            
        i=i%10;
        addObject(new Number(i) ,807, 308);  
        }
     else if(i>=10&&i<20){
           i=i%10;
        addObject(new Number(1) ,807, 308);   
        addObject(new Number(i) ,807+150, 308);
    }
    else if(i>=20&&i<30){
           i=i%10;
        addObject(new Number(2) ,807, 308);  
        addObject(new Number(i) ,807+150, 308);
    }
    else if(i>=30&&i<40){
           i=i%10;
         addObject(new Number(3) ,807, 308);  
        addObject(new Number(i) ,807+150, 308);
    }
    else if(i>=40&&i<50){
           i=i%10;
           addObject(new Number(4) ,807, 308);  
        addObject(new Number(i) ,807+150, 308);
    }
    else  if(i>=50&i<60){
           i=i%10;
           addObject(new Number(5) ,807, 308);  
        addObject(new Number(i) ,807+150, 308);
    }
    else if(i>=60&&i<70){
           i=i%10;
           addObject(new Number(6) ,807, 308);  
        addObject(new Number(i) ,807+150, 308);
    }
    else if(i>=70&&i<80){
           i=i%10;
           addObject(new Number(7) ,807, 308);  
        addObject(new Number(i) ,807+150, 308);
    }
    else if(i>=80&&i<90){
           i=i%10;
           addObject(new Number(8) ,807, 308);  
        addObject(new Number(i) ,807+150, 308);
    }
    else if(i>=90&&i<100){
           i=i%10;
           addObject(new Number(9) ,807, 308);  
        addObject(new Number(i) ,807+150, 308);
      
    }
    else if(i>=100&&i<110){
           i=i%10;
           addObject(new Number(10) ,807, 308);  
        addObject(new Number(i) ,807+250, 308);
    }
    else if(i>=110&&i<120){
         i=i%10;
        addObject(new Number(11) ,807, 308);  
        addObject(new Number(i) ,807+150, 308);
    }
    else if(i>=120&&i<130){
        i=i%10;
        addObject(new Number(12) ,807, 308);  
        addObject(new Number(i) ,807+250, 308);
    }
    else if(i>=130&&i<140){
        i=i%10;
        addObject(new Number(13) ,807, 308);  
        addObject(new Number(i) ,807+250, 308);
    }
    else if(i>=140&&i<150){
        i=i%10;
        addObject(new Number(14) ,807, 308);  
        addObject(new Number(i) ,807+250, 308);
    }
    else if(i>=150&&i<160){
        i=i%10;
        addObject(new Number(15) ,807, 308);  
        addObject(new Number(i) ,807+250, 308);
    }
    else if(i>=160&&i<170) {
        i=i%10;
        addObject(new Number(16) ,807, 308);  
        addObject(new Number(i) ,807+250, 308);
    }
    else if(i>=170&&i<180){
           i=i%10;
        addObject(new Number(17) ,807, 308);  
        addObject(new Number(i) ,807+250, 308);
     }
     else {
         addObject(new Perfect() ,807, 308);  
        } 
        
    
    }
   
   
      
    

 
    
    
     
    
  
    
}




