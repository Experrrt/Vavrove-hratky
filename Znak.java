import java.util.Scanner;

public class Znak {
    char znak='a';
    int samohlaska=0;
    Scanner scn = new Scanner(System.in);

    public void znaky(){

        //niesom si uple isty co myslel touto podmienkov vavro,radsej by som do tej podmienky dal while(true)cize podmienka sa bude opakovat do nekonecna
        while(znak!='0'){
            //samohlasku musime na zaciatku kazdeho loopu zas urcit na 0 lebo program si pamata este hodnotu samohlasky z predosleho loopu
            samohlaska=0;
            System.out.print("Zadajte znak:");
            //ked sme pracovali s cislami pisali sme scn.nextInt...pretoze je to int, ked ale chceme aby to co napiseme program chapal ako char(pismeno)tak to musime napisat ako charAt(0)
            znak = scn.next().charAt(0);
            //ten switch si bere premennu znak a v pripade ze by sa rovnal znak niektorej z hodnot pripocita k samohlaske 1
            switch(znak){
                case'a':
                case'e':
                case'i':
                case'o':
                case'u':
                case'y':
                case'A':
                case'E':
                case'I':
                case'O':
                case'U':
                case'Y':samohlaska++;
            }
            //ak pripocital 1 tak toto plati a while sa opakuje
            if(samohlaska>0){
                System.out.println("Znak " +znak+ " je samohlaska...");
            //ak to neplatilo kontrolujeme ci je v abeceda od A/a po Z/z
            }else{
                if((znak>='a' && znak<='z') || (znak>='A' && znak<='Z')){
                    System.out.println("Znak "+ znak + " je spoluhlaska...");
                //ak sa program dostane az sem tak to znamena ze znak nie je v abecede
                }else{
                    System.out.println("Znak "+ znak + " nie je v abecede...");

                }
            }
        }
    }

    public static void main(String[] args) {
        Znak zn = new Znak();
        zn.znaky();
    }

}
