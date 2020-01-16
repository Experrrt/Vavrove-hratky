import java.util.Vector;
public class Pisomka {

    Vector vc = new Vector();
    String retazec = "dadozajtradostanesupuu";
    int dlzka = retazec.length();
    public void supaNa3casti(){

        String prvy = retazec.substring(0,dlzka/3);
        String druhy = retazec.substring(dlzka/3,2*dlzka/3);
        String treti = retazec.substring(2*dlzka/3,dlzka);
        System.out.println(prvy+"\n"+druhy+"\n"+treti);
    }

    public void parsujTrojice(){
        int index =0;
        String trojica;
        for (int i = 0; i < dlzka/3; i++) {
            trojica = retazec.substring(index, index+=3);
            vc.add(trojica);
        }
        System.out.println(vc);
    }
    public void parsujNtice(int ntice){
        int index =0;
        Vector nTica = new Vector();
        String trojica;
        for (int i = 0; i < dlzka/ntice; i++) {
            trojica = retazec.substring(index,index+ntice);
            index+=ntice;
            nTica.add(trojica);
        }
        System.out.println(nTica);
    }
    public static void main(String[] args) {
        Pisomka nc = new Pisomka();
        nc.supaNa3casti();
        nc.parsujTrojice();
        nc.parsujNtice(5);
    }

}
