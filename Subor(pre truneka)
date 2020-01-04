
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Vector;

public class Subor1IT {
    Vector vc = new Vector();
    String ziaci;
    String []udaje;

    public void FetchData(String file){

        try{
            ziaci = new String(Files.readAllBytes(Paths.get(".//src//subor//"+file)));


        }
        catch(Exception ex){
            System.out.println("Neplatne");
        }
        udaje =ziaci.split("EOR");
        for (int i = 0; i < udaje.length; i++) {
            vc.add(udaje[i]);
        }
        System.out.println(vc);
    }



    public static void main(String[] args) {
        Subor1IT sub = new Subor1IT();
        sub.FetchData("trieda1IT.dat");
    }

}
