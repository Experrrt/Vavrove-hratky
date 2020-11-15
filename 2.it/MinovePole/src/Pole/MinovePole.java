package Pole;

import java.util.Random;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;


public class MinovePole {
    String hraciePole[][];
    final int rozmer;

    public MinovePole(int rozmer){
        this.hraciePole = new String[rozmer][rozmer];
        this.rozmer = rozmer;
        
        umiestiMiny();
        zobrazPole();
        umiestiMiny();
        zobrazPole();
        prepocitaj();
        zobrazPole();
    }

    private void zobrazPole(){
        final Table table = new Table(rozmer, BorderStyle.UNICODE_BOX_WIDE, ShownBorders.ALL);
        for(int i=0;i<rozmer;i++){
            for(int y=0;y<rozmer;y++){
                table.addCell(hraciePole[i][y]);
            }
        }
        System.out.println(table.render());
    }
    
    private void umiestiMiny(){
        Random rnd = new Random();
       
        for(int i=0;i<rozmer;i++){
            for(int y=0;y<rozmer;y++){
                if(hraciePole[i][y]!=null){
                    if(rnd.nextInt(100)<50)hraciePole[i][y]="\u001B[31m"+"*"+"\u001B[0m";
                }else hraciePole[i][y]=" ";
            }
        }
    }

    private void prepocitaj(){
        for(int i=0;i<rozmer;i++){
            for(int y=0;y<rozmer;y++){
                int pocetVedla=0;
                
                if(hraciePole[i][y]==" "){
                    try{if(hraciePole[i][y-1].contains("*"))pocetVedla++;}catch(Exception e){}
                    try{if(hraciePole[i][y+1].contains("*"))pocetVedla++;}catch(Exception e){}
                    try{if(hraciePole[i-1][y].contains("*"))pocetVedla++;}catch(Exception e){}
                    try{if(hraciePole[i+1][y].contains("*"))pocetVedla++;}catch(Exception e){}
                    try{if(hraciePole[i-1][y+1].contains("*"))pocetVedla++;}catch(Exception e){}
                    try{if(hraciePole[i+1][y+1].contains("*"))pocetVedla++;}catch(Exception e){}
                    try{if(hraciePole[i-1][y-1].contains("*"))pocetVedla++;}catch(Exception e){}
                    try{if(hraciePole[i+1][y-1].contains("*"))pocetVedla++;}catch(Exception e){}
                    
                    hraciePole[i][y]=Integer.toString(pocetVedla);
                }
            }
        }
    }
}
