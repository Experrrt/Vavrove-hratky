import java.util.Scanner;

public class Sifrovanie{
    String vstup ="";
    int index = 0;
    String trojica ="0";
    Scanner sc = new Scanner(System.in);

    public void parsuj(){
        System.out.print("Zadaj vstup: ");
        vstup = sc.nextLine();
        for (int i = 0; i < vstup.length()/3; i++) {
            trojica = new String();
            trojica = vstup.substring(index,index+=3);
            switch(trojica){
                case "123":System.out.println("111222333");break;
                case "abc":System.out.println("fdsfsdgsf");break;
                case "def":System.out.println("deffesfsd");break;
                case "HHH":System.out.println("Chichichacha");break;
            }
        }
    }
    public static void main(String[]args){
        Sifrovanie sf = new Sifrovanie();
        sf.parsuj();
    }
}
