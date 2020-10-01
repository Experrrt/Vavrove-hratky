import java.util.Scanner;

public class Piskvorky {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        String[] pole = new String[3];

        pole[0] = "O_OXXO_XX";
        pole[1] = "OXO__X_OX";
        pole[2] = "_XO__X___";
        
        for (int y = 0; y < 3; y++) {
            System.out.println("------------");
        
            int pocetX=0;
            int pocetY=0; 
    
            Boolean vyhralX=false;
            Boolean vyhralY=false;
            Boolean Prazdne=false;
            
            
            int lastIndex = 0;
            for (int i = 0; i < pole[y].length(); i += 3) {
                if(pole[y].charAt(i)==pole[y].charAt(i+1) && pole[y].charAt(i+2)==pole[y].charAt(i) && pole[y].charAt(i)!='_'){
                    if(pole[y].charAt(i)=='X')vyhralX=true; 
                    if(pole[y].charAt(i)=='O')vyhralY=true;   
                }
                else if(pole[y].charAt(i/3)==pole[y].charAt(i/3+3) && pole[y].charAt(i/3+6)==pole[y].charAt(i/3+3) && pole[y].charAt(i/3)!='_'){
                    if(pole[y].charAt(i/3)=='X')vyhralX=true; 
                    if(pole[y].charAt(i/3)=='O')vyhralY=true;   
                }
                else if(pole[y].charAt(0)== pole[y].charAt(8) && pole[y].charAt(8)==pole[y].charAt(4) || pole[y].charAt(2)== pole[y].charAt(6) && pole[y].charAt(6)==pole[y].charAt(4)){
                    if(pole[y].charAt(4)=='X')vyhralX=true; 
                    if(pole[y].charAt(4)=='O')vyhralY=true;   
                }                
                for (int z = lastIndex; z < i + 3; z++) {
                    lastIndex = z + 1;
                    System.out.print(pole[y].charAt(z) + " ");
                    if(pole[y].charAt(z)=='X')pocetX++;
                    else if(pole[y].charAt(z)=='O')pocetY++;
                    else if(pole[y].charAt(z)=='_')Prazdne=true;
                }
                System.out.println();
            }
            if(vyhralX && vyhralY || pocetX-pocetY>1 || pocetY-pocetX>1) System.out.println("Pole je chybne");
            else if((Prazdne && !vyhralY) && (Prazdne &&!vyhralX)) System.out.println("Hra nieje dokoncena");
            else if(!vyhralX && !vyhralY && !Prazdne) System.out.println("Remiza");
            else if(vyhralX) System.out.println("Vyhral krizik");
            else if(vyhralY) System.out.println("Vyhral kruzok");
        }
    }
}
