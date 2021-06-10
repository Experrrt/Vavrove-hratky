import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyWorld extends World {

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Actor tank = new Tank(10,0,"up","down","left","right","space");
        this.addObject(tank,100,100);
        
        Actor tank1 = new Tank(10,0,"w","s","a","d","f");
        this.addObject(tank1,500,300);
    }
}
