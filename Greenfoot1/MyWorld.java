import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class MyWorld extends World
{
//public enum Richtung{l=0,r,o,u}
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        
      LegePfad(3, 2, 8, 3,2 ,2,3 ,3  );
         
      LegePfad(3, 3, 6, 3,3 ,2,2 ,3  );
      
      LegePfad(3, 4, 4, 3,3,4,4 ,3  );   

      LegePfad(3, 5, 2, 3,4,4,3 ,3  );
    }
    public void addStone(Actor Kreis, int x, int y)
    {
        addObject(Kreis,x*50+25,y*50+25);

    }

    public int updateX(int W, int x)
    {
    
     if (W == 1) {x=x+1;}
     if (W == 3) {x=x-1;}
    
     return x;
    }

    public int updateY(int W, int y)
    {
    
     if (W == 2) {y=y-1;}
      if (W == 4) {y=y+1;}
    
     return y;
    }
    public void LegePfad(int x, int y, int Wert, int s2, int s3, int s4, int s5, int s6)
    {
        int W;  
        addStone(new Kreis(Wert),x,y);
         x = updateX(s2,x); y=updateY(s2,y);
         W= Wert*Wert;

         addStone(new Kreis(W),x,y);
         x = updateX(s3,x); y=updateY(s3,y);     

         W= Wert*(Wert+1);
         addStone(new Kreis(W),x,y);
         x = updateX(s4,x); y=updateY(s4,y);   
         W= (Wert+1)*(Wert+1);
         addStone(new Kreis(W),x,y);
         x = updateX(s5,x); y=updateY(s5,y); 
         W= (Wert+1)*(2*Wert+1);
         addStone(new Kreis(W),x,y);
         x = updateX(s6,x); y=updateY(s6,y);
         W= (2*Wert+1)*(2*Wert+1);
         addStone(new Kreis(W),x,y);
    }
   
    
}
