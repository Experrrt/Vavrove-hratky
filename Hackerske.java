import java.util.Vector;


public class Parsovanie {
    String hello = "HelloWorld";
    String hello1 ="";
    String hello2 ="";
    int dlzka = hello.length();
    Vector vc = new Vector();
    public void parsuj(){
        for (int i = 0; i < dlzka-2; i++) {
            vc.add(hello.substring(i,i+3));
        }
        System.out.println(vc);
    
        for (int i = 0; i < 8; i++) {
             hello1 =(String)vc.get(i);
            for (int j = i; j < 8; j++) {
            //hello1 =(String)vc.get(i);
            hello2 =(String)vc.get(j);
            System.out.println(hello1.compareTo(hello2));
            
        }}
    }
    
    
    public static void main(String[]args){
        Parsovanie ps = new Parsovanie();
        ps.parsuj();
    }
}
