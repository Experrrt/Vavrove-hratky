import java.util.Random;
import java.util.Scanner;

public class BlackJack {

    int hrac = 0;
    int kasino = 0;

    public void zacniHru(){
        Scanner sken = new Scanner(System.in);
        String volba = "A";
        
        //vsetko co je vo while sa bude opakovat pokial bude platit podmienka(volba.equals...)
        while(volba.equals("A")||volba.equals("a")){

            Random karta = new Random();
            //do premennej hodnota sa da random cislo od 1-10
            int hodnota = karta.nextInt(9)+1;
            //hrac pouzivame na sucet vsetkych kariet
            hrac += hodnota;
            System.out.println("Aktualna hodnota je "+ hrac);

            if (hrac>21){
                System.out.println("Prehral si");
                System.exit(0);
            }
            
            System.out.println("Chces dalsiu kratu (A/N)");
            //toto rozhoduje o tom ci while bude pokracovat(ak bude moznost A/a tak sa zopakuje lebo podmienka bude platit)
            volba = sken.nextLine();
            
        }
        
        Random karta = new Random();
        //tu je while kvoli tomu ze na kazde zopakovanie sa pripocita hodnota od 1-10 pre kasino(dealera)
        //while bude pokracovat dovtedy kym bude sucet kariet splnat podmienku(kasino<=17) 
        while(kasino<=17){
            kasino+= karta.nextInt(9)+1;
            
        }
        //sem sa dostane ked sa vsetky while loopy ukoncia a zacne sa rozhodovat kto vyhral kto nie podla suctu kariet(kasino,hrac)
        if(kasino >21){
            System.out.println("Vyhral si (dealer ma:"+kasino+")");
            System.exit(0);
        }
        else if(hrac == kasino){
            System.out.println("Ramiza...");
            zacniHru();

        }
        else if(hrac <kasino){
            System.out.println("Prehral si(ty: "+hrac+" ; kasino " +kasino);
        }
        else if(hrac>kasino){
            System.out.println("Vyhral si(ty: "+hrac+" ; kasino " +kasino);
        }
    }

    public static void main(String[] args) {
        BlackJack bj = new BlackJack();
        bj.zacniHru();
    }

}
