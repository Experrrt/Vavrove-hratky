import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;
import java.util.Random;

public class minovePole {

    Random rnd = new Random();

    public minovePole(int velkostPola) {
            hotovePole(velkostPola);    
    }

    public void vypisPole(int velkostPola, Table tab, String[][]pole){
        for (int i = 0; i < velkostPola; i++) {
            for (int j = 0; j < velkostPola; j++) {
                tab.addCell(pole[i][j]);
            }
        }
        System.out.println();
        System.out.println(tab.render());
    }
    public void pridajMiny(int velkostPola,String[][]pole){
        for (int i = 0; i < velkostPola; i++) {
            for (int j = 0; j < velkostPola; j++) {
                int sanca = rnd.nextInt(100);
                    if (sanca < 30) {
                        pole[i][j] = " * ";
                    } else {
                        pole[i][j] = "   ";
                    }
            }
        }
    }
    public void vypocitaj(int velkostPola, String[][]X){
        int pocetMinOkolo;
        int C = velkostPola-1;
        for (int i = 0; i < velkostPola; i++) {
            for (int j = 0; j < velkostPola; j++) {
                if (X[i][j] == "   ") {
                    pocetMinOkolo = 0;
                        if (i == 0 && j == 0){
                            if(X[i][j+1]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i+1][j]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i+1][j+1]== " * "){
                                pocetMinOkolo+=1;
                            }
                        }
                        if (i == 0 && j == C){
                            if(X[i+1][j]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i+1][j-1]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i][j-1]== " * "){
                                pocetMinOkolo+=1;
                            }
                        }
                        if (i == C && j == 0){
                            if(X[i][j+1]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i-1][j+1]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i-1][j]== " * "){
                                pocetMinOkolo+=1;
                            }
                        }
                        if (i == C && j == C){
                            if(X[i-1][j]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i-1][j-1]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i][j-1]== " * "){
                                pocetMinOkolo+=1;
                            }
                        }
                        if (i == 0 && j != C && j != 0){
                            if(X[i+1][j]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i+1][j-1]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i+1][j+1]== " * "){
                             pocetMinOkolo+=1;
                            }
                            if(X[i][j-1]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i][j+1]== " * "){
                                pocetMinOkolo+=1;
                            }
                        }
                        if (i == C && j != C && j != 0){
                            if(X[i-1][j]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i-1][j-1]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i-1][j+1]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i][j-1]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i][j+1]== " * "){
                                pocetMinOkolo+=1;
                            }
                        }
                        if (j == velkostPola && i != C && i != 0){
                            if(X[i-1][j]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i+1][j-1]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i-1][j-1]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i+1][j]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i][j-1]== " * "){
                                pocetMinOkolo+=1;
                            }
                        }
                        if (j == C && i != C && i != 0){
                            if(X[i-1][j]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i+1][j-1]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i-1][j-1]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i+1][j]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i][j-1]== " * "){
                                pocetMinOkolo+=1;
                            }
                        }
                        if (j == 0 && i != C && i != 0){
                            if(X[i-1][j]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i+1][j+1]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i-1][j+1]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i+1][j]== " * "){
                                pocetMinOkolo+=1;
                            }
                            if(X[i][j+1]== " * "){
                                pocetMinOkolo+=1;
                            }
                        }
                        if (j < C && j > 0 && i > 0 && i < C){
                            if (X[i - 1][j - 1] == " * ") {
                                pocetMinOkolo += 1;
                            }
                            if (X[i - 1][j] == " * ") {
                                pocetMinOkolo += 1;
                            }
                            if (X[i - 1][j + 1] == " * ") {
                                pocetMinOkolo += 1;
                            }
                            if (X[i][j - 1] == " * ") {
                                pocetMinOkolo += 1;
                            }
                            if (X[i][j + 1] == " * ") {
                                pocetMinOkolo += 1;
                            }
                            if (X[i + 1][j - 1] == " * ") {
                                pocetMinOkolo += 1;
                            }
                            if (X[i + 1][j] == " * ") {
                                pocetMinOkolo += 1;
                            }
                            if (X[i + 1][j + 1] == " * ") {
                                pocetMinOkolo += 1;
                            }
                        }
                    X[i][j] = " " + pocetMinOkolo + " ";
                }
            }
        }
    }

    public void hotovePole(int velkostPola) {

        Table prazdne = new Table(velkostPola, BorderStyle.UNICODE_BOX, ShownBorders.ALL);
        Table miny = new Table(velkostPola, BorderStyle.UNICODE_BOX, ShownBorders.ALL);
        Table t = new Table(velkostPola, BorderStyle.UNICODE_BOX, ShownBorders.ALL);

        String[][] X = new String[velkostPola][velkostPola];
        String[][] prazdnep = new String[velkostPola][velkostPola];

        for (int i = 0; i < velkostPola; i++) {
            for (int j = 0; j < velkostPola; j++) {
                prazdnep[i][j]="   ";
            }
        }

       vypisPole(velkostPola, prazdne,prazdnep);
       pridajMiny(velkostPola,X);
       vypisPole(velkostPola, miny, X);
       vypocitaj(velkostPola, X);
       vypisPole(velkostPola, t, X);
       
      
        }
            
       
    }
