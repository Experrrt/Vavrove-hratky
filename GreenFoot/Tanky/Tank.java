import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tank here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tank extends Actor {
    int posun;
    String kHore, kDole, kDolava, kDoprava;

    public Tank(int posunZadanyManualne, int pociatocneOtocenie, String kHore, String kDole, String kDolava, String kDoprava) {
        this.posun = posunZadanyManualne;
        this.turn(pociatocneOtocenie);
        this.kHore = kHore;
        this.kDole = kDole;
        this.kDolava = kDolava;
        this.kDoprava = kDoprava;
    }

    public void act() {
        
        this.testujKlavesy();  
    }
    
    public void testujKlavesy(){
        if(Greenfoot.isKeyDown(this.kHore)){
            this.move(this.posun);
        }
        if(Greenfoot.isKeyDown(this.kDole)){
            this.move(-this.posun);
        }
        if(Greenfoot.isKeyDown(this.kDolava)){
            this.turn(-5);
        }
        if(Greenfoot.isKeyDown(this.kDoprava)){
            this.turn(5);
        }
    }
}
