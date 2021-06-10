import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tank here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tank extends Actor {
    int posun, pocetNabojov = 10, casDobitia = 60;
    String kHore, kDole, kDolava, kDoprava, kFire;

    public Tank(int posunZadanyManualne, int pociatocneOtocenie, String kHore, String kDole, String kDolava, String kDoprava, String kFire) {
        this.posun = posunZadanyManualne;
        this.turn(pociatocneOtocenie);
        this.kHore = kHore;
        this.kDole = kDole;
        this.kDolava = kDolava;
        this.kDoprava = kDoprava;
        this.kFire = kFire;
    }

    public void act() {
        
        this.testujKlavesy(); 
        if(casDobitia>0){
         casDobitia--;
        }
     
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
        if(Greenfoot.isKeyDown(this.kFire)){
            this.strielaj();
        }
    }
    
    public void strielaj(){
        if(pocetNabojov>0 && casDobitia==0){
            pocetNabojov--;
            casDobitia = 60;
             
            World svet = this.getWorld();
            Strela strela = new Strela();
            int poziciaTankuX = this.getX();
            int poziciaTankuY = this.getY();
            
            svet.addObject(strela, poziciaTankuX, poziciaTankuY);
            int natocenieTanku = this.getRotation();
            
            strela.turn(natocenieTanku);
            strela.move(35);
        }
    }
}
