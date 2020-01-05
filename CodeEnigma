import java.util.Vector;
import java.util.Random;
import java.util.Scanner;

public class CodeEnigma {

    String stvorica = new String();
    Scanner sc = new Scanner(System.in);
    int znak =0;
    Random  rd = new Random();
    Vector sprava = new Vector();
    int dlzkaSpravy =0;

    public void generuj(){

        System.out.print("Zadajt dlzku spravy: ");
        dlzkaSpravy = sc.nextInt();
        //prvy for sa bude opakovat tolko krat kolko je dlzka spravy,takze on printne kazdu tu stvoricu
        for (int i = 0; i < dlzkaSpravy; i++) {
            stvorica = new String();
            //druhy for generuje kazdy znak stvorice a pridava ho do premennej stvorica(stvorica vyzera napriklad takto:ABCD)
            for (int j = 0; j < 4; j++) {
                znak = rd.nextInt(25)+65;
                stvorica += (char)znak;

            }
            //tu sa stvorica pridava do vectora sprava,takto to vyzera vo vectore [ABCD,EFGH], ak by to niekoho zaujimalo tak miesto stvorice ABCD v sprave ma index 0,EFGH ma index 1)
            sprava.add(stvorica);
            //oba if sa odporucam naucit naspamat lebo tie nevedel ani vavro :D
            //
            //tato podmienka pridava "-" na vsetky miesta okrem zaciatku a konca riadka
            if(i%20 !=0&&i!=dlzkaSpravy){
                System.out.print("-");
            }
            //tato podmienka roby novy riadok po 20 stvoriciach
            if(i%20 ==0&&i>0){
                System.out.println("");

            }
            //tu vyuzivame index storic v sprave, i sa na zaciatku rovna 0 takze to ide od prveho indexu(0) az po posledny
            System.out.print(sprava.elementAt(i));
        }
        
    }

    public static void main(String[] args) {
        CodeEnigma eng = new CodeEnigma();
        eng.generuj();
    }

}
