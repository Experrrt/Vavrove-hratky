import java.util.Random;
public class SteamKluce {
    Random rd = new Random();
    int sanca = 0;

    public void generuj(){
        for(int i =1;i<=300;i++){
            for (int y =0;y<5;y++){
                sanca =rd.nextInt(9)+1;
                if(sanca <=5){
                    sanca=rd.nextInt(25)+65;
                    System.out.print((char)sanca);
                }
                else {
                    System.out.print(rd.nextInt(10));
                }
            }
            if(i%3!=0) {
                System.out.print("-");
            }
            if(i%3==0){
                System.out.println();
            }
        }
    }

public static void main (String[]args){
    SteamKluce st = new SteamKluce();
    st.generuj();
    }
}

