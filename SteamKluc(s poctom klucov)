import java.util.Random;
import java.util.Vector;

public class GenerujKluc {
    Vector kluc = new Vector();
    String nTica = new String();
    Random rnd = new Random();
    int znak =0;
    int nahoda =0;

    public void generuj(int kolko,int nTic){
        for (int i = 0; i < kolko; i++) {
            nTica = new String();
            for (int j = 0; j < nTic; j++) {
                nahoda = rnd.nextInt(9)+1;
                if(nahoda <=5){
                    znak = rnd.nextInt(25)+65;
                    nTica +=(char)znak;
                }else{
                    znak = rnd.nextInt(10);
                    nTica +=znak;
                }
            }
            kluc.add(nTica);
        }
        System.out.println(kluc);
    }


    public static void main(String[]args){
        GenerujKluc gn = new GenerujKluc();
        gn.generuj(10,5);
    }
}
