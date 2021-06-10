import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Strela here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Strela extends Actor
{
    public void act() 
    {
        this.move(10);

        if(this.isAtEdge()){
            World svet = this.getWorld();
            svet.removeObject(this);
        }else{
            
            if(this.isTouching(Tank.class)){
                World svet = this.getWorld();
                Actor tank = this.getOneIntersectingObject(Tank.class);
                svet.removeObject(tank);
                svet.removeObject(this);
            }
        }  
    }    
}
