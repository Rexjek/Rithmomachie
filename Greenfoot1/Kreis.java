import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kreis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kreis extends Actor
{
    /**
     * Act - do whatever the Kreis wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int Wert;
    public Kreis(int W)
        {
        
        Wert = W;
          //  this.getWorld().showText( Integer.toString(Wert), this.getX(), this.getY());
        }


    public void act() 
    {
        this.getWorld().showText( Integer.toString(Wert), this.getX(), this.getY());
        // Add your action code here.
    }    
}
