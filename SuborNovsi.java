package subor;
import java.nio.file.Files;
import java.nio.file.Paths;
public class SuborNovsi {
    
    String udaje = new String();
    String[]osoby = null;
    String[]osoba = null;
    
    public void zober(){
    try{
        udaje = new String(Files.readAllBytes(Paths.get(".//src//subor//data.dat")));
        
    }catch(Exception ex){
        System.out.println("Nem");
        }
    
    }
    public void fetschuj(){
        osoby =udaje.split("EOR");
        
        for (int i = 0; i < osoby.length; i++) {
         osoba = osoby[i].split("EOI");
            System.out.println("♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
            System.out.println("Meno: "+osoba[0]);
            System.out.println("Tel: "+osoba[1]);
            System.out.println("Rc: "+osoba[2]);
            System.out.println("Adresa: "+ osoba[3]);
        }
    }
    
    public static void main(String[]args){
        SuborNovsi nc = new SuborNovsi();
        nc.zober();
        nc.fetschuj();
    }        
}
